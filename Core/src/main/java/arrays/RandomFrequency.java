package arrays;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomFrequency {

    //Смена цвета
    public static final String reset_color = "\u001B[0m";
    public static final String red_color = "\u001B[31m";
    public static final String blue_color = "\u001B[34m";
    public static final String cyan_color = "\u001B[36m";

    public static void main(String[] args) {
        //Task 4
        // Ввод размера матрицы
        boolean rightInput;//Проверка на ввод данных
        String tempAnswer;//Временный ответ для цикла
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            int n = 0;
            int m = 0;
            do {
                System.out.println("Введите кол-во строк матрицы : ");
                rightInput = scanner.hasNextInt();
                if (rightInput) {
                    n = scanner.nextInt();
                } else {
                    System.out.println(red_color + "\tОшибка! " +
                            "\n\tНужно ввести числа!!!" +
                            "\n\tПопробуйте еще раз" + reset_color);
                }
                if (n < 0 || n > 10 ) {
                    System.out.println(red_color + "\tОшибка! " +
                            "\n\tЧисла не соответствуют диапазону от 0 до 10!!!" +
                            "\n\tПопробуйте еще раз" + reset_color);
                }
                scanner.nextLine();
            } while (!rightInput || n < 0 || n > 10 );

            do {
                System.out.println("Введите кол-во столбцов матрицы : ");
                rightInput = scanner.hasNextInt();
                if (rightInput) {
                    m = scanner.nextInt();
                } else {
                    System.out.println(red_color + "\tОшибка! " +
                            "\n\tНужно ввести числа!!!" +
                            "\n\tПопробуйте еще раз" + reset_color);
                }
                if ( m < 0 || m > 10) {
                    System.out.println(red_color + "\tОшибка! " +
                            "\n\tЧисла не соответствуют диапазону от 0 до 10!!!" +
                            "\n\tПопробуйте еще раз" + reset_color);
                }
                scanner.nextLine();
            } while (!rightInput || m < 0 || m > 10);

            int[][] matrix1 = new int[n][m];
            int[][] matrix2 = new int[m][n];

            //Генерация случайных чисел в матрицу
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix1[i][j] = (int) (Math.random() * 10);
                }
            }

            // Вывод первоначальной матрицы
            System.out.println("\nВаша матрица : ");
            printMatrix(matrix1);

            // Транспонирование матрицы
            transposMatrix(matrix1, matrix2);
            //Вывод транспонированной матрицы
            System.out.println("\nТранспонированная матрица : ");
            printMatrix(matrix2);

            System.out.println("\n\tХотите попробовать еще раз?" + blue_color + " Да/Нет" + reset_color);
            tempAnswer = scanner1.nextLine();

        } while (tempAnswer.equals("Да"));
    }

    public static void printMatrix(int[][] array) {

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(cyan_color + array[i][j] + " " + reset_color);
            }
            System.out.println();
        }
    }

    public static void transposMatrix(int[][] array1, int[][] array2) {

        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
    }

}
