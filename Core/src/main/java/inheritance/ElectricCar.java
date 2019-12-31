package inheritance;

public class ElectricCar extends Auto {
    private int betteryCapacity;
    private int betteryLevel;

    public ElectricCar(String producer, String model, int betteryCapacity, int betteryLevel) {
        super(producer, model);
        this.betteryCapacity = betteryCapacity;
        this.betteryLevel = betteryLevel;
        System.out.println("Electric car created");
    }

    public int getBetteryCapacity() {
        return betteryCapacity;
    }

    public void setBetteryCapacity(int betteryCapacity) {
        this.betteryCapacity = betteryCapacity;
    }

    public int getBetteryLevel() {
        return betteryLevel;
    }

    public void setBetteryLevel(int betteryLevel) {
        this.betteryLevel = betteryLevel;
    }
}
