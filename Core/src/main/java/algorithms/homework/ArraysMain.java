package algorithms.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraysMain {
    public static void main(String[] args) {
    // Есть два массива цифр А и В, узнать сколько раз встречаются в массиве В цифры из массива А

    // variant #1 - O(n)

        int a[] = {5, 1, 19, 4, 8, 0, 43, 36};
        int b[] = {1, 6, 2, 18, 3, 4, 43, 11};
        int count = 0;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i])
                    count++;
            }
        }
        System.out.println("Variant #1: " + count);

    // variant #2

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(5);
        setA.add(1);
        setA.add(19);
        setA.add(4);
        setA.add(8);
        setA.add(0);
        setA.add(43);
        setA.add(36);

        setB.add(5);
        setB.add(1);
        setB.add(19);
        setB.add(4);
        setB.add(8);
        setB.add(0);
        setB.add(43);
        setB.add(36);

        Set<Integer> both = new HashSet<>();
        



        //compare.retainAll(setA);

    }
}
