import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        long currentDate = date.getTime();
        System.out.println(currentDate);


    }
}
