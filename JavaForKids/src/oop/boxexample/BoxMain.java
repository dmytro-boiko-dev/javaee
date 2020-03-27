package oop.boxexample;

public class BoxMain {
    public static void main(String[] args) {

        Box box = new Box();
        box.height = 2;
        box.width = 3;
        box.depth = 4;

        box.printBox();

        BoxColor boxColor = new BoxColor();
        boxColor.height = 3;
        boxColor.depth = 4;
        boxColor.width = 5;

        boxColor.color = "green";
        boxColor.printColor();
        boxColor.printBox();



    }
}
