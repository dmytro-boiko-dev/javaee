import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class MainTestClass {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Gang");
//        list.add("of");
//        list.add("Four");
//        list.add("Design");
//        list.add("Patterns");
//        list.add("in");
//        list.add("Java");
//
//        list.forEach( str -> System.out.print(str + " "));
//
//        System.out.println();
//        System.out.println("-----------------------------");
//
//        StringJoiner sb1 = new StringJoiner(", ");
//        sb1.add("Gang");
//        sb1.add("of");
//        sb1.add("Four");
//
//        System.out.println(sb1);
//
//
        String a = "fi";
        String b = "ga";

        a = a + b.charAt(0);
        a = a + b.charAt(1);

        System.out.println(a);

    }
}