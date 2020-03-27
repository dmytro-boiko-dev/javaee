package oop.inheritance.box_example;

public class BoxMain {
    public static void main(String[] args) {

        BoxWeight boxWeight1 = new BoxWeight(10, 20, 30, 5.0);
        BoxWeight boxWeight2 = new BoxWeight(2, 3, 5, 1.5);

        double volume;

        volume = boxWeight1.volume();
        System.out.println("Box1 volume = " + volume);
        System.out.println("Box1 weight = " + boxWeight1.weight);

        volume = boxWeight2.volume();
        System.out.println("Box2 volume = " + volume);
        System.out.println("Box2 weight = " + boxWeight2.weight);

    }
}
