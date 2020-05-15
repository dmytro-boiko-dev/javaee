package multithreading.wait_notify.correct;

public class Consumer implements Runnable {
    SimpleQueue queue;

    Consumer(SimpleQueue queue) {
        this.queue = queue;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {

        try {
            while (true) {
                Thread.sleep(500);
                queue.get();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
