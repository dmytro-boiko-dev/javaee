package strings;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

//        StringJoiner sj = new StringJoiner(" "); // can be used without sufixes
        StringJoiner sj = new StringJoiner(" ", "[", "]");

        sj.add("I");
        sj.add("saw");
        sj.add("a");
        sj.add("kitten");
        sj.add("eating");
        sj.add("chicken");
        sj.add("in");
        sj.add("the");
        sj.add("kitchen");

        System.out.println(sj);

        System.out.println(sj.length());

        StringJoiner sj1 = new StringJoiner(" ");

        sj1.add("!!!");

        sj.merge(sj1);

        System.out.println(sj);

    }
}
