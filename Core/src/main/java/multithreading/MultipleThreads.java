package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThreads {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(() -> {
            System.out.println("Thread 1: " +Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(i + ", ");
            }
        });
        System.out.println();

        executor.execute(() -> {
            System.out.println("Thread 2: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(i + ", ");
            }
        });
        System.out.println();

        executor.execute(() -> {
            System.out.println("Thread 3: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(i + ", ");
            }
        });
        System.out.println();

        executor.execute(() -> {
            System.out.println("Thread 4: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(i + ", ");
            }
        });
        System.out.println();

        executor.execute(() -> {
            System.out.println("Thread 5: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print(i + ", ");
            }
        });
        System.out.println();



        executor.shutdown();
        System.out.println("All threads are down.");

    }
}
