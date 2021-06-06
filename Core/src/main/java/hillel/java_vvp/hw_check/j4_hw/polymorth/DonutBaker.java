package hillel.java_vvp.hw_check.j4_hw.polymorth;

public class DonutBaker extends Baker{

    public DonutBaker(String name, int age) {
        super(name, age);
    }

    @Override
    public void bake() {
        System.out.println("I make donuts.");
    }
}
