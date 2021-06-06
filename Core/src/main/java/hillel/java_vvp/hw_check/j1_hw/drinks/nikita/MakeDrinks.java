package hillel.java_vvp.hw_check.j1_hw.drinks.nikita;

import java.util.Scanner;

import static hillel.java_vvp.hw_check.j1_hw.drinks.nikita.Drinks.*;
import static hillel.java_vvp.hw_check.j1_hw.drinks.nikita.CountOfDrinks.*;

public class MakeDrinks {
    Scanner scanner = new Scanner(System.in);
    String drink;
    String wishClient;

    public void FinishOfOrder() {
        System.out.println("===========================");
        System.out.println("         ---Ваш закак   ~ ");
        System.out.println("---Вы заказали : " + CountOfDrinks.countOfDrinks + "напитков");
        System.out.println("К оплате :" + CountOfDrinks.totalPrice + "$");
    }


    public void MakeLemonade() {


        System.out.println("--------------------");
        System.out.println("Машина для напитков приготовит вам лимонад : ");
        System.out.println("Лимонад стоит - " + Drinks.lemonade + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkLemonade = scanner.nextInt();
        System.out.println("Хотите заказать что-то еще Да/Нет");
//        Scanner scanner2 = new Scanner(System.in);
        wishClient = scanner.nextLine();
        if (wishClient.equals("Да")) {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            scanner.nextLine();
        }
        if (wishClient.equals("Нет")) {
            FinishOfOrder();

        }
        CountOfDrinks.countOfDrinks = countDrinkLemonade + CountOfDrinks.countOfDrinks;
        CountOfDrinks.totalPrice = (Drinks.lemonade * countDrinkLemonade) + CountOfDrinks.totalPrice;
    }


    public void MakeTea() {


        System.out.println("--------------------");
        System.out.println("Машина для напитков приготовит вам чай : ");
        System.out.println("Чай стоит - " + tea + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkTea = scanner.nextInt();
        CountOfDrinks.countOfDrinks = countDrinkTea + CountOfDrinks.countOfDrinks;
        System.out.println("Хотите заказать что-то еще Да/Нет");
        String wishClient = scanner.nextLine();
        if (wishClient.equals("Да")) {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            String drink = scanner.nextLine();
            if (wishClient.equals("Нет")) {
                FinishOfOrder();
            }
            CountOfDrinks.totalPrice = (Drinks.tea * countDrinkTea) + CountOfDrinks.totalPrice;
        }
    }

    public void MakeWater() {

        System.out.println("--------------------");
        System.out.println("Машина для напитков нальет вам воды : ");
        System.out.println("Вода стоит - " + water + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkWater = scanner.nextInt();
        CountOfDrinks.countOfDrinks = countDrinkWater + CountOfDrinks.countOfDrinks;
        System.out.println("Хотите заказать что-то еще Да/Нет");
        String wishClient = scanner.nextLine();
        if (wishClient.equals("Да")) {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            String drink = scanner.nextLine();
            CountOfDrinks.totalPrice = (water * countDrinkWater) + CountOfDrinks.totalPrice;
        }
        if (wishClient.equals("Нет")) {
            FinishOfOrder();
        }
    }

    public void MakeCoffee() {


        System.out.println("--------------------");
        System.out.println("Машина для напитков приготовит вам кофе : ");
        System.out.println("Кофе стоит - " + coffee + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkCoffee = scanner.nextInt();
        countOfDrinks = countDrinkCoffee + countOfDrinks;
        System.out.println("Хотите заказать что-то еще Да/Нет");
        String wishClient = scanner.nextLine();
        if (wishClient == "Да") {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            String drink = scanner.nextLine();
            if (wishClient == "Нет") {
                FinishOfOrder();
            }
            totalPrice = (coffee * countDrinkCoffee) + totalPrice;
        }
    }

    public void MakeCocaCola() {


        System.out.println("--------------------");
        System.out.println("Машина для напитков нальет вам кока-колы : ");
        System.out.println("Кока-кола стоит - " + coca_cola + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkСocaCola = scanner.nextInt();
        countOfDrinks = countDrinkСocaCola + countOfDrinks;
        System.out.println("Хотите заказать что-то еще Да/Нет");
        String wishClient = scanner.nextLine();
        if (wishClient == "Да") {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            String drink = scanner.nextLine();
            if (wishClient == "Нет") {
                FinishOfOrder();
            }
            totalPrice = (coca_cola * countDrinkСocaCola) + totalPrice;
        }
    }

    public void MakeMojito() {
        System.out.println("--------------------");
        System.out.println("Машина для напитков приготовит вам мохито : ");
        System.out.println("Мохито стоит - " + mojito + "$");
        System.out.println("Пожалуйста введите количество чашек :");
        int countDrinkMojito = scanner.nextInt();
        countOfDrinks = countDrinkMojito + countOfDrinks;
        System.out.println("Хотите заказать что-то еще Да/Нет");
        String wishClient = scanner.nextLine();
        if (wishClient == "Да") {
            System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать");
            String drink = scanner.nextLine();
            if (wishClient == "Нет") {
                FinishOfOrder();
            }
            totalPrice = (mojito * countDrinkMojito) + totalPrice;
        }
    }
}
