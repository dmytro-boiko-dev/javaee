package javateam3.lesson7;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {


        int[] array = {5, 2, 16, 8, 9, 0, 3, 1};
        System.out.println("Оригинал:        " + Arrays.toString(array));

        int[] copy1 = Arrays.copyOf(array, array.length);
        System.out.println("Копия1:          " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOf(array, 3);
        System.out.println("Копия2:          " + Arrays.toString(copy2));


        int[] copy3 = Arrays.copyOf(array, 16);
        System.out.println("Копия2:          " + Arrays.toString(copy3));
    }
}
