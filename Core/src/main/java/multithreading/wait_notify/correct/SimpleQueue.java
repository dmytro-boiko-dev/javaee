package multithreading.wait_notify.correct;

public class SimpleQueue {
    int n;
    boolean valueSet = false;

    synchronized int get() {

        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e);
            }

        System.out.println("Received: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        this.n = n;
        valueSet = true;
        System.out.println("Sent: " + n);
        notify();
    }
}
