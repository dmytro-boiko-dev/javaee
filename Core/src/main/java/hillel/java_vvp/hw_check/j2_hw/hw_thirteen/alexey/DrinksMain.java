package hillel.java_vvp.hw_check.j2_hw.hw_thirteen.alexey;


import java.util.Scanner;

public class DrinksMain {

    public static void main(String[] args) {

        System.out.println("Вас приветствует компания Полные животики (все права защищены)");

        do {

            System.out.println("Выберите что хотите заказать" + "\n" + "В наличии:");
            System.out.println("1. Кофе - " + Drinks.COFFEE_PRICE + "\n" + "2. Чай - " + Drinks.TEA_PRICE + "\n" +
                    "3. Лимонад - " + Drinks.LEMONADE_PRICE + "\n" + "4. Мохито - " + Drinks.MOHITO_PRICE + "\n" +
                    "5. Вода - " + Drinks.MINERAL_WATER_PRICE + "\n" + "6. Кола - " + Drinks.COCA_COLA_PRICE);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice < 0 || choice > DrinksMachine.values().length) {
                System.out.println("Неверный номер.");
                continue;
            }

            // Приводим int к DrinksMachine
            DrinksMachine chosenDrink = DrinksMachine.values()[choice - 1]; // -1 нужен т.к. отсчёт в массиве начинается
            // с 0
            switch (chosenDrink) {
                case COFFEE:
                    Drinks drinks = new Drinks(Drinks.COFFEE_PRICE, DrinksMachine.COFFEE);
                    break;
                case TEA:
                    Drinks drinks2 = new Drinks(Drinks.TEA_PRICE, DrinksMachine.TEA);
                    break;
                case LEMONADE:
                    Drinks drinks3 = new Drinks(Drinks.LEMONADE_PRICE, DrinksMachine.LEMONADE);
                    break;
                case MOHITO:
                    Drinks drinks4 = new Drinks(Drinks.MOHITO_PRICE, DrinksMachine.MOHITO);
                    break;
                case MINERAL_WATER:
                    Drinks drinks5 = new Drinks(Drinks.MINERAL_WATER_PRICE, DrinksMachine.MINERAL_WATER);
                    break;
                case COCA_COLA:
                    Drinks drinks6 = new Drinks(Drinks.COCA_COLA_PRICE, DrinksMachine.COCA_COLA);
                    break;
            }


        } while (checkIfContinue());
    }

    public static boolean checkIfContinue() {   // Метод для повтора вопроса

        while (true) {

            System.out.println("Хотите продолжить заказ?" + "\n" + "Y/N (Введите символ)");
            Scanner scanner1 = new Scanner(System.in);
            String repeat = scanner1.nextLine().toLowerCase(); // toLowerCase() - приводит символ к нижнему регистру

            if (repeat.compareTo("y") == 0) {
                return true;
            } else if (repeat.compareTo("n") == 0) {
                System.out.println("Спасибо за использование нашей продукции!");
                return false;
            } else System.out.println("Неверный ввод. Повторите ввод.");


        }
    }
}
