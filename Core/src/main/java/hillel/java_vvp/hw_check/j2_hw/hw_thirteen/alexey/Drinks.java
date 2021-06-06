package hillel.java_vvp.hw_check.j2_hw.hw_thirteen.alexey;

public class Drinks {


    public static final int COFFEE_PRICE = 15;
    public static final int TEA_PRICE = 8;
    public static final int LEMONADE_PRICE = 5;
    public static final int MOHITO_PRICE = 25;
    public static final int MINERAL_WATER_PRICE = 14;
    public static final int COCA_COLA_PRICE = 20;

    static int drinkCount = 0;
    static int totalPrice = 0;

    public Drinks(int price, DrinksMachine type) {    // Конструктор для напитков

        drinkCount++;
        totalPrice = totalPrice + price;

        System.out.println("Вы выбрали: " + type);
        System.out.println("С вас: " + Drinks.totalPrice + " ₴");
        System.out.println("Итого заказано напитков: " + Drinks.drinkCount);


    }

}