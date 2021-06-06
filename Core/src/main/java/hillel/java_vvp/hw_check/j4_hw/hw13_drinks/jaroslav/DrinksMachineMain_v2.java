package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.jaroslav;



import java.util.Arrays;
import java.util.Scanner;

public class DrinksMachineMain_v2 {

    public static void main(String[] args) {
        DrinksMachine_v2.printPriceList();
        menu();

    }
    public static void  menu(){
        String drinkChoice;
        Scanner sc = new Scanner(System.in);
        String menuChoice;
        int quantity;
        double check = 0;
        double total = 0;
        DrinksMachine_v2 drink;

        do {
            System.out.println(Colors.LIGHT_BLUE_BOLD_ITALIC + "\n" + Arrays.toString(DrinksMachine_v2.values()) + Colors.RESET);
            System.out.print("Выберите напиток из списка: ");
            drinkChoice = sc.next();
            drink = ExceptChecking(drinkChoice);
            System.out.print("Введите количество: ");
            quantity = positiveIntegerChecker();
            switch (drink) {
                case COFFEE:
                    Drinks_v2.setCoffeeQuantity(quantity);
                    Drinks_v2.makeCoffee();
                    check = Drinks_v2.getCoffeeSum();
                    break;
                case TEA:
                    Drinks_v2.setTeaQuantity(quantity);
                    Drinks_v2.makeTea();
                    check = Drinks_v2.getTeaSum();
                    break;
                case LEMONADE:
                    Drinks_v2.setLemonadeQuantity(quantity);
                    Drinks_v2.makeLemonade();
                    check = Drinks_v2.getLemonadeSum();
                    break;
                case MOJITO:
                    Drinks_v2.setMojitoQuantity(quantity);
                    Drinks_v2.makeMojito();
                    check = Drinks_v2.getMojitoSum();
                    break;
                case SODA:
                    Drinks_v2.setSodaQuantity(quantity);
                    Drinks_v2.makeSoda();
                    check = Drinks_v2.getSodaSum();
                    break;
                case COCACOLA:
                    Drinks_v2.setCocaColaQuantity(quantity);
                    Drinks_v2.makeCocaCola();
                    check = Drinks_v2.getCocaColaSum();
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
        Drinks_v2.receipt(total);

    }
    //catching an exception on drinks typing by the user
    public static DrinksMachine_v2 ExceptChecking(String drinkChoice) {
        Scanner sc = new Scanner(System.in);
        DrinksMachine_v2 drink = null;
        while (drink == null) {
            try {
                drink = DrinksMachine_v2.valueOf(drinkChoice.toUpperCase());
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
