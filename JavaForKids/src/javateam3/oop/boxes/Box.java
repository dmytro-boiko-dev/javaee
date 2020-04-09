package javateam3.oop.boxes;

public class Box {

    int height;
    int width;
    int depth;

    public void volume(){
        int vol = height * width * depth;
        System.out.println("Box volume = " + vol);
    }
}
