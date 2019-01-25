package Multitrading;

public class TashaJoinThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
