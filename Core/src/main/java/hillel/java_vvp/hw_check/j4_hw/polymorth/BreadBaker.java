package hillel.java_vvp.hw_check.j4_hw.polymorth;

public class BreadBaker extends Baker{

    public BreadBaker(String name, int age) {
        super(name, age);
    }

    @Override
    public void bake() {
        System.out.println("I make bread!");
    }
}
