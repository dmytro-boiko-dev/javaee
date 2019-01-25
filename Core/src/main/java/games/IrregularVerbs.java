package games;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class IrregularVerbs {
    public static void main(String[] args) {

    // FILE --------------------------------------------------------
        File file = new File("files/verbs.txt");

        try {
            Scanner scanner = new Scanner(file);

            if (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


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
