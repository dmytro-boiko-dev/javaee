package hillel.java_vvp.hw_check.j1_hw.drinks.dmitry;


import java.util.Random;
import java.util.Scanner;

public class Receipt {


    public static void MakeCoffee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Кофе: " + DrinkMachine.COST_OF_COFFEE + " UAH");
        System.out.println("Укажите количество стаканов: ");
        int countCoffee;
        do {
            System.out.println("Внимание, за один раз аппарат может приготовить не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countCoffee = scan.nextInt();
        } while (countCoffee < 0 || countCoffee > 10);
        System.out.println("Сумма заказа: " + (DrinkMachine.COST_OF_COFFEE * countCoffee) + " UAH");
        DrinkMachine.COUNT_COFFEE = DrinkMachine.COUNT_COFFEE + countCoffee;
        DrinkMachine.SUM_COFFEE = DrinkMachine.SUM_COFFEE + countCoffee * DrinkMachine.COST_OF_COFFEE;
    }

    public static void MakeTea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Чая: " + DrinkMachine.COST_OF_TEA + " UAH");
        System.out.println("Укажите количество стаканов: ");
        int countTea;
        do {
            System.out.println("Внимание, за один раз аппарат может приготовить не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countTea = scan.nextInt();
        } while (countTea < 0 || countTea > 10);
        System.out.println("Сумма заказа: " + DrinkMachine.COST_OF_TEA * countTea + " UAH");

        DrinkMachine.COUNT_TEA = DrinkMachine.COUNT_TEA + countTea;
        DrinkMachine.SUM_TEA = DrinkMachine.SUM_TEA + countTea * DrinkMachine.COST_OF_TEA;
    }

    public static void MakeCOCA_COLA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Кока Кола: " + DrinkMachine.COST_OF_COCA_COLA + " UAH");
        System.out.println("Укажите количество банок: ");
        int countCoca_cola;
        do {
            System.out.println("Внимание, за один раз аппарат может выдать не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countCoca_cola = scan.nextInt();
        } while (countCoca_cola < 0 || countCoca_cola > 10);
        System.out.println("Сумма заказа: " + (DrinkMachine.COST_OF_COCA_COLA * countCoca_cola) + " UAH");
        DrinkMachine.COUNT_COCA_COLA = DrinkMachine.COUNT_COCA_COLA + countCoca_cola;
        DrinkMachine.SUM_COCA_COLA = DrinkMachine.SUM_COCA_COLA + countCoca_cola * DrinkMachine.COST_OF_COCA_COLA;
    }

    public static void MakeLEMONADE() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Лимонада: " + DrinkMachine.COST_OF_LEMONADE + " UAH");
        System.out.println("Укажите количество бутылок: ");
        int countLemonade;
        do {
            System.out.println("Внимание, за один раз аппарат может выдать не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countLemonade = scan.nextInt();
        } while (countLemonade < 0 || countLemonade > 10);
        System.out.println("Сумма заказа: " + (DrinkMachine.COST_OF_LEMONADE * countLemonade) + " UAH");
        DrinkMachine.COUNT_LEMONADE = DrinkMachine.COUNT_LEMONADE + countLemonade;
        DrinkMachine.SUM_LEMONADE = DrinkMachine.SUM_LEMONADE + countLemonade * DrinkMachine.COST_OF_LEMONADE;
    }

    public static void MakeMINERAL() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Минералки: " + DrinkMachine.COST_OF_MINERAL + " UAH");
        System.out.println("Укажите количество бутылок: ");
        int countMineral;
        do {
            System.out.println("Внимание, за один раз аппарат может выдать не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countMineral = scan.nextInt();
        } while (countMineral < 0 || countMineral > 10);
        System.out.println("Сумма заказа: " + (DrinkMachine.COST_OF_MINERAL * countMineral) + " UAH");
        DrinkMachine.COUNT_MINERAL = DrinkMachine.COUNT_MINERAL + countMineral;
        DrinkMachine.SUM_MINERAL = DrinkMachine.SUM_MINERAL + countMineral * DrinkMachine.COST_OF_MINERAL;
    }

    public static void MakeMOJITO() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Стоимость Мохито: " + DrinkMachine.COST_OF_MOJITO + " UAH");
        System.out.println("Укажите количество стаканов: ");
        int countMojito;
        do {
            System.out.println("Внимание, за один раз аппарат может приготовить не более 10 напитков");
            while (!scan.hasNextInt()) {
                System.out.println("Warning! The value you entered is not an integer");
                scan.next();
            }
            countMojito = scan.nextInt();
        } while (countMojito < 0 || countMojito > 10);
        System.out.println("Сумма заказа: " + (DrinkMachine.COST_OF_MOJITO * countMojito) + " UAH");
        DrinkMachine.COUNT_MOJITO = DrinkMachine.COUNT_MOJITO + countMojito;
        DrinkMachine.SUM_MOJITO = DrinkMachine.SUM_MOJITO + countMojito * DrinkMachine.COST_OF_MOJITO;
    }

    public static void Exit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы уверены? (yes/да | no/нет)");
        String exit = scan.nextLine();
        while (!exit.equals("да") && !exit.equals("yes") && !exit.equals("no") && !exit.equals("нет")) {
            System.out.println("Сделайте Ваш выбор!");
        }
        if (exit.equals("yes") || exit.equals("да")) {
            System.out.println("Хорошего Вам дня");

        }

    }

    public static void order() {
        if (DrinkMachine.COUNT_MOJITO > 0) {
            System.out.println("Мохито.......... " + Colors.YELLOW + DrinkMachine.COUNT_MOJITO + "x" + DrinkMachine.COST_OF_MOJITO + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_MOJITO + Colors.RESET + " UAH");
        }
        if (DrinkMachine.COUNT_COFFEE > 0) {
            System.out.println("Кофе............ " + Colors.YELLOW + DrinkMachine.COUNT_COFFEE + "x" + DrinkMachine.COST_OF_COFFEE + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_COFFEE + Colors.RESET + " UAH");
        }
        if (DrinkMachine.COUNT_MINERAL > 0) {
            System.out.println("Минералка....... " + Colors.YELLOW + DrinkMachine.COUNT_MINERAL + "x" + DrinkMachine.COST_OF_MINERAL + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_MINERAL + Colors.RESET + " UAH");
        }
        if (DrinkMachine.COUNT_LEMONADE > 0) {
            System.out.println("Лимонад......... " + Colors.YELLOW + DrinkMachine.COUNT_LEMONADE + "x" + DrinkMachine.COST_OF_LEMONADE + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_LEMONADE + Colors.RESET + " UAH");
        }
        if (DrinkMachine.COUNT_COCA_COLA > 0) {
            System.out.println("Кока-Кола....... " + Colors.YELLOW + DrinkMachine.COUNT_COCA_COLA + "x" + DrinkMachine.COST_OF_COCA_COLA + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_COCA_COLA + Colors.RESET + " UAH");
        }
        if (DrinkMachine.COUNT_TEA > 0) {
            System.out.println("Чай............. " + Colors.YELLOW + DrinkMachine.COUNT_TEA + "x" + DrinkMachine.COST_OF_TEA + Colors.RESET + " /" + Colors.BLUE + DrinkMachine.SUM_TEA + Colors.RESET + " UAH");
        }

    }

    public static void colorsType() {
        System.out.print(Colors.YELLOW + Drinks.LEMONADE + " ");
        System.out.print(Colors.RED + Drinks.COCA_COLA + " ");
        System.out.print(Colors.GREEN + Drinks.MOJITO + " ");
        System.out.print(Colors.BLUE + Drinks.MINERAL + " ");
        System.out.print(Colors.WHITE + Drinks.TEA + " ");
        System.out.print(Colors.CYAN + Drinks.COFFEE + " " + Colors.RESET);
        System.out.println();
        System.out.println("для отмены введите exit/EXIT");
        System.out.println(Colors.PURPLE + "================================" + Colors.RESET);


    }

    public static void prediction() {
        String[] strArr = {
                "Если Вы проявите инициативу, успех не заставит себя ждать.",
                "Ваши надежды и планы сбудутся сверх всяких ожиданий.",
                "Готовьтесь к романтическим приключениям.",
                "В этом месяце ночная жизнь для вас.",
                "Вам пора отдохнуть.",
                "Вам предлагается мечта всей жизни. Скажите да!",
                "Вас ждет приятный сюрприз.",
                "Ваши надежды и планы сбудутся сверх всяких ожиданий.",
                "Время – ваш союзник, лучше отложить принятие важного решения хотя бы на день.",
                "Время и терпение,  вас ждут много сюрпризов!",
                "Время осушит все слезы и исцелит все раны."
        };
        Random rand = new Random();
        int res = rand.nextInt(strArr.length);
        System.out.println(Colors.CYAN + "Предсказание для Вас: " + Colors.RESET + Colors.RED + strArr[res] + Colors.RESET);


    }
}