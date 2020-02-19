package inheritance_old;

public class MainClass {
    public static void main(String[] args) {
        Bus bus = new Bus("GMC", "GM3000", 100, 50, 30, 70);
        bus.setPassangersNumber(45);
        bus.getPassangersNumber();
        bus.fuelUp(100, 40, 30);

        ElectricCar car = new ElectricCar("BMW", "i8", 500, 30);
        System.out.println("Current battery capacity: " + car.getBetteryCapacity());
    }
}