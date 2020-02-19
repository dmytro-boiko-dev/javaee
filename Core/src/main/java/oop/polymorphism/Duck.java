package oop.polymorphism;

public class Duck implements Swim, MakeSound {

    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(toString() + " # " + "I swim by the legs. ");
    }

    @Override
    public String toString() {
        return "I am " + name;
    }

    @Override
    public void voice() {
        System.out.println("Duck say: Quaaack!");
    }
}
