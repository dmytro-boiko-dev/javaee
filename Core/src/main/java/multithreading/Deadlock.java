package multithreading;

public class Deadlock {
    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

        new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + ": got monitor #1");

                try { Thread.sleep(1000); } catch (Throwable ignored) {}

                System.out.println(Thread.currentThread().getName() + ": trying to get monitor #2");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + ": got monitor #2");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + ": got monitor #2");

                try { Thread.sleep(1000); } catch (Throwable ignored) {}

                System.out.println(Thread.currentThread().getName() + ": trying to get monitor #1");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + ": got monitor #1");
                }
            }
        }).start();
    }
}
