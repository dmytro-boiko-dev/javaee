package hillel.java_vvp.best_examples.drinks.anna;


import java.util.Scanner;

public class DrinksMachine {
    public static final String RESET = "\033[0m";
    public static final String BLACK_BOLD = "\033[1;30m";

    public static final double TEA_PRICE = 3.41;
    public static final double COFFEE_PRICE = 5.78;
    public static final double SODA_PRICE = 0.99;
    public static final double COCA_COLA_PRICE = 7.20;
    public static final double MOHITO_PRICE = 11.92;

    private int countOfTea;
    private int countOfCoffee;
    private int countOfSoda;
    private int countOfCocaCola;
    private int countOfMohito;
    private double total;

    Scanner scanner = new Scanner(System.in);

    public void costOfTea() {
        System.out.println("-------------------------------------------");
        System.out.println("Машина для напитков приготовит Вам горячий чай: ");
        System.out.println("Чашка чая стоит - " + BLACK_BOLD + TEA_PRICE + " $" + RESET);
        System.out.println("\nПожалуйста, введите кол-во чашек чая");
        countOfTea += scanner.nextInt();
        if (countOfTea == 1)
            System.out.println("Вы заказали : " + countOfTea + " чашку чая");
        if (countOfTea >= 2 && countOfTea <= 4)
            System.out.println("Вы заказали : " + countOfTea + " чашки чая");
        if (countOfTea >= 5)
            System.out.println("Вы заказали : " + countOfTea + " чашек чая");
    }

    public void costOfCoffee() {
        System.out.println("-------------------------------------------");
        System.out.println("Машина для напитков приготовит Вам горячий кофе: ");
        System.out.println("Чашка кофе стоит - " + BLACK_BOLD + COFFEE_PRICE + " $" + RESET);
        System.out.println("\nПожалуйста, введите кол-во чашек кофе");
        countOfCoffee += scanner.nextInt();
        if (countOfCoffee == 1)
            System.out.println("Вы заказали : " + countOfCoffee + " чашку кофе");
        if (countOfCoffee >= 2 && countOfCoffee <= 4)
            System.out.println("Вы заказали : " + countOfCoffee + " чашки кофе");
        if (countOfCoffee >= 5)
            System.out.println("Вы заказали : " + countOfCoffee + " чашек кофе");
    }

    public void costOfSoda() {
        System.out.println("-------------------------------------------");
        System.out.println("Машина для напитков выдаст Вам бутылку минералки : ");
        System.out.println("Бутылка минералки стоит - " + BLACK_BOLD + SODA_PRICE + " $" + RESET);
        System.out.println("\nПожалуйста, введите кол-во бутылок минералки");
        countOfSoda += scanner.nextInt();
        if (countOfSoda == 1)
            System.out.println("Вы заказали : " + countOfSoda + " бутылку минералки");
        if (countOfSoda >= 2 && countOfSoda <= 4)
            System.out.println("Вы заказали : " + countOfSoda + " бутылки минералки");
        if (countOfSoda >= 5)
            System.out.println("Вы заказали : " + countOfSoda + " бутылок минералки");
    }

    public void costOfCocaCola() {
        System.out.println("-------------------------------------------");
        System.out.println("Машина для напитков выдаст Вам бутылку кока колы: ");
        System.out.println("Бутылка кока колы стоит - " + BLACK_BOLD + COCA_COLA_PRICE + " $" + RESET);
        System.out.println("\nПожалуйста, введите кол-во бутылок кока колы");
        countOfCocaCola += scanner.nextInt();
        if (countOfCocaCola == 1)
            System.out.println("Вы заказали : " + countOfCocaCola + " бутылку кока колы");
        if (countOfCocaCola >= 2 && countOfCocaCola <= 4)
            System.out.println("Вы заказали : " + countOfCocaCola + " бутылки кока колы");
        if (countOfCocaCola >= 5)
            System.out.println("Вы заказали : " + countOfCocaCola + " бутылок кока колы");
    }

    public void costOfMohito() {
        System.out.println("-------------------------------------------");
        System.out.println("Машина для напитков выдаст Вам бутылку мохито: ");
        System.out.println("Бутылка мохито стоит - " + BLACK_BOLD + MOHITO_PRICE + " $" + RESET);
        System.out.println("\nПожалуйста, введите кол-во бутылок мохито");
        countOfMohito += scanner.nextInt();
        if (countOfMohito == 1)
            System.out.println("Вы заказали : " + countOfMohito + " бутылку мохито");
        if (countOfMohito >= 2 && countOfMohito <= 4)
            System.out.println("Вы заказали : " + countOfMohito + " бутылки мохито");
        if (countOfMohito >= 5)
            System.out.println("Вы заказали : " + countOfMohito + " бутылок мохито");
    }

    public void totalCost() {
        if (countOfTea != 0)
            System.out.println("--- Чай " + countOfTea + " - " + (countOfTea * TEA_PRICE) + " $");
        if (countOfCoffee != 0)
            System.out.println("--- Кофе " + countOfCoffee + " - " + (countOfCoffee * COFFEE_PRICE) + " $");
        if (countOfSoda != 0)
            System.out.println("--- Минералка " + countOfSoda + " - " + (countOfSoda * SODA_PRICE) + " $");
        if (countOfCocaCola != 0)
            System.out.println("--- Кока Кола " + countOfCocaCola + " - " + (countOfCocaCola * COCA_COLA_PRICE) + " $");
        if (countOfMohito != 0)
            System.out.println("--- Мохито " + countOfMohito + " - " + (countOfMohito * MOHITO_PRICE) + " $");

        total = (countOfTea * TEA_PRICE) + (countOfCoffee * COFFEE_PRICE) + (countOfSoda * SODA_PRICE)
                + (countOfCocaCola * COCA_COLA_PRICE) + (countOfMohito * MOHITO_PRICE);
        System.out.printf("\tИтого: %5.2f $", total);
    }
}