package socket_v3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class Server {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(9999));
        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            int countClient = selector.select();// количество готовых клиентов
            if(countClient == 0){
                continue;
            }

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while(iterator.hasNext()){

                SelectionKey selectionClientKey = iterator.next();
                iterator.remove();

                if(!selectionClientKey.isValid()){
                    continue;
                }

                if(selectionClientKey.isAcceptable()){
                    //SelectableChannel channel = selectionClientKey.channel();
                    ServerSocketChannel channel = (ServerSocketChannel) selectionClientKey.channel();

                    SocketChannel clientChannel = channel.accept();
                    clientChannel.configureBlocking(false);
                    clientChannel.register(selector, SelectionKey.OP_READ);


                }else if (selectionClientKey.isReadable()){
                    //считывание со стороны клиента данных
                    SocketChannel clientChannel = (SocketChannel) selectionClientKey.channel();

                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

                    int originalSize = 0;
                    while((originalSize = clientChannel.read(byteBuffer)) > 0) {
                        byte buf[] = new byte[originalSize]; //копировать массив чтоб обрезать лишние байты
                        System.arraycopy(byteBuffer.array(), 1, buf, 0, originalSize);
                        System.out.println(new String(buf));
                        byteBuffer.clear();
                    }

                    clientChannel.close();
                }

            }
        }
    }
}
