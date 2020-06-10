package javateam4.lesson7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {

        int[] array = {7, 2, 5, 9, 1, 0, 3};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        while (isSorted != true) {

            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    swap(array, i, i+1);
                }
            }
        }

        System.out.println("Массив отсортированный по возрастанию:");
        System.out.println(Arrays.toString(array));


        boolean isSorted1 = false;
        while (isSorted1 != true) {

            isSorted1 = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted1 = false;

                    swap(array, i, i+1);

                }
            }
        }

        System.out.println("Массив отсортированный по убыванию:");
        System.out.println(Arrays.toString(array));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");


        String[] strArray = {"Iliya", "Andrei", "Marina", "Vlad", "Maria"};
        System.out.println(Arrays.toString(strArray));

        Arrays.sort(strArray);

        System.out.println(Arrays.toString(strArray));

        Arrays.sort(strArray, Collections.reverseOrder());

        System.out.println(Arrays.toString(strArray));


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        int[] arrInt = {78, 100500, 165, 0, -5, 12, 1};
        System.out.println(Arrays.toString(arrInt));

        Arrays.sort(arrInt);

        System.out.println(Arrays.toString(arrInt));



        // Task #1
        // Задать массив целых чисел длинной N элементов,
        // поменять 1-й и последний элемент местами, вывести массив на экран.

        // {5, 3, 1, 0, 9, 6, 12}
        // sout

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        int[] firstLast = {5, 3, 1, 0, 9, 6, 12, 12, 64, 12, 3, 1, 4, 88};
        System.out.println(Arrays.toString(firstLast));

        int buffer;

        buffer = firstLast[0];
        firstLast[0] = firstLast[ firstLast.length - 5 ];
        firstLast[firstLast.length-5] = buffer;
        System.out.println(Arrays.toString(firstLast));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Копия такой же длины как оригинал:");

        int[] original = {23, 56, 71, 12, 1, 0, 57, 92};
        System.out.println("Original:   " + Arrays.toString(original));

        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copy:       " + Arrays.toString(copy));

        System.out.println("Копия меньшей длины:");
        int[] copyThree = Arrays.copyOf(original, 3);
        System.out.println("Copy 3:     " + Arrays.toString(copyThree));

        System.out.println("Копия большей длины:");
        int[] copyBig = Arrays.copyOf(original, 12);
        System.out.println("Copy 3:     " + Arrays.toString(copyBig));

    }

    public static void swap(int[] change, int index1, int index2) {
        int temp = change[index1];
        change[index1] = change[index2];
        change[index2] = temp;
    }
}