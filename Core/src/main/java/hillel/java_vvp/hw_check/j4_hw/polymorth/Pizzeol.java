package hillel.java_vvp.hw_check.j4_hw.polymorth;

public class Pizzeol extends Baker{

    public Pizzeol(String name, int age) {
        super(name, age);
    }

    @Override
    public void bake() {
        System.out.println("Faccio la pizza.");
    }
}
