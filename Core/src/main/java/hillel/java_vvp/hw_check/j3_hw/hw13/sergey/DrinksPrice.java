package hillel.java_vvp.hw_check.j3_hw.hw13.sergey;

public class DrinksPrice {
    public static final double COFFEE_PRICE= 4.2;
    public static final double TEA_PRICE = 2.2;
    public static final double LEMONADE_PRICE = 5.2;
    public static final double MOJITO_PRICE = 3.6;
    public static final double SODA_PRICE = 4.4;
    public static final double COLA_PRICE = 3.5;

    public static double calculateFullCost(Drinks2 drink, int quantity) {
        double totalPrice = 0;
        switch (drink) {
            case TEA:
                totalPrice = quantity * TEA_PRICE;
            case COFFEE:
                totalPrice = quantity * COFFEE_PRICE;
            case LEMONADE:
                totalPrice = quantity * LEMONADE_PRICE;
            case MOJITO:
                totalPrice = quantity * MOJITO_PRICE;
            case SODA:
                totalPrice = quantity * SODA_PRICE;
            case COCA:
                totalPrice = quantity * COLA_PRICE;
            default:
        }
        return totalPrice;
    }

}
