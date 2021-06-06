package hillel.java_vvp.hw_check.j3_hw.hw13.anna;

public enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    MINERAL_WATER,
    COCA_COLA;

    public void makeDrinks(String choose){
        System.out.println("Vending machine will make you " + choose);
    }
}
