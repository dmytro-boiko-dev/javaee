package algorithms.trees;

import java.util.ArrayList;

public class BinaryHeap {
    // max heap
    private ArrayList<Integer> arr = new ArrayList<>();
    private int maxSize; // var 2
    private int minIndex;

    // var1
//    public BinaryHeap() {
//        arr.add(20);
//        arr.add(12);
//        arr.add(3);
//    }

    // var 2
    public BinaryHeap() {
        this.maxSize = maxSize;
    }

    // add element to heap
    public void add(int n) {
        if (n < minIndex && arr.size() == maxSize) return;
        arr.add(n);
        heapify();

        // var 2
        if(arr.size() > maxSize){
            removeMinValue();
        }
    }

    private void removeMinValue() {
        minIndex = arr.get(arr.size()/2);
        for (int i = arr.size()/2; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(minIndex)){
                minIndex = i;
            }
            arr.remove(minIndex);
            heapify();
        }
    }

    // get element from heap
    public int peakHead() {
        return arr.get(0);
    }

    // array to tree
    private void heapify() {
        for (int i = arr.size() / 2 - 1; i >= 0; i--) {
            int root = arr.get(i);
            int left = arr.get(2 * i + 1);

            int right = Integer.MIN_VALUE;
            if (2*i+2 < arr.size())
                right = arr.get(2 * i + 2);

            if (root >= left && root >= right) {
                continue;
            }
            if (left > right) {
                swap(i, 2 * i + 1);
            } else {
                swap(i, 2 * i + 2);
            }
        }
    }

    private void swap(int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public void print(){
        for (int n: arr){
            System.out.println(n + ",");
        }
        System.out.println();
    }
}
