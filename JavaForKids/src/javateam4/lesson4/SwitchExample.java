package javateam4.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        int currentYear = 2007;
        String year;

        switch (currentYear) {
            case 2000:
                year = "Крысы";
                break;
            case 2001:
                year = "Дракона";
                break;
            case 2002:
                year = "Тигра";
                break;
            case 2003:
                year = "Собаки";
                break;
            case 5:
                year = "Барабаки";
                break;
            case 6:
                year = "Июнь";
                break;
            case 7:
                year = "Июль";
                break;
            case 8:
                year = "Август";
                break;
            case 9:
                year = "Сентябрь";
                break;
            case 10:
                year = "Октябрь";
                break;
            case 11:
                year = "Ноябрь";
                break;
            case 12:
                year = "Декабрь";
                break;
            default:
                year = "Такого месяца нет";
                break;
        }

//        System.out.println("Текущий месяц - " + year);


        // Task #1 - Календарь
        // Task #2 - Камень, ножницы, бумага
        //  1) сделайте ввод с консоли трех чисел от 0 до 10
        //  2) посчитайте их сумму
        //  3) и сделайте if с условием:
        //	    если
        //			   сумма чисел < 10
        //				    вывести на экран "камень"
        //			  10 > сумма чисел < 20
        //				    вывести на экран "ножницы"
        //			  20 > сумма чисел < 30
        //				    вывести на экран "бумага"

        // Task #3 - Арифметика
        //    а) ввести с консоли первое число (любое)
        //    б) ввести второе число от 1 до 5
        //    в) внутри оператора SWITCH выполнять 5 действий с первым числом в зависимости
        //        от выбранного второго числа:
        //          если 1: прибавлять к первому числу 2
        //          если 2: умножать первое на 3
        //          если 3: отнимать от первого 4
        //          если 4: делить первое на 5
        //          если 5: вычеслять корень первого числа
        //    г) вывести в консоль результат



        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        String name = scanner.nextLine();
        int age = scanner2.nextInt();



        System.out.println(name);










//        int a, b, c, d, e = 0;
//        Scanner input =
    }
}
