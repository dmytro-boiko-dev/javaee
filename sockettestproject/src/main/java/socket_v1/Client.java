package socket_v1;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 9999);
        InputStream inputStream = clientSocket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));



        OutputStream outputStream = clientSocket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream), true);

        String messages[] = {"msg1", "msg2", "msg3"};

        for(String msg : messages){
            printWriter.println(msg);
            String messageFromServer = bufferedReader.readLine();
            System.out.println("Server answer::: " + messageFromServer);
        }

        printWriter.close();
        bufferedReader.close();

    }
}
