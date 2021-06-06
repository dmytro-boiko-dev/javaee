package oop.polymorphism.bakers;

public class DonutBaker extends Baker{

    public DonutBaker(String name, int age) {
        super(name, age);
    }

    @Override
    public void bake(){
        System.out.println("I make donuts!");
    }
}
