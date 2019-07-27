import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

    public static void main(String... args){

        String currency = " euro";
        int number = 1; // 2'000'000
        long longNumber = 1; // 4'000'000;
        float price = 19.99f;
        boolean salary = true;

        for (int i = 0; i < 3; i++) {

            number = number * 2;
            System.out.println("Operation #:" + i + "; Value: " + number);
        }

        currentTime();
    }

    public static void currentTime (){

        Date date = new Date();
        long time = date.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println(dateFormat.format(time));

    }
}
