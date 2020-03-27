package oop.inheritance.box_example;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double h, double w, double d, double we) {
        super(h, w, d); // call parent constructor with such parameters
        weight = we;
    }
}
