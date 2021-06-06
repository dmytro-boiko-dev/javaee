package hillel.java_vvp.hw_check.j3_hw.hw13.sergey;

import java.util.*;

public class DrinksMachine {
    static int numberOfDrinks;
    static Map<Drinks2, Integer> orderBook = new HashMap<>();
    static String newOrder;
    static Drinks2 userChoice;
    static double cost = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void getUserOrder() {

        System.out.println("Машина для напитков может приготовить:");
        System.out.println((char) 27 + "[1m" + (char) 27 + "[33m" + Arrays.toString(Drinks2.values()) + (char) 27 + "[0m");

        userChoice = getUserDrinkInput();
        prepareDrinks(userChoice);
        numberOfDrinks = getUserQuantityInput(userChoice);
        printOrderedItem(userChoice, numberOfDrinks);
        cost += DrinksPrice.calculateFullCost(userChoice, numberOfDrinks);

    }

    public static Drinks2 getUserDrinkInput() throws IllegalArgumentException {
        String output;
        Drinks2 drinks = Drinks2.TEA;
        boolean isAcceptable = false;

        System.out.println("Пожалуйста выберите напиток, который хотите заказать:");
        do {
            output = scanner.nextLine();
            try {
                drinks = Drinks2.valueOf(output.toUpperCase());
                isAcceptable = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Выбор неочевиден, пожалуйста повторите попытку ввода");
            }
        } while (!isAcceptable);
        return drinks;
    }

    public static int getUserQuantityInput(Drinks2 drink) {
        Scanner sc = new Scanner(System.in);
        int output = 0;
        boolean isAcceptable = false;

        if (drink != Drinks2.TEA && drink != Drinks2.COFFEE) {
            System.out.println("Введите пожалуйста количество стаканов:");
        } else {
            System.out.println("Введите пожалуйста количество чашек:");
        }

        do {
            if (sc.hasNextInt()) {
                output = sc.nextInt();
                isAcceptable = true;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите заново:");
                sc.next();
            }
        } while (!isAcceptable);

        return output;
    }

    public static void prepareDrinks(Drinks2 desiredDrink) {

        System.out.print("Машина для напитков приготовит Вам ");
        switch (desiredDrink) {
            case TEA:
                System.out.println("горячий чай.");
                System.out.println("Чашка чая стоит " + DrinksPrice.TEA_PRICE + " $");
                break;
            case COFFEE:
                System.out.println("горячий кофе.");
                System.out.println("Чашка кофе стоит " + DrinksPrice.COFFEE_PRICE + " $");
                break;
            case LEMONADE:
                System.out.println("прохладный лимонад.");
                System.out.println("Стакан лимонада стоит " + DrinksPrice.LEMONADE_PRICE + " $");
                break;
            case MOJITO:
                System.out.println("холодный мохито.");
                System.out.println("Бокал мохито стоит " + DrinksPrice.MOJITO_PRICE + " $");
                break;
            case SODA:
                System.out.println("минералку.");
                System.out.println("Стакан минералки стоит " + DrinksPrice.SODA_PRICE + " $");
                break;
            case COCA:
                System.out.println("Кока-колу.");
                System.out.println("Стакан колы стоит " + DrinksPrice.COLA_PRICE + " $");
                break;
        }
    }

    public static void printOrderBook() {

        System.out.println("\n" + "\u001B[46m" + "\u001B[1;30m" + " ВАШ ОБЩИЙ ЗАКАЗ " + "\u001B[0m");
        System.out.println("=======================================");
        for (Map.Entry<Drinks2, Integer> item : orderBook.entrySet()) {
            switch (item.getKey()) {
                case TEA:
                    printOrderedItem("ЧАЙ", item.getValue());
                    break;
                case COFFEE:
                    printOrderedItem("КОФЕ", item.getValue());
                    break;
                case LEMONADE:
                    printOrderedItem("ЛИМОНАД", item.getValue());
                    break;
                case MOJITO:
                    printOrderedItem("МОХИТО", item.getValue());
                    break;
                case SODA:
                    printOrderedItem("МИНЕРАЛКА", item.getValue());
                    break;
                case COCA:
                    printOrderedItem("КОКА-КОЛА", item.getValue());
                    break;
                default:
            }

        }
        System.out.println("=======================================");
        System.out.printf("\nПолная стоймость всех напитков: %.2f $\n", cost);
    }

    public static void printOrderedItem(String drink, int number) {
        String form = "";
        double price = 0.0;

        switch (drink) {
            case "ЧАЙ":
                price = DrinksPrice.TEA_PRICE * number;
                break;
            case "КОФЕ":
                price = DrinksPrice.COFFEE_PRICE * number;
                break;
            case "ЛИМОНАД":
                price = DrinksPrice.LEMONADE_PRICE * number;
                break;
            case "МИНЕРАЛКА":
                price = DrinksPrice.SODA_PRICE * number;
                break;
            case "МОХИТО":
                price = DrinksPrice.MOJITO_PRICE * number;
                break;
            case "КОКА-КОЛА":
                price = DrinksPrice.COLA_PRICE * number;
                break;
            default:

        }
        switch (number % 10) {
            case 1:
                if (drink.equals("ЧАЙ") || drink.equals("КОФЕ")) {
                    form = "чашка";
                } else {
                    form = "стакан";
                }
                break;
            case 2:
            case 3:
            case 4:
                if (drink.equals("ЧАЙ") || drink.equals("КОФЕ")) {
                    form = "чашки";
                } else {
                    form = "стакана";
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                if (drink.equals("ЧАЙ") || drink.equals("КОФЕ")) {
                    form = "чашек";
                } else {
                    form = "стаканов";
                }
                break;
        }
        if (number % 100 > 10 && number % 100 < 15) {
            if (drink.equals("ЧАЙ") || drink.equals("КОФЕ")) {
                form = "чашек";
            } else {
                form = "стаканов";
            }
        }

        int printLength = String.valueOf(number).length() + 2 + String.valueOf(form).length();
        System.out.printf("%-10s: %s %s %" + (25 - printLength) + ".2f $\n", drink, number, form, price);

    }

    public static void printOrderedItem(Drinks2 drink, int drinks) {
        String form = "";
        String spirit = "";

        switch (drinks % 10) {
            case 1:
                if (drink == Drinks2.TEA || drink == Drinks2.COFFEE) {
                    form = "чашку";
                } else {
                    form = "стакан";
                }
                break;
            case 2:
            case 3:
            case 4:
                if (drink == Drinks2.TEA || drink == Drinks2.COFFEE) {
                    form = "чашки";
                } else {
                    form = "стакана";
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                if (drink == Drinks2.TEA || drink == Drinks2.COFFEE) {
                    form = "чашек";
                } else {
                    form = "стаканов";
                }
                break;
        }
        if (drinks % 100 > 10 && drinks % 100 < 15) {
            if (drink == Drinks2.COFFEE || drink == Drinks2.TEA) {
                form = "чашек";
            } else {
                form = "стаканов";
            }
        }
        switch (drink) {
            case TEA:
                spirit = "чая";
                break;
            case COFFEE:
                spirit = "кофе";
                break;
            case LEMONADE:
                spirit = "лимонада";
                break;
            case SODA:
                spirit = "минералки";
                break;
            case MOJITO:
                spirit = "мохито";
                break;
            case COCA:
                spirit = "колы";
                break;
        }

        System.out.printf("Вы заказали %d %s %s\n", drinks, form, spirit);

    }

    public static void main(String[] args) {

        do {
            getUserOrder();
            if (!orderBook.containsKey(userChoice)) {
                orderBook.put(userChoice, numberOfDrinks);
            } else {
                int updatedQuantity = orderBook.get(userChoice) + numberOfDrinks;
                orderBook.put(userChoice, updatedQuantity);
            }
            System.out.println("Хотите заказать что-то еще? Введите " + (char) 27 + "[1m" + (char) 27 + "[34m" + " Да/Yes/y/д" + (char) 27 + "[0m для подтверждения");
            newOrder = scanner.nextLine().toLowerCase();
        } while (newOrder.contains("да") ||
                newOrder.contains("yes") ||
                newOrder.contains("д") ||
                newOrder.contains("y"));

        printOrderBook();

    }
}
