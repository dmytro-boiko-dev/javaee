package Multitrading;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class ThreadOverride {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started.");

        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

        OverridedThread overridedThread = new OverridedThread();
        overridedThread.start();

        System.out.println("End of main thread.");
    }
}

class OverridedThread extends Thread{
    @Override
    public void run(){
        System.out.println("Second thread started.");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Finish.");
    }
}
