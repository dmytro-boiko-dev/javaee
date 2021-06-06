package convertors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FIleToByteArray {
    public static void main(String[] args) throws IOException {

//        File file = new File("src/main/resources/verbs.txt");
        File file = new File("src/main/resources/jpg2pdf.pdf");

        byte[] fileContent = Files.readAllBytes(file.toPath());



        int count = 0;
        for(byte b : fileContent){
            count++;

            if (count == 30){
                count = 0;
                System.out.println();
            }
            System.out.print(b + ", ");
        }

        System.out.println();
        System.out.println("count = " + count);
    }
}
