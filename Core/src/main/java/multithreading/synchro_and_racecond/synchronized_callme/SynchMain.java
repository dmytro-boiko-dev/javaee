package multithreading.synchro_and_racecond.synchronized_callme;

public class SynchMain {
    public static void main(String[] args) {

        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Welcome to ");
        Caller obj2 = new Caller(target, "the synchronized ");
        Caller obj3 = new Caller(target, "world!");

        try {
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
