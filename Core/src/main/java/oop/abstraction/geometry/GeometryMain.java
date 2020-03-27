package oop.abstraction.geometry;

public class GeometryMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12.0, 8.0);
        Triangle triangle = new Triangle(6.0, 6.0);

        Figure figure;

        figure = rectangle;
        double rectangleArea = figure.area();

        figure = triangle;
        double triangleArea = figure.area();

        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Triangle area = " + triangleArea);

        // can be simplified by call directly
        // rectangle.area();
        // triangle.area();


    }
}
