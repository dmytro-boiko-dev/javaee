package Collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListExmpl {
    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {

        Random random = new Random();

//        list.add(random.nextInt(10));
//        list.add(random.nextInt(10));
//        list.add(random.nextInt(10));
//        list.add(random.nextInt(10));

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(null);


        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }


        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(1, 99);
        System.out.println(list);
        list.add(15);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.size());


        ArrayList arrayList = new ArrayList();
        arrayList.add("BETCH");
        arrayList.add("split");
        arrayList.add("in");
        arrayList.add("2.0");
        arrayList.add("null");

        System.out.println(arrayList);


        System.out.println("----------------------------------");
        list.addAll(arrayList);
        System.out.println(list);


    }

}
