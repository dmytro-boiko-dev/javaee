package inheritance;

public class Bus extends FuelCar {
    private int passangersNumber;

    public Bus(String producer, String model, int tankCapacity, int currentFuel, int fuelValue, int passangersNumber) {
        super(producer, model, tankCapacity, currentFuel, fuelValue);
        this.passangersNumber = passangersNumber;
        System.out.println("Bus created");
    }

    @Override
    public void fuelUp(int tankCapacity, int fuelValue, int currentFuel){
        currentFuel = currentFuel + fuelValue;
        if(currentFuel > tankCapacity){
            System.out.println("Tank is full");
        } else {
            System.out.println("Current tank level " + currentFuel);
        }
    }

    public int getPassangersNumber() {
        System.out.println("Current passangers number " + passangersNumber);
        return passangersNumber;
    }

    public void setPassangersNumber(int passangersNumber) {
        this.passangersNumber = passangersNumber;
    }
}
