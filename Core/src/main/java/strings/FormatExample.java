package strings;

import java.util.StringJoiner;

public class FormatExample {
    public static void main(String[] args) {

        int a = 834_000;
        int b = 1_200_000;

        String str = String.format("You have earned %s experience and %s gold.", a, b);

        System.out.println(str);




    }
}
