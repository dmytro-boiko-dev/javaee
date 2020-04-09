package multithreading.runnable_impl;

public class NewThread implements Runnable {

    String name;
    Thread thread;

    public NewThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);

        System.out.println("New thread " + thread);
        thread.start(); // launch new thread
    }

    // entry point to new thread
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " finished.");
    }
}
