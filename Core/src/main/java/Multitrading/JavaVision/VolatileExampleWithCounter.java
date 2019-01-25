package Multitrading.JavaVision;

public class VolatileExampleWithCounter {

    public static void main(String[] args) {
        new VolatileExampleWithCounter().doCounter();
    }

    private int count = 0;

    private synchronized void increment(){
        count++;
    }

    void doCounter(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println(count);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println(count);
            }
        });

        t1.start();
        t2.start();

    }
}


//class A implements Runnable {
//
//    private int count = 0;
//    private synchronized void increment(){
//        count++;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1_000_000; i++) {
//            increment();
//        }
//        System.out.println(count);
//    }
//}