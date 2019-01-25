package Multitrading;

public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {
            }
            System.out.println("run: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadRunnable());
        thread.start();  // start of second thread from class CustomRunnable

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100); // start first thread from main method
            System.out.println("main: " + i);
        }
    }
}
