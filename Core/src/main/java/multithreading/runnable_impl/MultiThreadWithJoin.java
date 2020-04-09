package multithreading.runnable_impl;

public class MultiThreadWithJoin {
    public static void main(String[] args) {

        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        NewThread obj3 = new NewThread("Three");

        // check: is threads started?
        System.out.println("Thread one started: " + obj1.thread.isAlive());
        System.out.println("Thread one started: " + obj2.thread.isAlive());
        System.out.println("Thread one started: " + obj3.thread.isAlive());

        try {
            System.out.println("Waiting for threads completion.");
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread one running: " + obj1.thread.isAlive());
        System.out.println("Thread one running: " + obj2.thread.isAlive());
        System.out.println("Thread one running: " + obj3.thread.isAlive());

        System.out.println("Main thread finished.");
    }
}
