package oop.polymorphism;

public class Human implements Swim, MakeSound {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(toString() + " # " + "I swim by the hands.");
    }

    @Override
    public String toString() {
        return "I am " + name + ", my age is " + age;
    }

    @Override
    public void voice() {
        System.out.println("I'm only human after all");
    }
}
