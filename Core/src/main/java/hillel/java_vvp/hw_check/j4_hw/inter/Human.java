package hillel.java_vvp.hw_check.j4_hw.inter;

public class Human implements Runnable{

    @Override
    public long run(int number) {

        int i;
        for (i = 0; i < 1000; i++) {
            System.out.println("I'm running");
        }

        System.out.println("Running finished.");

        return i;
    }
}
