package javateam4.lesson4;

public class MainClass {
    public static void main(String[] args) {

        int month = 13;
        String season = null;

        // || - оператор ИЛИ


        if (month == 12 || month == 1 || month == 2){
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5){
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8){
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11){
            season = "Autumn"; // Fall
        }

//        System.out.println(season);







        // && - AND или И

        int math = 45;
        int chemistry = 86;

        if (math >= 90 && chemistry >= 90){
            System.out.println("Получаем новый iPhone");
        } else if (math > 85 || chemistry > 85) {
            System.out.println("Получаем новые наушники");
        } else {
            System.out.println("Получаем чертей");
        }




        // high <= 40
        // width <= 55
        // length <= 20
        // weight <= 21















    }
}
