package hillel.java_vvp.hw_check.j1_hw.drinks.alex;

import java.util.Scanner;

public class Price {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final double priceCoffee = 16.45;
    public static final double priceTea = 14.55;
    public static final double priceLemonade = 9.99;
    public static final double priceMojito = 14.85;
    public static final double priceMineralWater = 8.36;
    public static final double priceCocaCola = 12.49;
    static int countAllCoffee = 0;
    static double priceAllCoffee = 0;
    static int countAllTea = 0;
    static double priceAllTea = 0;
    static int countAllLemonade = 0;
    static double priceAllLemonade = 0;
    static int countAllMojito = 0;
    static double priceAllMojito = 0;
    static int countAllMineralWater = 0;
    static double priceAllMineralWater = 0;
    static int countAllCocaCola = 0;
    static double priceAllCocaCola = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isExit = true;
        while (isExit) {
            System.out.println("Выберите напиток:");
            System.out.println(ANSI_RED+"COFFEE "+ANSI_BLUE+"TEA "+ANSI_CYAN+ "LEMONADE "+ANSI_GREEN+"MOJITO "+ANSI_PURPLE+"MINERAL_WATER "+ANSI_YELLOW+"COCA_COLA"+ANSI_RESET);
            isExit = false;
            String drinkChoice;
            drinkChoice = scan.next();
            drinkChoice = drinkChoice.toUpperCase();
            while(!drinkChoice.equals("COFFEE") && !drinkChoice.equals("TEA") && !drinkChoice.equals("LEMONADE")
                    &&!drinkChoice.equals("MOJITO") && !drinkChoice.equals("MINERAL_WATER") && !drinkChoice.equals("COCA_COLA")){
                System.out.println("Извинет у нас нет такого напитка!\nВведите снова название напитка: ");
                drinkChoice = scan.next();
                drinkChoice = drinkChoice.toUpperCase();
            }
            DrinkMachines drinks = DrinkMachines.valueOf(drinkChoice);


            switch (drinks) {
                case COFFEE:
                    createCoffee();
                    break;
                case TEA:
                    createTea();
                    break;
                case LEMONADE:
                    createLemonade();
                    break;
                case MOJITO:
                    createMojito();
                    break;
                case MINERAL_WATER:
                    createMineralWater();
                    break;
                case COCA_COLA:
                    createCocaCola();
                    break;
            }
            System.out.println("Желаете ещё что-то заказать?\nДа/Нет");
            String s = scan.next();
            while (!s.equals("Yes") && !s.equals("Да") && !s.equals("yes") && !s.equals("да")
                    && !s.equals("Нет") && !s.equals("No") && !s.equals("нет") && !s.equals("no")) {
                System.out.println("Неправильная команда введите одну из предложенный yes/Yes/Да/да или no/No/Нет/нет");
                s = scan.next();
            }
            if (s.equals("Да") || s.equals("Yes") || s.equals("yes") || s.equals("да")) {
                isExit = true;
            } else if (s.equals("No") || s.equals("Нет") || s.equals("нет") || s.equals("no")) {
                isExit = false;
                System.out.println(ANSI_RED+"\t\tВаш чек:"+ANSI_RESET );
                if (countAllCoffee>0){
                    System.out.print("Кофе "+ countAllCoffee +"  __________________________");
                    System.out.printf("%.2f",priceAllCoffee);
                    System.out.println("$");
                }
                if (countAllTea>0){
                    System.out.print("Чай "+ countAllTea  +"  ___________________________");
                    System.out.printf("%.2f",priceAllTea);
                    System.out.println("$");
                }
                if (countAllLemonade>0){
                    System.out.print("Лимонад "+ countAllLemonade  +"  _______________________");
                    System.out.printf("%.2f",priceAllLemonade);
                    System.out.println("$");
                }
                if (countAllMojito>0){
                    System.out.print("Мохито "+ countAllMojito  +"  ________________________");
                    System.out.printf("%.2f",priceAllMojito);
                    System.out.println("$");
                }
                if (countAllMineralWater>0){
                    System.out.print("Минеральная вода "+ countAllMineralWater  +"  ______________");
                    System.out.printf("%.2f",priceAllMineralWater);
                    System.out.println("$");
                }
                if (countAllCocaCola>0){
                    System.out.print("Кока-кола "+ countAllCocaCola  +"  _____________________");
                    System.out.printf("%.2f",priceAllCocaCola);
                    System.out.println("$");
                }
                System.out.println("Общее колличество напитков : "+ (countAllCoffee+countAllLemonade+countAllMojito+
                        countAllMineralWater+countAllCocaCola+countAllTea));
                System.out.print("Итог : ");
                System.out.printf("%.2f", (priceAllCocaCola+priceAllMineralWater+priceAllMojito+priceAllLemonade+
                        priceAllTea+priceAllCoffee));
                System.out.println("$");
            }
        }


    }

    public static void createCoffee() {

        System.out.println("Стоимость одного стакана кофе " + priceCoffee + "$\nСколько стаканов кофе желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан кофе №" + (i + 1));
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
            }
        }
        countAllCoffee = countAllCoffee+j;
        priceAllCoffee =priceAllCoffee+j*priceCoffee;
        System.out.print("Стоимость за кофе : " );
        System.out.printf("%.2f", priceCoffee );
        System.out.print("$\n");

    }

    public static void createTea() {
        System.out.println("Стоимость одного стакана чая " + priceTea + "$\nСколько стаканов чая желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан чая №" + (i + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
        }
        countAllTea = countAllTea+j;
        priceAllTea =priceAllTea+j*priceTea;
        System.out.print("Стоимость за чай : " );
        System.out.printf("%.2f", priceAllTea );
        System.out.print("$\n");

    }

    public static void createLemonade() {
        System.out.println("Стоимость одного стакана лимонада " + priceLemonade + "$\nСколько стаканов лимонада желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан лимонада №" + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        countAllLemonade = countAllLemonade+j;
        priceAllLemonade =priceAllLemonade+j*priceLemonade;
        System.out.print("Стоимость за лимонад : " );
        System.out.printf("%.2f", priceAllLemonade );
        System.out.print("$\n");
    }

    public static void createMojito() {
        System.out.println("Стоимость одного стакана мохито " + priceMojito + "$\nСколько стаканов мохито желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан мохито №" + (i + 1));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
        countAllMojito = countAllMojito+j;
        priceAllMojito =priceAllMojito+j*priceMojito;
        System.out.print("Стоимость за мохито : " );
        System.out.printf("%.2f", priceAllMojito );
        System.out.print("$\n");
    }

    public static void createMineralWater() {
        System.out.println("Стоимость одного стакана минеральной воды " + priceMineralWater + "$\nСколько стаканов минеральной воды желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан минеральной воды №" + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        countAllMineralWater = countAllMineralWater+j;
        priceAllMineralWater =priceAllMineralWater+j*priceMineralWater;
        System.out.print("Стоимость за минеральную воду : " );
        System.out.printf("%.2f", priceAllMineralWater );
        System.out.print("$\n");
    }

    public static void createCocaCola() {
        System.out.println("Стоимость одного стакана кока-колы воды " + priceCocaCola + "$\nСколько стаканов минеральной кока-колы желаете?");
        int j = check();
        for (int i = 0; i < j; i++) {
            System.out.println("Подождите готовится стакан кока-колы №" + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        countAllCocaCola = countAllCocaCola+j;
        priceAllCocaCola =priceAllCocaCola+j*priceCocaCola;
        System.out.print("Стоимость за кока-колу : " );
        System.out.printf("%.2f", priceAllCocaCola );
        System.out.print("$\n");
    }

    public static int check() {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean isExit = false;

        //       System.out.println("Введите положительное число: ");

        while (!isExit) {
            isExit = true;
            if (!scan.hasNextInt()) {
                System.out.println("Это не число!");
                scan.next();
                isExit = false;
            } else {
                number = scan.nextInt();
                if (number < 0) {
                    System.out.println("Вы ввели:" + number + "\nВведите положительное число:");
                    isExit = false;
                }
            }
        }
        return number;
    }
}