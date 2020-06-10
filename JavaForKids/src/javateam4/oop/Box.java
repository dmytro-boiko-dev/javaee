package javateam4.oop;

public class Box {

    int length;
    int height;
    int weight;

    public void volume(){
        int vol = length * height * weight;
        System.out.println("Объем коробки = " + vol);
    }
}
