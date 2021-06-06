package time;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.random;

public class SimpleTimeCounter {
    public static void main(String[] args) {
        int[][] team = new int[2][25];
        System.out.print("Возраста 1 команды: ");
        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < team[i].length; j++) {
                team[i][j] = (int) (random() * 23 + 18);
                System.out.print(team[i][j] + " ");
            }
            if(i == 0) {
                System.out.print("\n" + "Возраста 2 команды: ");
            }
        }
        System.out.print("\n");


        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < team[i].length; j++) {
                if(i == 0) {
                    sum1 += team[i][j];
                }
                else sum2 += team[i][j];
            }
        }
        sum1 = sum1 / 25;
        sum2 = sum2 / 25;
        if(sum1 > sum2) {
            System.out.println("Средний возраст 1 команды больше " + sum1 + " > " + sum2);
        }
        else if (sum2 > sum1) {
            System.out.println("Средний возраст 2 команды больше " + sum2 + " > " + sum1);
        }
        else System.out.println("Средний возраст команд совпадает " + sum1 + " = " + sum2);
    }

}
