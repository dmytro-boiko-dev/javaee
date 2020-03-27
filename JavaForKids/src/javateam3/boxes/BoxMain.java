package javateam3.boxes;

public class BoxMain {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.height = 2;
        box1.width = 3;
        box1.depth = 4;
        box1.volume();

        Box box2 = new Box();
        box2.height = 5;
        box2.width = 12;
        box2.depth = 7;
        box2.volume();

        BoxColor greenBox = new BoxColor();
        greenBox.color = "green";
        greenBox.height = 1;
        greenBox.width = 1;
        greenBox.depth = 1;
        greenBox.volume();
        greenBox.printColor();

        BoxColor brownBox = new BoxColor();
        brownBox.color = "brown";
        brownBox.printColor();



    }
}
