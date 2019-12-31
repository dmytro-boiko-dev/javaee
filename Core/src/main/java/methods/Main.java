package methods;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.setLegs(5);
        dragon.setWings(3);

        System.out.println("Dragon has " + dragon.getLegs() + " legs");
        System.out.println("Dragon has " + dragon.getWings() + " wings");

    }
}
