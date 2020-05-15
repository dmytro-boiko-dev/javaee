package multithreading.wait_notify.wrong;

public class EntryPoint {
    public static void main(String[] args) {

        SimpleQueue queue = new SimpleQueue();
        new Producer(queue);
        new Consumer(queue);

        System.out.println("Press Ctrl+C to stop.");
    }
}
