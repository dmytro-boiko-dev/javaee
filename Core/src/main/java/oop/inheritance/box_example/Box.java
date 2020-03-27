package oop.inheritance.box_example;

public class Box {
    double height;
    double width;
    double depth;

    // create box by object
    Box(Box object) {
        height = object.height;
        width = object.width;
        depth = object.depth;
    }

    // normal box
    Box(double h, double w, double d) {
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    // create empty box
    Box() {
        height = -1;
        width = -1;
        depth = -1;
    }

    // create cube
    Box(double length) {
        height= width = depth = length;
    }

    double volume() {
        return height * width * depth;
    }
}
