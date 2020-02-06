package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExmpl {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("TOYOTA");
        lhs.add("SONY");
        lhs.add("HITACHI");
        lhs.add("SHARP");
        lhs.add("AKAI");

//        System.out.println(lhs);

        for (String lh : lhs) System.out.print(lh + " ");
    }
}
