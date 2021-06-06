package hillel.java_vvp.hw_check.j2_hw.hw_thirteen.anna;


import java.util.Arrays;
import java.util.Scanner;

public class DrinksMachineMain {
    //Смена цвета
    public static final String RESET = "\033[0m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String RED_BOLD = "\033[1;31m";

    public static void main(String[] args) {
        System.out.println(PURPLE_BOLD + "\t\t---Машина для напитков может приготовить : " + RESET);
        DrinksMachine drinksMachine = new DrinksMachine();
        String drinksChoice = ""; //Выбор напитка пользователем
        boolean rightInput;//Проверка на ввод
        Scanner scanner2 = new Scanner(System.in);
        String tempAnswer = "";//Временный ответ
        do {
            System.out.println(Arrays.toString(Drinks.values()));
            do {
                //Проверка на правильность ввода
                System.out.println("Пожалуйста, выберете напиток, который хотите заказать : ");
                rightInput = scanner2.hasNextInt();
                if (!rightInput) {
                    drinksChoice = scanner2.next();
                } else {
                    System.out.println(RED_BOLD + "\tОшибка! " +
                            "\t\nНужно ввести буквы!!! " +
                            "\t\nПопробуйте ещё раз!" + RESET);
                }
                scanner2.nextLine();
            } while (rightInput);
            //Приготовление напитка в соответстии с выбором пользоателя
            drinksChoice = drinksChoice.toUpperCase();
            Drinks drinks = Drinks.valueOf(drinksChoice);
            switch (drinks) {
                case TEA:
                    drinksMachine.costOfTea();
                    break;
                case COFFEE:
                    drinksMachine.costOfCoffee();
                    break;
                case SODA:
                    drinksMachine.costOfSoda();
                    break;
                case COCACOLA:
                    drinksMachine.costOfCocaCola();
                    break;
                case MOHITO:
                    drinksMachine.costOfMohito();
                    break;
            }
            do {
                System.out.println("Хотите заказать что то ещё?" + BLUE_BOLD + " Да/Нет" + RESET);
                rightInput = scanner2.hasNextInt();
                if (!rightInput) {
                    tempAnswer = scanner2.next();
                } else {
                    System.out.println(RED_BOLD + "\tОшибка! " +
                            "\t\nНужно ввести буквы!!! " +
                            "\t\nПопробуйте ещё раз!" + RESET);
                }
                scanner2.nextLine();
            } while (rightInput);
            tempAnswer = tempAnswer.toLowerCase();
        } while (tempAnswer.equals("да"));
        //Вывод общего кол-ва напитков и их цены
        System.out.println("========================================");
        System.out.println(PURPLE_BOLD + "\t---Ваш заказ : " + RESET);
        drinksMachine.totalCost();
        System.out.println();

    }
}