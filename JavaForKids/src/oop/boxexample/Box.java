package oop.boxexample;

public class Box {

    int width;
    int height;
    int depth;

    void printBox(){

        int boxVolume = width * height * depth;
        System.out.println("Box size: " + boxVolume);
    }

}
