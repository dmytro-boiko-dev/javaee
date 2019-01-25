package Multitrading.JavaVision;

public class JoinExample {
    public static void main(String[] args) {
        new JoinExample().doJoin();
    }

    private void doJoin(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The last in line.");
    }

}
