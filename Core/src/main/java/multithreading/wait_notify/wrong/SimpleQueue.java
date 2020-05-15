package multithreading.wait_notify.wrong;

public class SimpleQueue {
    int n;

    synchronized int get(){
        System.out.println("Received: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Sent: " + n);
    }
}
