import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CurrentDate {
//    public static void main(String[] args) {
//        Date date = new Date();
//        long currentDate = date.getTime();
////        System.out.println(currentDate);
//
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.add(Calendar.DATE, -7);
//        Date neededDate = calendar.getTime();
//
//        System.out.println(neededDate);
//    }


    public static void main(String[] args) {

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        String dayValue = String.valueOf(dayOfMonth);
        int day = Integer.parseInt(dayValue);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(year, month, day);
        Date time = calendar.getTime();
        System.out.println(time); // Thu Aug 01 15:18:58 EEST 2019

        int sevenDays = 7;
        int someDay = day - sevenDays;

        if (someDay < 1) {
            month = month - 1;
//            day = day +
        }


//        Date startDate;

//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        System.out.println("day of week: " + dayOfWeek); // debug
//        int daysToMonday = dayOfWeek - 2;
//        calendar.add(Calendar.DATE, -daysToMonday);
//        startDate = calendar.getTime();
//        System.out.println("Monday: " + startDate);


//        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR)); // 31 week
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK) - 1); // 4 day of week (thursday)
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 213 day of year
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 1 day of month
//        System.out.println(calendar.get(Calendar.MONDAY)); // ???


    }
}
