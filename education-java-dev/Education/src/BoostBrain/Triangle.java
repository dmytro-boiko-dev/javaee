package BoostBrain;

public class Triangle implements Shape{
    private double hight;
    private double width;
    private String color;

    //constructor
    public Triangle(double h, double w, String c){
        hight = h;
        width = w;
        color = c;

    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquere() {
        return (hight * width) / 2;
    }

    @Override
    public String getColor() {
        return color;
    }
}
