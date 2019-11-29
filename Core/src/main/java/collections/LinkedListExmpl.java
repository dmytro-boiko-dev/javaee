package collections;

import java.util.LinkedList;

public class LinkedListExmpl {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");


        for (int i = 0; i < 100; i++) {
            linkedList.addLast("null");
        }

        System.out.println(linkedList.get(57));

        linkedList.addFirst("zero");
        linkedList.addLast("high five");
        System.out.println(linkedList);
    }
}
