package oop.abstraction.geometry;

public class Triangle extends Figure{

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    double area() {
        System.out.println("Triangle implementation of area()");
        return dim1 * dim2 / 2;
    }
}
