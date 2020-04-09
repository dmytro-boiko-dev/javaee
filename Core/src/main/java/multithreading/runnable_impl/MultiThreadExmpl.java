package multithreading.runnable_impl;

public class MultiThreadExmpl {
    public static void main(String[] args) {

        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try{
            // wait for other threads end
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished.");

    }
}
