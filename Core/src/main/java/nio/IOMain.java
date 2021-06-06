package nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain {

    private static final String FILE_NAME = "temporary.txt";

    public static void main(String[] args) throws IOException {

        String dataToWrite = "Hello, プログラマー !";
        writeFile(dataToWrite);

        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String dataToRead;
        while ((dataToRead = reader.readLine()) != null) {
            System.out.println(dataToRead);
        }
    }

    private static void writeFile(String data) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(data);
        }
    }
}
