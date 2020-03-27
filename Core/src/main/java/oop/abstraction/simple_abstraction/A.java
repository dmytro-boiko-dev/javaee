package oop.abstraction.simple_abstraction;

public abstract class A {

    // pure abstract
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is not abstract method from class A, dude");
    }
}
