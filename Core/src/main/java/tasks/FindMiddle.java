package tasks;

import java.util.LinkedList;

public class FindMiddle {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);
        list.add(34);
        list.add(55);
        list.add(89);

        findMiddle(list);
    }

    // Как найти средний элемент в LinkedList за один проход?
    private static void findMiddle(LinkedList<Integer> list) {

        int middle = 0;
        int count = 0;
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i > 1) {
                middle = i / 2;
                count = i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Result: " + array[middle]);
    }

    private static void middleByPointers(LinkedList<Integer> list) {

        int countLast = 0;
        int countMiddle = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            countLast++;
            int diff = countLast % 2;
            if (diff == 1) {
            }
        }
    }
}
