package arrays;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgs();
    }

    private static void varArgs(double... args) {
        double a = 3.14;
        double b = 1.37;
        double c = 2.98;
        double d = 4.95;

        System.out.println("Average of 2 numbers: " + calcAverage(a, b));
        System.out.println("Average of 3 numbers: " + calcAverage(a, b, c));
        System.out.println("Average of 4 numbers: " + calcAverage(a, b, c, d));


        int[] arrayInt = {1,2,3,4,5};
        int[] arrayCopy = Arrays.copyOf(arrayInt, 8);
        System.out.println(Arrays.toString(arrayCopy));


    }

    private static double calcAverage(double... args) {
        double sum = 0;
        for (double i : args) {
            sum = sum + i;
        }
        return sum / args.length;
    }
}
