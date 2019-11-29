package BoostBrain;

import java.util.ArrayList;

public class Abstracts {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        //Shape shape = new Circle(1, "Black"); <---- how should it be
        shapes.add(new Circle(2, "Brown"));
        shapes.add(new Triangle(2, 3, "Green"));

        printShapes(shapes);
        //printShapes(shape);
    }

    public static void printShapes(ArrayList<Shape> shapes){
        for(Shape shape : shapes){
            System.out.println("Name: " + shape.getName());
            System.out.println("Squere: " + shape.getSquere());
            System.out.println("Color: " + shape.getColor());
        }
    }
}
