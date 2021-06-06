package system_methods;

import java.util.Arrays;

public class ArrayCopyExmpl {
    public static void main(String[] args) {

        int[] array = {-8, 26, 42, 5, 0, -3, 1};
        System.out.println("original: " + Arrays.toString(array));

        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        System.out.println("copy    : " + Arrays.toString(copy));
    }
}
