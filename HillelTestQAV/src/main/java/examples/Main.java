package examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main (String... args) {

        String message = "Hello Automation!";
        int number = 1;
        float price = 12.99f;
        boolean switcher = false;

        System.out.println(number);
        for (int i = 0; i < 15; i++) {

            number = number * 2;
            System.out.println(number);
        }

        showCurrentTime();


    }

    private static void showCurrentTime(){
        Date date = new Date();
        long time = date.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(time));
    }
}
