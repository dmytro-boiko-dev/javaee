package socket_v3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) throws IOException {

        InetSocketAddress address = new InetSocketAddress("localhost", 9999);
        SocketChannel client = SocketChannel.open(address);

        String messages[] = {"msg1", "msg2", "msg3"};
        for (String msg : messages) {
            client.write(ByteBuffer.wrap(msg.getBytes()));
        }

        client.close();
    }
}
