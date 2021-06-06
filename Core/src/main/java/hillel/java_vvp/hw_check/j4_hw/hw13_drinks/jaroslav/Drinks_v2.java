package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.jaroslav;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Drinks_v2 {
    //static variables for quantity counting
    private static int coffeeQuantity;
    private static int teaQuantity;
    private static int lemonadeQuantity;
    private static int mojitoQuantity;
    private static int sodaQuantity;
    private static int cocaColaQuantity;
    //static variables for sum calculating
    private static double coffeeSum;
    private static double teaSum;
    private static double lemonadeSum;
    private static double mojitoSum;
    private static double sodaSum;
    private static double cocaColaSum;

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    static DateTimeFormatter tmf = DateTimeFormatter.ofPattern("HH:mm");
    static LocalDate date = LocalDate.now();
    static LocalTime time = LocalTime.now();

    public static int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public static int getTeaQuantity() {
        return teaQuantity;
    }

    public static int getLemonadeQuantity() {
        return lemonadeQuantity;
    }

    public static int getMojitoQuantity() {
        return mojitoQuantity;
    }

    public static int getSodaQuantity() {
        return sodaQuantity;
    }

    public static int getCocaColaQuantity() {
        return cocaColaQuantity;
    }

    public static double getCoffeeSum() {
        return coffeeSum;
    }

    public static double getTeaSum() {
        return teaSum;
    }

    public static double getLemonadeSum() {
        return lemonadeSum;
    }

    public static double getMojitoSum() {
        return mojitoSum;
    }

    public static double getSodaSum() {
        return sodaSum;
    }

    public static double getCocaColaSum() {
        return cocaColaSum;
    }

    public static void setCoffeeQuantity(int coffeeQuantity) {
        Drinks_v2.coffeeQuantity = Drinks_v2.coffeeQuantity + coffeeQuantity;
    }

    public static void setTeaQuantity(int teaQuantity) {
        Drinks_v2.teaQuantity = Drinks_v2.teaQuantity + teaQuantity;
    }

    public static void setLemonadeQuantity(int lemonadeQuantity) {
        Drinks_v2.lemonadeQuantity = Drinks_v2.lemonadeQuantity + lemonadeQuantity;
    }

    public static void setMojitoQuantity(int mojitoQuantity) {
        Drinks_v2.mojitoQuantity = Drinks_v2.mojitoQuantity + mojitoQuantity;
    }

    public static void setSodaQuantity(int sodaQuantity) {
        Drinks_v2.sodaQuantity = Drinks_v2.sodaQuantity + sodaQuantity;
    }

    public static void setCocaColaQuantity(int cocaColaQuantity) {
        Drinks_v2.cocaColaQuantity = Drinks_v2.cocaColaQuantity + cocaColaQuantity;
    }

    //methods for calculating sum and displaying result
    public static void makeCoffee() {
        coffeeSum = Math.round(coffeeQuantity * DrinksMachine_v2.COFFEE.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость чашки кофе - \u20AC" + DrinksMachine_v2.COFFEE.getPrice());
        System.out.println("Сумма за " + coffeeQuantity + " чашки(чашек) кофе составляет: \u20AC" + coffeeSum);
    }

    public static void makeTea() {
        teaSum = Math.round(teaQuantity * DrinksMachine_v2.TEA.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость чашки чая - \u20AC" + DrinksMachine_v2.TEA.getPrice());
        System.out.println("Сумма за " + teaQuantity + " чашки(чашек) чая составляет: \u20AC" + teaSum);
    }

    public static void makeLemonade() {
        lemonadeSum = Math.round(lemonadeQuantity * DrinksMachine_v2.LEMONADE.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость стакана лимонада - \u20AC" + DrinksMachine_v2.LEMONADE.getPrice());
        System.out.println("Сумма за " + lemonadeQuantity + " стакана(ов) лимонада составляет: \u20AC" + lemonadeSum);
    }

    public static void makeMojito() {
        mojitoSum = Math.round(mojitoQuantity * DrinksMachine_v2.MOJITO.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость стакана Мохито - \u20AC" + DrinksMachine_v2.MOJITO.getPrice());
        System.out.println("Сумма за " + mojitoQuantity + " стакана(ов) Мохито составляет: \u20AC" + mojitoSum);
    }

    public static void makeSoda() {
        sodaSum = Math.round(sodaQuantity * DrinksMachine_v2.SODA.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость стакана минеральной воды - \u20AC" + DrinksMachine_v2.SODA.getPrice());
        System.out.println("Сумма за " + sodaQuantity + " стакана(ов) минеральной воды составляет: \u20AC" + sodaSum);
    }

    public static void makeCocaCola() {
        cocaColaSum = Math.round(cocaColaQuantity * DrinksMachine_v2.COCACOLA.getPrice() * 100.0) / 100.0;
        System.out.println("Стоимость бутылки Coca Cola - \u20AC" + DrinksMachine_v2.COCACOLA.getPrice());
        System.out.println("Сумма за " + cocaColaQuantity + " бутылки(бутылок) Coca Cola составляет: \u20AC" + cocaColaSum);
    }
    //displaying receipt
    public static void receipt(double total) {
        System.out.println("\nВаш чек, пожалуйста: \n");
        System.out.println(Colors.BLACK_WHITE_BG + "╭───────────────────────────────────╮" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "│   ------------ЧЕК---------------  │" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "│                                   │" + Colors.RESET);
        if (coffeeQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.COFFEE.getName() + " х");
            System.out.printf("%4d",coffeeQuantity);
            System.out.print(".................\u20AC" + DrinksMachine_v2.COFFEE.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", coffeeSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        if (teaQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.TEA.getName() + " х");
            System.out.printf("%4d",teaQuantity);
            System.out.print("..................\u20AC" + DrinksMachine_v2.TEA.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", teaSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        if (lemonadeQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.LEMONADE.getName() + " х");
            System.out.printf("%4d",lemonadeQuantity);
            System.out.print("..............\u20AC" + DrinksMachine_v2.LEMONADE.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", lemonadeSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        if (mojitoQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.MOJITO.getName() + " х");
            System.out.printf("%4d",mojitoQuantity);
            System.out.print("...............\u20AC" + DrinksMachine_v2.MOJITO.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", mojitoSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        if (sodaQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.SODA.getName() + " х");
            System.out.printf("%4d",sodaQuantity);
            System.out.print(".....\u20AC" + DrinksMachine_v2.SODA.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", sodaSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        if (cocaColaQuantity != 0) {
            System.out.print(Colors.BLACK_WHITE_BG + "│ " + DrinksMachine_v2.COCACOLA.getName() + " х");
            System.out.printf("%4d",cocaColaQuantity);
            System.out.print("............\u20AC" + DrinksMachine_v2.COCACOLA.getPrice());
            System.out.println("\t│" + Colors.RESET);
            System.out.print(Colors.BLACK_WHITE_BG + "│          Всего: \u20AC");
            System.out.printf("%5.2f", cocaColaSum);
            System.out.println("\t\t\t│" + Colors.RESET);
        }
        System.out.println(Colors.BLACK_WHITE_BG + "│                                   │" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "│   ------------------------------  │" + Colors.RESET);
        System.out.print(Colors.BLACK_WHITE_BG + "│ Итого к оплате: .......\u20AC");
        System.out.printf("%6.2f", total);
        System.out.println("\t│" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "│                                   │" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "│ " + dtf.format(date) + "                  " + tmf.format(time) + " │" + Colors.RESET);
        System.out.println(Colors.BLACK_WHITE_BG + "╰───────────────────────────────────╯" + Colors.RESET);

    }

}
