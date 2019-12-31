package strings;

import java.util.Date;
import java.util.Timer;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!!!";

//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());
//
//        String sub = str1.substring(1, 3);
//        System.out.println("Substring: " + sub);

        long before = System.nanoTime();
        String conc = str1 + str2 + str3;
        long after = System.nanoTime();
        System.out.println("   +   : " + (after - before));

        long before2 = System.nanoTime();
        String  conc2 = str1.concat(str2).concat(str3);
        long after2 = System.nanoTime();
        System.out.println("Concat : " + (after2 - before2));

        long before3 = System.nanoTime();
        String conc3 = new StringBuilder().append(str1).append(str2).append(str3).toString();
        long after3 = System.nanoTime();
        System.out.println("Append : " + (after3 - before3));


//        System.out.println(str1);
//        String rep1 = str1.replace('l', 't');
//        String rep2 = rep1.replace('H', 'G');
//        System.out.println(rep2);

    }
}
