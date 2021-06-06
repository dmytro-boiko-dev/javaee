package oop.polymorphism.bakers;

public class MainBakers {

    public static void main(String[] args) {

        Baker simpleBaker = new Baker("John", 33);

        Baker breadBaker = new BreadBaker("Sam", 19);// восходящее преобразование к базовому типу
        Baker donutBaker = new DonutBaker("Richie", 22); // восходящее преобразование к базовому типу

        Baker[] array = new Baker[2];
        array[0] = breadBaker;
        array[1] = donutBaker;

        for (Baker baker : array){
            baker.bake();
        }
    }
}
