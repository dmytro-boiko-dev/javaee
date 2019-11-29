package BoostBrain;

public class Circle implements Shape{
    private double radius;
    private String color;

    //constructor
    public Circle(double r, String c){
        radius = r;
        color = c;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquere() {
        return 3.1415926 * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}
