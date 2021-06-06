package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.jaroslav;

import java.util.Arrays;
import java.util.Scanner;

public class DrinksMachineMain {

    public static void main(String[] args) {
        menu();

    }
    public static void  menu(){
        String drinkChoice;
        Scanner sc = new Scanner(System.in);
        String menuChoice;
        int quantity;
        double check = 0;
        double total = 0;
        DrinksMachine drink;

        System.out.println("Автомат напитков предлагает напитки:");
        do {
            System.out.println(Arrays.toString(DrinksMachine.values()));
            System.out.print("Выберите напиток (введите название): ");
            drinkChoice = sc.next();
            drink = ExceptChecking(drinkChoice);
            System.out.print("Введите количество: ");
            quantity = positiveIntegerChecker();
            switch (drink) {
                case COFFEE:
                    Drinks.setCoffeeQuantity(quantity);
                    Drinks.makeCoffee();
                    check = Drinks.getCoffeeSum();
                    break;
                case TEA:
                    Drinks.setTeaQuantity(quantity);
                    Drinks.makeTea();
                    check = Drinks.getTeaSum();
                    break;
                case LEMONADE:
                    Drinks.setLemonadeQuantity(quantity);
                    Drinks.makeLemonade();
                    check = Drinks.getLemonadeSum();
                    break;
                case MOJITO:
                    Drinks.setMojitoQuantity(quantity);
                    Drinks.makeMojito();
                    check = Drinks.getMojitoSum();
                    break;
                case SODA:
                    Drinks.setSodaQuantity(quantity);
                    Drinks.makeSoda();
                    check = Drinks.getSodaSum();
                    break;
                case COCACOLA:
                    Drinks.setCocaColaQuantity(quantity);
                    Drinks.makeCocaCola();
                    check = Drinks.getCocaColaSum();
                    break;
            }
            total = total + check;
            System.out.print("Желаете еще напитков? " +
                    Colors.UNDERLINED_ITALIC_BLUE + "Y" + Colors.RESET + Colors.ITALIC_BLUE + "es/" +
                    Colors.UNDERLINED_ITALIC_BLUE + "N" + Colors.RESET + Colors.ITALIC_BLUE + "o " + Colors.RESET);
            menuChoice = sc.next().toUpperCase();
            while (!(menuChoice.equals("YES") || menuChoice.equals("Y") || menuChoice.equals("NO") || menuChoice.equals("N"))) {
                System.out.print("Ошибка ввода. Повторите ");
                menuChoice = sc.next().toUpperCase();
            }
        } while (!(menuChoice.equals("NO") || menuChoice.equals("N")));
        //calling static method from Drinks class for print receipt
        Drinks.receipt(total);

    }
    //catching an exception on drinks typing by the user
    public static DrinksMachine ExceptChecking(String drinkChoice) {
        Scanner sc = new Scanner(System.in);
        DrinksMachine drink = null;
        while (drink == null) {
            try {
                drink = DrinksMachine.valueOf(drinkChoice.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.print("Ошибка ввода. Повторите: ");
                drinkChoice = sc.next();
            }
        }
        return drink;
    }

    //checking quantity for positive numbers
    public static int positiveIntegerChecker() {
        Scanner sc = new Scanner(System.in);
        int checkedItem;
        do {
            while (!sc.hasNextInt()) {
                System.out.print("Это не число! Повторите: ");
                sc.next();
            }
            checkedItem = sc.nextInt();
            if (checkedItem < 0 ) {
                System.out.print("Это число отрицательное. Повторите: ");
            }
        } while (checkedItem < 0);

        return checkedItem;
    }
}
