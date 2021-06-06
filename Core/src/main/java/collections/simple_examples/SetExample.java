package collections.simple_examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("AAA");
        set.add("BBB");
        set.add("CCC");

        set.add("BBB");
        set.add("BBB");
        set.add("BBB");

        System.out.println(set);


    }
}
