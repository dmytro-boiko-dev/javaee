package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExmpl {
    public static void main(String[] args) {
        Set<Integer> intHashSet = new HashSet<>();
        intHashSet.add(5);
        intHashSet.add(2);
        intHashSet.add(911);
        intHashSet.add(13);
        intHashSet.add(13);
        intHashSet.add(0);
        intHashSet.add(-127);

        System.out.println(intHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(intHashSet);
        System.out.println(treeSet);

        //slow down boooy
        //HashSet<String> hashSet = new HashSet<String>();

    }
}
