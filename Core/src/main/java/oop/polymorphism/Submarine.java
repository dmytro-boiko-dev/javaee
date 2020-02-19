package oop.polymorphism;

public class Submarine implements Swim {

    String name;
    int power;

    public Submarine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void swim() {
        System.out.println(toString() + " # " + "I swim by engine and propeller");
    }

    @Override
    public String toString() {
        return "I am " + name + ", my power = " + power;
    }
}
