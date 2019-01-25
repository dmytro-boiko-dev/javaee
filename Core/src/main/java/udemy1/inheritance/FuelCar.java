package udemy1.inheritance;

public class FuelCar extends Auto {

    private int tankCapacity;
    private int currentFuel;
    private int fuelValue;

    public FuelCar(String producer, String model, int tankCapacity, int currentFuel, int fuelValue) {
        super(producer, model);
        this.tankCapacity = tankCapacity;
        this.currentFuel = currentFuel;
        this.fuelValue = fuelValue;
    }

    public void fuelUp(int tankCapacity, int fuelValue, int currentFuel){
        System.out.println("Current fuel level: " + currentFuel);
        System.out.println("Tank capacity: " + tankCapacity);
        System.out.println("Fuel value: " + fuelValue);
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getFuelValue() {
        return fuelValue;
    }

    public void setFuelValue(int fuelValue) {
        this.fuelValue = fuelValue;
    }
}
