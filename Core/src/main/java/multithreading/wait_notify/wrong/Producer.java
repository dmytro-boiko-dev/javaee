package multithreading.wait_notify.wrong;

public class Producer implements Runnable {
    SimpleQueue queue;

    Producer(SimpleQueue queue) {
        this.queue = queue;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;

        try{
            while (true) {
                Thread.sleep(500);
                queue.put(i++);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
