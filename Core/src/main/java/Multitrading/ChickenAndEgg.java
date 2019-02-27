package multitrading;

public class ChickenAndEgg {

    static Egg egg;

    public static void main(String[] args) {
        egg = new Egg();
        System.out.println("Start!");
        egg.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {

            }
            System.out.println("chicken!" + " | " + Thread.currentThread().getName() + " | " + Thread.activeCount());
        }

        if (egg.isAlive()) {
            try {
                egg.join();
            } catch (InterruptedException e) {

            }
            System.out.println("First was egg!");
        } else {
            System.out.println("First was chicken!");
        }

        System.out.println("Finish.");
    }
}

class Egg extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {

            }
            System.out.println("egg!" + Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getName());
        }
    }
}
