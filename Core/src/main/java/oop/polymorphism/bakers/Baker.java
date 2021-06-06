package oop.polymorphism.bakers;

public class Baker {

    private String name;
    private int age;

    public Baker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bake() {
        System.out.println(toString() + "I make bread");
    }
}
