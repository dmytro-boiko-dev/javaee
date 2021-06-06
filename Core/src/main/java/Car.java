public class Car {

    String model;
    String engineType;
    double engineCapacity;
    String transmissionType;
    int wheels;
    double tankCapacity;
    int doors;
    int modelYear;
    String color;
    int horsePower;
    byte passengers;
    double maxSpeed;

    public static void move(){
        System.out.println("Go!");
    }

    public void printCar(){
        System.out.println("model: " + model);
        System.out.println("engineType: " + engineType);
        System.out.println("engineCapacity: " + engineCapacity);
        System.out.println("transmissionType: " + transmissionType);
        System.out.println("wheels: " + wheels);
        System.out.println("tankCapacity: " + tankCapacity);
        System.out.println("doors: " + doors);
        System.out.println("modelYear: " + modelYear);
        System.out.println("color: " + color);
        System.out.println("horsePower: " + horsePower);
        System.out.println("passengers: " + passengers);
        System.out.println("maxSpeed: " + maxSpeed);
    }

}
