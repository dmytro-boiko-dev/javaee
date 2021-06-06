package games;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class IrregularVerbs {
    public static void main(String[] args) throws IOException {

    // FILE --------------------------------------------------------
        File file = new File("verbs.txt");

        byte[] fileContent = Files.readAllBytes(file.toPath());
//
//        for(byte b : fileContent){
//            System.out.print(b + " ");
//        }

//        try {
//            Scanner scanner = new Scanner(file);
//
//            if (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//

        System.out.println("After words;");



//  SWITCH --------------------------------------------------------


        //        Scanner scanner = new Scanner(System.in);


//        switch (verb) {
//            case "cut":
//                System.out.println("Correct answer: cut");
//                break;
//
//            case "was":
//                System.out.println("Wrong verb");
//                break;
//
//            case "bought":
//                System.out.println("Wrongest verb ever!");
//                break;
//
//            default:
//                System.out.println("Enter a verb!");
//        }

//  IF  --------------------------------------------------------
//        if (verb.equals("cut")) {
//            System.out.println("Correct!");
//        } else {
//            System.out.println("Wrong!");
//        }


    }


}
