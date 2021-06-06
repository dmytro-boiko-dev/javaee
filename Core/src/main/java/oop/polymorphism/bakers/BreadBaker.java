package oop.polymorphism.bakers;

public class BreadBaker extends Baker{

    public BreadBaker(String name, int age) {
        super(name, age);
    }

    @Override
    public void bake() {
        System.out.println("I make bread!");
    }
}
