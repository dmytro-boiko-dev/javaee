package hillel.java_vvp.hw_check.j4_hw;

import java.util.Arrays;
import java.util.Scanner;

public class MainCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lotteryTicket = new int[7];
        int[] userTicket = new int[7];
        int coincidences = 0;


//Generating lottery ticket
        for (int i = 0; i < lotteryTicket.length; i++) {
            lotteryTicket[i] = (int) (Math.random() * 10);
        }


//Entering user's ticket
        System.out.println();
        System.out.println("Please enter digits from your ticket(7 digits from 0 to 9) :");
        for (int i = 0; i < userTicket.length; i++) {
            userTicket[i] = checkIfValid(in.nextInt(), 0, 9);
        }


//Sorting arrays
        lotteryTicket = sorter(lotteryTicket);
        userTicket = sorter(userTicket);


//Array output
        for (int i = 0; i < lotteryTicket.length; i++) {
            System.out.print(lotteryTicket[i] + "  ");
        }
        System.out.println();


//Comparing arays
        for (int i = 0; i < userTicket.length; i++) {
            if (userTicket[i] == lotteryTicket[i]) {
                coincidences++;
                System.out.print("\u001B[33m" + userTicket[i] + "\u001B[0m" + "  ");
            } else {
                System.out.print(userTicket[i] + "  ");
            }
        }
        System.out.println("Number of coincidences : \u001B[31m" + coincidences + "\u001B[0m");
    }


    //Array sorter
    public static int[] sorter(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int buff;
                if (array[i] > array[i + 1]) {
                    buff = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buff;
                }
            }
        }
        return array;
    }


    //Checks values for validity
    public static int checkIfValid(int number, int min, int max) {
        if (number >= min && number <= max) {
            return number;
        } else {
            return min;
        }
    }
}
