package socket_v1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while(true){
            Socket clientSocket = serverSocket.accept(); //catch the client request
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream), true);

            String messageFromClient = "";
            while ((messageFromClient = bufferedReader.readLine()) != null){
                System.out.println("Message from client::: " + messageFromClient);
                printWriter.println(messageFromClient.toUpperCase());
            }

            printWriter.close();
            bufferedReader.close();

        }
    }
}
