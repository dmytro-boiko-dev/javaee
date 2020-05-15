package enumeration;

import oop.abstraction.simple_abstraction.A;

public class AppleTestMain {
    public static void main(String[] args) {

        int price = Apple.CORTLAND.getPrice();
        System.out.println("Cortland price is " + price);

        System.out.println("------------------------------------");

        for (Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents");
        }

        System.out.println("------------------------------------");

        // get position number of enums
        for (Apple a : Apple.values()) {
            System.out.println(a + " at " + a.ordinal() + " position");
        }

        System.out.println("------------------------------------");

        // compare constants
        Apple apple0 = Apple.CORTLAND;
        Apple apple1 = Apple.PINKPEARL;
        Apple apple2 = Apple.RICHTER;
        Apple apple3 = Apple.CORTLAND;

        if (apple0.equals(apple1)){
            System.out.println("This will not shown.");
        }

        if (apple0.equals(apple3)){
            System.out.println("apple0 equal apple3: TRUE");
        }

        if (apple0 == apple3){
            System.out.println("apple0 == apple3: TRUE");
        }

    }
}
