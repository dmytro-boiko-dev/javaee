package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItetatorAndListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator listIterator = list.listIterator();
        System.out.println("--- Next:");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--- Previous:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
