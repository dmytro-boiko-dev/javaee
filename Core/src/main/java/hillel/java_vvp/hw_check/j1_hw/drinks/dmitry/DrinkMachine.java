package hillel.java_vvp.hw_check.j1_hw.drinks.dmitry;


import java.util.Scanner;

public class DrinkMachine {
    public static final int COST_OF_COFFEE = 10;
    public static final int COST_OF_TEA = 8;
    public static final int COST_OF_LEMONADE = 18;
    public static final int COST_OF_MOJITO = 18;
    public static final int COST_OF_MINERAL = 10;
    public static final int COST_OF_COCA_COLA = 15;
    static int SUM_COFFEE = 0;
    static int COUNT_COFFEE = 0;
    static int COUNT_TEA = 0;
    static int SUM_TEA = 0;
    static int SUM_COCA_COLA = 0;
    static int COUNT_COCA_COLA = 0;
    static int SUM_MOJITO = 0;
    static int COUNT_MOJITO = 0;
    static int SUM_MINERAL = 0;
    static int COUNT_MINERAL = 0;
    static int SUM_LEMONADE = 0;
    static int COUNT_LEMONADE = 0;
    static int result;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cont;

        System.out.println("Добрый день! Пожалуйста, выберите желаемый напиток из списка: ");
        do {
            Receipt.colorsType();

            String drinkChoice = scan.next();
            while (!drinkChoice.equals("tea") && !drinkChoice.equals("TEA")
                    && !drinkChoice.equals("coffee") && !drinkChoice.equals("COFFEE")
                    && !drinkChoice.equals("lemonade") && !drinkChoice.equals("LEMONADE")
                    && !drinkChoice.equals("coca_cola") && !drinkChoice.equals("COCA_COLA")
                    && !drinkChoice.equals("mojito") && !drinkChoice.equals("MOJITO")
                    && !drinkChoice.equals("mineral") && !drinkChoice.equals("MINERAL")
                    && !drinkChoice.equals("EXIT") && !drinkChoice.equals("exit")
            ) {
                System.out.println(Colors.BLACK + "the entered value is not valid, please try again" + Colors.RESET);
                System.out.println("Пожалуйста, сделайте Ваш выбор: ");
                drinkChoice = scan.next();
            }
            drinkChoice = drinkChoice.toUpperCase();
            Drinks drinks = Drinks.valueOf(drinkChoice);

            switch (drinks) {

                case COCA_COLA:
                    Receipt.MakeCOCA_COLA();
                    break;
                case COFFEE:
                    Receipt.MakeCoffee();
                    break;
                case TEA:
                    Receipt.MakeTea();
                    break;
                case MOJITO:
                    Receipt.MakeMOJITO();
                    break;
                case MINERAL:
                    Receipt.MakeMINERAL();
                    break;
                case LEMONADE:
                    Receipt.MakeLEMONADE();
                    break;
                case EXIT:
                    Receipt.Exit();
            }

            System.out.println("Желаете заказть что-нибудь еще? " + "\n" + "<да/нет>" + " или " + "<yes/no>");
            cont = scan.nextLine();
            while (!cont.equals("да") && !cont.equals("нет")
                    && !cont.equals("no") && !cont.equals("yes")) {
                cont = scan.nextLine();
            }
        } while (cont.equals("да") || cont.equals("yes"));

        result = SUM_COFFEE + SUM_TEA + SUM_COCA_COLA + SUM_MOJITO + SUM_MINERAL + SUM_LEMONADE;

        System.out.println();
        System.out.println("Ваш заказ: ");
        Receipt.order();
        System.out.println(Colors.PURPLE + "****************" + Colors.RESET);
        System.out.println("К оплате: " + result + " UAH");
        System.out.println("_____________________");
        Receipt.prediction();

    }

}