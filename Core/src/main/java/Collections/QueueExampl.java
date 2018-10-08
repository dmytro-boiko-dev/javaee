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
        System.out.println("pull0 : " + queue);

        queue.poll(); System.out.println("pull 1: " + queue);
        queue.poll(); System.out.println("pull 2: " + queue);
        queue.poll(); System.out.println("pull 3: " + queue);
        queue.poll(); System.out.println("pull 4: " + queue);
        queue.poll(); System.out.println("pull 5: " + queue);

        queue.add("dev"); System.out.println(queue);
        queue.peek(); System.out.println(queue);


        /**
         * to remove first - poll() or remove();
         * to get first without removing - peek() or element()
         */

    }
}
