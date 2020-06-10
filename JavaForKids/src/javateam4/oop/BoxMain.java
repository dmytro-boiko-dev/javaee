package javateam4.oop;

public class BoxMain {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.length = 5;
        box1.height = 3;
        box1.weight = 6;
        box1.volume();

        Box box2 = new Box();
        box2.length = 10;
        box2.height = 20;
        box2.weight = 30;
        box2.volume();

        ColorBox colorBox = new ColorBox();
        colorBox.length = 3;
        colorBox.height = 3;
        colorBox.weight = 3;
        colorBox.color = "Green";
        colorBox.volume();
        colorBox.printColor();


        // Animal
        // name, age

        // AnimalMain
        // Animal an1 = new Animal();

        // Cat extend Animal
        // breed =



    }
}
