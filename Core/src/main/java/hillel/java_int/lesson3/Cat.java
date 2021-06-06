package hillel.java_int.lesson3;

public class Cat {
    public static void main(String[] args) {

        String name = "Spyki";
        boolean tail = true;

        int black = 5;
        int red = 12;

        countTotalTwo( black, red ); // 5  12

        int white = 8;
        int spotted = 14;

        countTotalTwo(white, spotted);

        countTotalFour(black, red, white, spotted);

        printCat(name, tail);

    }

    public static void countTotalTwo(int a, int b){ // 5 12

        int total = a + b;

        System.out.println( "Total of 2 types = " + total);
    }

    public static void countTotalFour(int a, int b, int c, int d){

        int total = a + b + c + d;
        System.out.println( "Total of all types = " + total);
    }

    public static void printCat(String name, boolean tail){
        System.out.println("Name: " + name + ", tail: " + tail);
    }




}
