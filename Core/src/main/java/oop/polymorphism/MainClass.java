package oop.polymorphism;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Duck duck = new Duck("Lucky Ducky"); // type Duck used for getting access to voice() method
        Swim human = new Human("Neo", 31);
        Swim submarine = new Submarine("Yellow Sub", 10_000);


        List<Swim> swimmers = Arrays.asList(duck, human, submarine);
        for(Swim s : swimmers){
            s.swim(); // here is polymorph call of method
        }

        duck.voice();
    }
}
