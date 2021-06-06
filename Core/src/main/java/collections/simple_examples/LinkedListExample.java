package collections.simple_examples;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Seattle");
        list.add("Detroit");
        list.add("Chicago");

        System.out.println(list);

        list.add(2, "Miami");

        System.out.println(list);

    }
}
