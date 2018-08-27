package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampl {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(5);
        queue.add("four");
        queue.add("dog");
        queue.add("74");

        System.out.println(queue);

        System.out.println(queue.element()); // give me first element

        ((LinkedList) queue).add(1,"fuck"); // this is fucking magic !!!
        System.out.println(queue);


    }
}
