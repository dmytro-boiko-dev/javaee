package javateam4.lesson4;

import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {

        System.out.println("Автомат может делать такие напитки:");
        System.out.println("1 = чай");
        System.out.println("2 = кофе");
        System.out.println("3 = какао");
        System.out.println("Введите пожалуйста число 1, 2 или 3:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number3 = scanner.nextInt();




        if (number1 == 1) {
            System.out.println("Автомат делает чай");
        } else if (number1 == 2){
            System.out.println("Автомат делает кофе");
        } else if (number1 == 3){
            System.out.println("Автомат делает какао");
        } else {
            System.out.println("Вы ввели неверное число.");
        }

    }
}
