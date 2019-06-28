package algorithms.sorting;

public class Sorting {
    public static void main(String[] args) {
        int array[] = {5, 7, 2, 3, 1};
        bubbleSort(array);
        insertSort(array);
        quickSort(array, 0, array.length - 1);

    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        if (leftBorder >= rightBorder) return;

        int right = rightBorder;
        int left = leftBorder;


        int pivot = (left + right) / 2;
        while(left < right){
            // ищем слева элемент больше опорного
            while(left < pivot && array[left] < array[pivot])
                left++;

            while(right > pivot && array[right] > array[pivot])
                right--;
            swap(array, left, right);
            if(left == pivot) pivot = right;
            if(right == pivot) pivot = left;
        }
        quickSort(array, leftBorder, pivot-1);
        quickSort(array, pivot+1, rightBorder);
    }

    private static int binarySearch(int[] arr, int index) {
        int number = arr[index]; // искомое число
        int left = 0;
        int right = index - 1;
        int resultPosition = 0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == number) {
                resultPosition = middle;
                break;
            } else if (arr[middle] > number) {
                right = middle;
            } else if (arr[middle] < number) {
                left = middle;
            }
            if (left == right) {
                if (arr[left] > number) return left - 1;
            } else return left;
        }
        return resultPosition;
    }


    // insertion sorting
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            linearSort(arr, i);
        }

    }

    private static void linearSort(int[] arr, int i) {
        while (i > 0 && arr[i - 1] >= arr[i]) {
            swap(arr, i, i - 1);
            i++;
        }
//        System.out.print(arr);
    }

    // bubble search
    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, i, j);
                }
//                System.out.println(array[j]);
            }
        }
    }

    private static void swap(int arr[], int a, int b) {
        if (arr[a] > arr[b]) {
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }

    }
}
