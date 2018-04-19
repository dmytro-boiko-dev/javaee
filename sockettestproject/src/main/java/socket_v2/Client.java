package socket_v2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Thread client = getClient();
        client.start();
        Thread client2 = getClient();
        client2.start();
    }

    private static Thread getClient() {
        return new Thread() {
            public void run() {
                try {
                    Socket clientSocket = new Socket("localhost", 9999);
                    InputStream inputStream = clientSocket.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


                    OutputStream outputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream), true);

                    String messages[] = {"msg1", "msg2", "msg3"};

                    for (String msg : messages) {
                        printWriter.println(msg.concat(Thread.currentThread().getName()));
                        String messageFromServer = bufferedReader.readLine();
                        System.out.println("Server answer::: " + messageFromServer);
                    }


                    printWriter.close();
                    bufferedReader.close();

                } catch (Exception e) {
                }
            }
        };
    }
}
