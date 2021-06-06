package hillel.java_vvp.hw_check.j1_hw.drinks.alex_gal;


import java.util.Scanner;

public class Drinks {

    public static final int TEAPRICE = 12;
    public static final int COFFEEPRICE = 15;
    public static final int LEMONADEPRICE = 20;
    public static final int MOJITOPRICE = 23;
    public static final int MINERALWATERPRICE = 25;
    public static final int COCACOLAPRICE = 30;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinksMaсhine[] drink = {DrinksMaсhine.TEA, DrinksMaсhine.COFFEE, DrinksMaсhine.LEMONADE, DrinksMaсhine.MOJITO,
                DrinksMaсhine.MINERALWATER, DrinksMaсhine.COCACOLA};
        for (int i = 0; i < drink.length; i++) {
            System.out.println("====================================================================================");
            System.out.println(ANSI_BLUE + "Выберите пожалуйста напиток по номеру из списка: " + "\n" + "Чай - номер 1"
                    + "\n" + "Кофе - номер 2" + "\n" + "Лимонад - номер 3" + "\n" + "Мохито - номер 4" + "\n" +
                    "Минеральная вода - номер 5" + "\n" + "Кока - Кола - номер 6" + ANSI_RESET);
            System.out.println("====================================================================================");
            int a = scanner.nextInt();
            if (a > 6) {
                System.out.println(ANSI_RED + "Товар времено не доступен" + ANSI_RESET);
                return;
            }
            switch (a) {
                case 1:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Чай" + " " + "по цене за 1 стакан : " + TEAPRICE +
                            "грн." + ANSI_RESET);
                    break;
                case 2:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Кофе" + " " + "по цене за 1 стакан : " + COFFEEPRICE +
                            "грн." + ANSI_RESET);
                    break;
                case 3:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Лимонад" + " " + "по цене за 1 бутылку : " +
                            LEMONADEPRICE + "грн." + ANSI_RESET);
                    break;
                case 4:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Мохито" + " " + "по цене за 1 бутылку : " +
                            MOJITOPRICE + "грн." + ANSI_RESET);
                    break;
                case 5:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Минеральную воду" + " " + "по цене за 1 бутылку : " +
                            MINERALWATERPRICE + "грн." + ANSI_RESET);
                    break;
                case 6:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Кока - Колу" + " " + "по цене за 1 бутылку : " +
                            COCACOLAPRICE + "грн." + ANSI_RESET);
                    break;
                default:
            }
            System.out.println();
            System.out.println(ANSI_BLUE + "Выберите количество желаемого напитка" + ANSI_RESET);
            int b = scanner.nextInt();
            int result1 = TEAPRICE * b;
            int result2 = COFFEEPRICE * b;
            int result3 = LEMONADEPRICE * b;
            int result4 = MOJITOPRICE * b;
            int result5 = MINERALWATERPRICE * b;
            int result6 = COCACOLAPRICE * b;
            switch (a) {
                case 1:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Чай" + " " + "в количестве : " + b + " шт."
                            + ANSI_RESET);
                    break;
                case 2:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Кофе" + " " + "в количестве : " + b + " шт."
                            + ANSI_RESET);
                    break;
                case 3:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Лимонад" + " " + "в количестве : " + b + " шт."
                            + ANSI_RESET);
                    break;
                case 4:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Мохито" + " " + "в количестве : " + b + " шт."
                            + ANSI_RESET);
                    break;
                case 5:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Минеральную воду" + " " + "в количестве : " + b +
                            " шт." + ANSI_RESET);
                    break;
                case 6:
                    System.out.println(ANSI_YELLOW + "Вы выбрали Кока - Колу" + " " + "в количестве : " + b + " шт." +
                            ANSI_RESET);
                    break;
                default:
                    return;
            }
            System.out.println();
            if (a == 1) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result1 + "грн" + ANSI_RESET);
            } else if (a == 2) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result2 + "грн" + ANSI_RESET);
            } else if (a == 3) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result3 + "грн" + ANSI_RESET);
            } else if (a == 4) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result4 + "грн" + ANSI_RESET);
            } else if (a == 5) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result5 + "грн" + ANSI_RESET);
            } else if (a == 6) {
                System.out.println(ANSI_CYAN + "Ваш заказ составил : " + result6 + "грн" + ANSI_RESET);
            } else {
                return;
            }
            System.out.println();
            System.out.println("Желаете продолжить ваш заказ?" + "\n" + "\n" + "Нажмите 1, если желаете продолжить" +
                    "\n" + "Нажмите 2, если желаете закончить ваш выбор и приготовить ваш заказ");
            int c = scanner.nextInt();
            if (c == 2) {
                if (a == 1) {
                    return;
                }
            }
        }
    }
}