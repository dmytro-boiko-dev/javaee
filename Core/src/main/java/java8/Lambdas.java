package java8;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {


        List<String> employees = new ArrayList();
        employees.add("John Doe");
        employees.add("Foo Bar");
        employees.add("Hello World");
        employees.add("Lorum Ipsum");
        employees.add("Pan Pan");

        // method reference
        employees.forEach(System.out::println);

    }
}
