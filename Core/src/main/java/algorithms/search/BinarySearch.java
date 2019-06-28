package algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {-2, 1, 2, 4, 5, 7, 8, 13, 43};
//        boolean result = binarySearchRecursive(array, 8, -2, 43);
        boolean result = binarySearchIterative(array, 8);
        System.out.println("X founded = " + result);

    }

    private static boolean binarySearchRecursive(int[] array, int x, int left, int right) {

        if (left > right) {
            return false; // массив не отсортирован
        }

        int mid = (left + right) / 2;
        if (array[mid] == x) {
            return true; // середина совпала с искомым, искать нечего не будем
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    private static boolean binarySearchIterative(int[] array, int x) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
