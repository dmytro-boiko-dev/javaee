package oop.abstraction.simple_abstraction;

public class B extends A {

    //@Override // <-- can be used without this annotation
    void callMe() {
        System.out.println("This is realization of abstract method in the B class ");
    }
}
