package hillel.java_vvp.hw_check.j1_hw.drinks.vlad;


import java.util.Scanner;

public class Drinks {
    static Scanner scanner = new Scanner(System.in);

    public static final double COFFEE_COST = 7.95;
    public static final double TEA_COST = 5.70;
    public static final double LEMONADE_COST = 9.99;
    public static final double MOJITO_COST = 12.50;
    public static final double WATER_COST = 4.00;
    public static final double COCA_COLA_COST = 5.82;

    public static void main(String[] args) {
        String answer;
        double totalOrder = 0;
        do {
            double yourOrder = order();
            totalOrder += yourOrder;
            System.out.println("Ваш заказ составляет: " + totalOrder + " $");
            System.out.println("Хотите еще что-то заказать: YES / NO");
            answer = scanner.next();
        }
        while (answer.equalsIgnoreCase("YES"));
        System.out.println("*************************************************");
        System.out.println((char) 27 + "[32mИТОГОВАЯ СУММА ВАШЕГО ЗАКАЗА: " + totalOrder + " $" + (char)27 + "[0m");
        System.out.println("Внесите деньги в автомат.");
        System.out.println("Спасибо, что воспользовались и ждем вас снова!");
    }

    public static double order(){
        double totalCost = 0;
        System.out.println("***********************************************");
        System.out.println((char) 27 + "[34mАвтомат для напитков имеет следующие напитки: " + (char)27 + "[0m");
        System.out.println("COFFEE    - " + (char) 27 + "[32m7.95 $" + (char)27 + "[0m");
        System.out.println("TEA       - " + (char) 27 + "[32m5.70 $" + (char)27 + "[0m");
        System.out.println("LEMONADE  - " + (char) 27 + "[32m9.99 $" + (char)27 + "[0m");
        System.out.println("MOJITO    - " + (char) 27 + "[32m12.50 $" + (char)27 + "[0m");
        System.out.println("WATER     - " + (char) 27 + "[32m4.00 $" + (char)27 + "[0m");
        System.out.println("COCA_COLA - " + (char) 27 + "[32m5.82 $" + (char)27 + "[0m");
        System.out.println("***********************************************");
        String drinksChoice = "";
        while (!isContain(drinksChoice)) {
            System.out.print("Впишите литерами какой напиток вы желаете: ");
            drinksChoice = scanner.next().toUpperCase();
        }
        DrinksMachine drinksMachine = DrinksMachine.valueOf(drinksChoice);
        switch (drinksMachine) {
            case COFFEE:
                System.out.print("Сколько чашек кофе вы хотите: ");
                int coffeeAmount = getInt();
                totalCost = coffeeAmount * COFFEE_COST;
                break;
            case TEA:
                System.out.print("Сколько чашек чая вы хотите: ");
                int teaAmount = getInt();
                totalCost = teaAmount * TEA_COST;
                break;
            case LEMONADE:
                System.out.print("Сколько стаканов лимонада вы хотите: ");
                int lemonadeAmount = getInt();
                totalCost = lemonadeAmount * LEMONADE_COST;
                break;
            case MOJITO:
                System.out.print("Сколько бокалов мохито вы хотите: ");
                int mojitoAmount = getInt();
                totalCost = mojitoAmount * MOJITO_COST;
                break;
            case WATER:
                System.out.print("Сколько стаканов воды вы хотите: ");
                int waterAmount = getInt();
                totalCost = waterAmount * WATER_COST;
                break;
            case COCA_COLA:
                System.out.print("Сколько стаканов кока-колы вы хотите: ");
                int coca_colaAmount = getInt();
                totalCost = coca_colaAmount * COCA_COLA_COST;
                break;
        }

        return totalCost;
    }

    private static boolean isContain(String s) {
        for (DrinksMachine val : DrinksMachine.values()) {
            if (val.name().equals(s)) return true;
        }
        return false;
    }

    public static int getInt() {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Ошибка ввода. Количество напитков не может быть отрицательным или равным нулю.");
                System.out.print("Попробуйте ввести число еще раз: ");
                num = getInt();
            }
        } else {
            System.out.print("Ошибка ввода. Попробуйте ввести число еще раз: ");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}