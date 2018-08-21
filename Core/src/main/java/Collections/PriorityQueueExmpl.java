package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;


// some entity class
class Emploee {
    String name;
    int salary;

    public Emploee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


// custom comporator to compare salaries
class MyComporator implements Comparator<Emploee> {

    //@Override
    public int compare(Emploee e1, Emploee e2) {
        return e1.salary - e2.salary;
    }
}


public class PriorityQueueExmpl {
    public static void main(String[] args) {
        MyComporator comporator = new MyComporator();

        //creating PriorityQueue of Employee objects with MyComparator as Comparator
        PriorityQueue<Emploee> pQueue = new PriorityQueue<Emploee>(7, comporator);

        pQueue.offer(new Emploee("Jhon", 1100));
        pQueue.offer(new Emploee("Sam", 2500));
        pQueue.offer(new Emploee("Gracy", 800));
        pQueue.offer(new Emploee("Rick", 1870));
        pQueue.offer(new Emploee("Zack", 3000));
        pQueue.offer(new Emploee("Slow Down Boy", 300));
        pQueue.offer(new Emploee("Lui", 1300));

        System.out.println(pQueue);

//        while (new Emploee() : pQueue){
//            System.out.println(e);
//        }

        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());

        System.out.println(pQueue);

    }


}
