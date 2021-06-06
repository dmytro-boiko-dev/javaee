package hillel.java_vvp.hw_check.j2_hw.kostya.drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinksMain {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String text;
        double amount = 0;


        System.out.println("--- Машина для напитков может приготовить :");

        while (true) {


            try {
                System.out.println(Arrays.toString(DrinksMachine.values()));
                System.out.println("Пожалуйста выберите напиток, который хотите заказать:");
                String choice = bf.readLine();
                DrinksMachine drinks = DrinksMachine.valueOf(choice.toUpperCase());

                switch (drinks) {
                    case TEA:
                        delimiter();
                        System.out.println("Машина для напитков приготовит вам чай :");
                        System.out.println("Чашка чая стоит " + Drinks.TEA_PRICE + " $");
                        System.out.println("Пожалуйста введите кол-во чашек чая :");
                        int numCupOfTea = Integer.parseInt(bf.readLine());
                        System.out.println("Вы заказали : " + numCupOfTea + " чашек чая");
                        double amountOfTea = numCupOfTea * Drinks.TEA_PRICE;
                        amount += amountOfTea;
                        text = "----Чая " + numCupOfTea + " чашек(-ку,-ки) - " + amountOfTea + " $";
                        list.add(text);
                        break;

                    case SODA:
                        delimiter();
                        System.out.println("Машина для напиткова выдаст вам газированную воду :");
                        System.out.println("Бутылка газированной воды стоит " + Drinks.SODA_PRICE + " $");
                        System.out.println("Пожалуйста введите кол-во бутылок газировки :");
                        int numBottleOfSoda = Integer.parseInt(bf.readLine());
                        System.out.println("Вы заказали : " + numBottleOfSoda + " бутылок газированной воды");
                        double amountOfSoda = numBottleOfSoda * Drinks.SODA_PRICE;
                        amount += amountOfSoda;
                        text = "----Газировки " + numBottleOfSoda + " бутылок(-лку,-лки) - " + amountOfSoda + " $";
                        list.add(text);
                        break;

                    case COFFE:
                        delimiter();
                        System.out.println("Машина для напитков приготовит вам кофе :");
                        System.out.println("Чашка кофе стоит " + Drinks.COFFE_PRICE + " $");
                        System.out.println("Пожалуйста введите кол-во чашек кофе :");
                        int numCupOfCoffe = Integer.parseInt(bf.readLine());
                        System.out.println("Вы заказали : " + numCupOfCoffe + " чашек кофе");
                        double amountOfCoffe = numCupOfCoffe * Drinks.COFFE_PRICE;
                        amount += amountOfCoffe;
                        text = "----Кофе " + numCupOfCoffe + " чашек(-ку,-ки) - " + amountOfCoffe + " $";
                        list.add(text);
                        break;

                    case LEMONADE:
                        delimiter();
                        System.out.println("Машина для напиткова выдаст вам лимонад :");
                        System.out.println("Бутылка лимонада стоит " + Drinks.LEMONADE_PRICE + " $");
                        System.out.println("Пожалуйста введите кол-во бутылок лимонада :");
                        int numBottleOfLemonad = Integer.parseInt(bf.readLine());
                        System.out.println("Вы заказали : " + numBottleOfLemonad + " бутылок лимонада");
                        double amountOfLemonade = numBottleOfLemonad * Drinks.LEMONADE_PRICE;
                        amount += amountOfLemonade;
                        text = "----Лимонада " + numBottleOfLemonad + " бутылок(-лку,-лки) - " + amountOfLemonade + " $";
                        list.add(text);
                        break;

                    case COCACOLA:
                        delimiter();
                        System.out.println("Машина для напиткова выдаст вам Кока-Колу :");
                        System.out.println("Бутылка Кока-Колы стоит " + Drinks.COCA_COLA_PRICE + " $");
                        System.out.println("Пожалуйста введите кол-во бутылок Кока-Колы :");
                        int numBottleOfCola = Integer.parseInt(bf.readLine());
                        System.out.println("Вы заказали : " + numBottleOfCola + " бутылок Кока-Колы");
                        double amountOfCola = numBottleOfCola * Drinks.COCA_COLA_PRICE;
                        amount += amountOfCola;
                        text = "----Кока-Колы " + numBottleOfCola + " бутылок(-лку,-лки) - " + amountOfCola + " $";
                        list.add(text);
                        break;

                }
                System.out.println("Хотите заказать что нибудь ещё? Да / Нет");
                String answer = bf.readLine().toUpperCase();
                if (answer.equalsIgnoreCase("Нет")) {
                    delimiter();
                    System.out.println("---Ваш заказ : ");
                    for (String s : list) {
                        System.out.println(s);
                    }

                    System.out.printf("%s%4.2f%s", "Итого : ", amount, " $");
                    break;
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void delimiter() throws InterruptedException {
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
            Thread.sleep(50);
        }
        System.out.println();
    }
}
