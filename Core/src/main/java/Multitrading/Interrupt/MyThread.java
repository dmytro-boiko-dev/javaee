package Multitrading.Interrupt;

public class MyThread extends Thread {
    @Override
    public void run() {
        int iterations = 10;

        try{
            for (int i = 0; i < iterations; i++) {
                System.out.println("Secondary thread running.");
                sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Second thread interuppted.");
        }


}
}
