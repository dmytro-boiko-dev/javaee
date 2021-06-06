package hillel.java_vvp.hw_check.j1_hw.drinks.nikita;

public class CountOfDrinks {
    static double totalPrice = 0;
    static int countOfDrinks = 0;
    public CountOfDrinks(int price) {
        if (price > 0)
            totalPrice = price + totalPrice;

    }
}

