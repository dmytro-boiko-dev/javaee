package recursion.simple;

public class SimpleRecursion {
    int[] array;
    SimpleRecursion(int size){
        array = new int[size];
    }

    void printArray(int i){
        if(i == 0) {
            return;
        } else {
            printArray(i - 1);
        }

        System.out.println("[index:" + (i - 1) + "] " + array[i - 1]);
    }
}
