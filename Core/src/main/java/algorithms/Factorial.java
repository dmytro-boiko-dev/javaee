package algorithms;

public class Factorial {
    public static void main(String[] args) {
//        long res = fact(7);
//        long res1 = factCycle(7);
//        System.out.println("Result: " + res);
//        System.out.println("Res cycle" + res1);

        int[] array = {0, 9, -3, 12, 4, 1, 99, 10, 8};

    }

    static long fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    static long factCycle(int n) {
        int res = 1;
        for (int i = 0; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    static int maxElement(int[] array) {

        int current =  0;
        if (array[0] > current){
            return array[0];
        } else {
            return current;
        }

//        return 0;
    }
}
