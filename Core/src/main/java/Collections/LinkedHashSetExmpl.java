package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExmpl {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("TOYOTA");
        lhs.add("SONY");
        lhs.add("HITACHI");
        lhs.add("SHARP");
        lhs.add("AKAI");

        System.out.println(lhs);
        System.out.println(lhs.getClass());
        System.out.println(lhs.contains("SONY"));

        Iterator iterator = lhs.iterator();
        while (iterator.hasNext())
        System.out.println(iterator.next());

    }
}
