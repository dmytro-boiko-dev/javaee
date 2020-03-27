package oop.abstraction.geometry;

public class Rectangle extends Figure{

    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    double area(){
        System.out.println("Rectangle implementation of area()");
        return dim1 * dim2;
    }
}
