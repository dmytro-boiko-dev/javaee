package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.jaroslav;

public class Drinks {
    //constants with prices
    public static final double COFFEE_PRICE = 3.20;
    public static final double TEA_PRICE = 2.50;
    public static final double LEMONADE_PRICE = 5.00;
    public static final double MOJITO_PRICE = 10.25;
    public static final double SODA_PRICE = 1.50;
    public static final double COCA_COLA_PRICE = 8.75;
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

    //getters
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

    //setters with quantity incrementing
    public static void setCoffeeQuantity(int coffeeQuantity) {
        Drinks.coffeeQuantity = Drinks.coffeeQuantity + coffeeQuantity;
    }

    public static void setTeaQuantity(int teaQuantity) {
        Drinks.teaQuantity = Drinks.teaQuantity + teaQuantity;
    }

    public static void setLemonadeQuantity(int lemonadeQuantity) {
        Drinks.lemonadeQuantity = Drinks.lemonadeQuantity + lemonadeQuantity;
    }

    public static void setMojitoQuantity(int mojitoQuantity) {
        Drinks.mojitoQuantity = Drinks.mojitoQuantity + mojitoQuantity;
    }

    public static void setSodaQuantity(int sodaQuantity) {
        Drinks.sodaQuantity = Drinks.sodaQuantity + sodaQuantity;
    }

    public static void setCocaColaQuantity(int cocaColaQuantity) {
        Drinks.cocaColaQuantity = Drinks.cocaColaQuantity + cocaColaQuantity;
    }

    //methods for calculating sum and displaying result
    public static void makeCoffee() {
        coffeeSum = Math.round(coffeeQuantity * COFFEE_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость чашки кофе - \u20AC" + COFFEE_PRICE);
        System.out.println("Сумма за " + coffeeQuantity + " чашки(чашек) кофе составляет: \u20AC" + coffeeSum);
    }

    public static void makeTea() {
        teaSum = Math.round(teaQuantity * TEA_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость чашки чая - \u20AC" + TEA_PRICE);
        System.out.println("Сумма за " + teaQuantity + " чашки(чашек) чая составляет: \u20AC" + teaSum);
    }

    public static void makeLemonade() {
        lemonadeSum = Math.round(lemonadeQuantity * LEMONADE_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость стакана лимонада - \u20AC" + LEMONADE_PRICE);
        System.out.println("Сумма за " + lemonadeQuantity + " стакана(ов) лимонада составляет: \u20AC" + lemonadeSum);
    }

    public static void makeMojito() {
        mojitoSum = Math.round(mojitoQuantity * MOJITO_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость стакана Мохито - \u20AC" + MOJITO_PRICE);
        System.out.println("Сумма за " + mojitoQuantity + " стакана(ов) Мохито составляет: \u20AC" + mojitoSum);
    }

    public static void makeSoda() {
        sodaSum = Math.round(sodaQuantity * SODA_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость стакана минеральной воды - \u20AC" + SODA_PRICE);
        System.out.println("Сумма за " + sodaQuantity + " стакана(ов) минеральной воды составляет: \u20AC" + sodaSum);
    }

    public static void makeCocaCola() {
        cocaColaSum = Math.round(cocaColaQuantity * COCA_COLA_PRICE * 100.0) / 100.0;
        System.out.println("Стоимость бутылки Coca Cola - \u20AC" + COCA_COLA_PRICE);
        System.out.println("Сумма за " + cocaColaQuantity + " бутылки(бутылок) Coca Cola составляет: \u20AC" + cocaColaSum);
    }

    //displaying receipt
    public static void receipt(double total) {
        System.out.println("\n-------------------------------");
        System.out.println("-------------ЧЕК---------------\n");
        if (coffeeQuantity != 0) {
            System.out.println("КОФЕ х" + coffeeQuantity + "...................\u20AC" + coffeeSum);
        }
        if (teaQuantity != 0) {
            System.out.println("ЧАЙ х" + teaQuantity + "....................\u20AC" + teaSum);
        }
        if (lemonadeQuantity != 0) {
            System.out.println("ЛИМОНАД х" + lemonadeQuantity + "................\u20AC" + lemonadeSum);
        }
        if (mojitoQuantity != 0) {
            System.out.println("МОХИТО х" + mojitoQuantity + ".................\u20AC" + mojitoSum);
        }
        if (sodaQuantity != 0) {
            System.out.println("МИНЕРАЛЬНАЯ ВОДА х" + sodaQuantity + ".......\u20AC" + sodaSum);
        }
        if (cocaColaQuantity != 0) {
            System.out.println("COCA COLA х" + cocaColaQuantity + "..............\u20AC" + cocaColaSum);
        }
        System.out.println("\n-------------------------------");
        System.out.println("Итого к оплате: ..........\u20AC" + total);

    }

}
