package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {5,8,0,1,5,3,8,6,0,1,-3,1,12, 2};

        System.out.println("Original array:");
        System.out.println(Arrays.toString( array ));

        insertionSort( array );

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString( array ));

    }

    public static void insertionSort(int[] array){


        // we started from second element, because first element is already sorted, it is "a pivot"
        for(int i = 1; i < array.length; i++){
            int current = array[i]; // element that we compare and move if needed
            int j = i - 1; // index of previous element, with which we comparing current

            // if previous element index more then zero, AND (main check) previous element bigger then current
            while(j >= 0 && array[j] > current){
                // we move previous element to current position, and doing it while condition is true
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

    }
}
