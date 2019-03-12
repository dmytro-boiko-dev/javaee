package udemy1.collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListIteratorExample {

    public static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("---Create robots---");
        System.out.println("Choose an option:");
        System.out.println("1 to create robot");
        System.out.println("2 to show robots");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit name and press Return: ");
        switch (scanner.nextInt()) {
            case 1:
                addToList(scanner.next());
                System.out.println("Choose an option:");
                break;
            case 2:
                System.out.println("Enter valid value:");
                scanner.nextInt();
                break;
            case 3:
                showResult();
                break;
        }

    }

    private static boolean addSortedItem(String unitName) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareTo(unitName);
            if (compared == 0) {
                listIterator.add(unitName);
                return true;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(unitName);
                return true;
            }
        }
        list.add(unitName);
        return true;
    }

    private static void addToList(String unitName) {
        list.add(unitName);
    }

    private static void showResult(){
        if (list.listIterator().hasNext()) {
            for (String s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("List is empty.");
        }
    }
}
