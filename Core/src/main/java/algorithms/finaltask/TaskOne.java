package algorithms.finaltask;

import java.util.HashSet;

// Дано 2 массива целых чисел. Узнать, состоит ли один из них только из чисел, которые есть в другом.
public class TaskOne {

    public static void main(String[] args) {

        int[] a = {1,2,3,23,2,5,7};
        int[] b = {1,3,4,5,9,2,76,0,8,4};

        boolean contains = isFirstContainsSecond(a, b);
        System.out.println("A consists of B: " + contains);
    }


    private static boolean isFirstContainsSecond(int[] a, int[] b) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            setA.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    setB.add(a[j]);
                    break;
                }
            }
        }

//        Debug
//        for (int temp : setA) {
//            System.out.print(temp + " ");
//        }
//        System.out.println("");
//        for (int temp : setB) {
//            System.out.print(temp + " ");
//        }
//        System.out.println("");

        for (int i = 0; i < setA.size(); i++) {
            if (setA.equals(setB)) return true;
        }

        return false;
    }
}
