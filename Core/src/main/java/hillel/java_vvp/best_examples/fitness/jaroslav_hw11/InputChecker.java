package hillel.java_vvp.best_examples.fitness.jaroslav_hw11;

import java.util.Scanner;

public class InputChecker {
    //checking if user-entered symbols is integer in "range1..range2" range
    public int inputChecker(int range1, int range2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от " + range1 + " до " + range2 + ": ");
        int checkedItem;
        do {
            while (!sc.hasNextInt()) {
                System.out.print("Это не число! Повторите: ");
                sc.next();
            }
            checkedItem = sc.nextInt();
            if (checkedItem < range1 || checkedItem > range2) {
                System.out.print("Это число меньше " + range1 + " или больше " + range2 + " . Повторите: ");
            }
        } while (checkedItem < range1 || checkedItem > range2);

        return checkedItem;
    }
    //checking if user-entered symbols is integer non-negative numbers
    public int inputChecker() {
        Scanner sc = new Scanner(System.in);
        int checkedItem;
        do {
            while (!sc.hasNextInt()) {
                System.out.print("Это не число! Повторите: ");
                sc.next();
            }
            checkedItem = sc.nextInt();
            if (checkedItem < 0 ) {
                System.out.print("Это число отрицательное. Повторите: ");
            }
        } while (checkedItem < 0);

        return checkedItem;
    }
    public int inputChecker(int bottomRange) {
        Scanner sc = new Scanner(System.in);
        int checkedItem;

        do {
            while (!sc.hasNextInt()) {
                System.out.print("Это не число! Повторите: ");
                sc.next();
            }
            checkedItem = sc.nextInt();
            if (checkedItem <= bottomRange ) {
                System.out.print("Это число отрицательное или равно нулю. Повторите: ");
            }
        } while (checkedItem <= bottomRange);
        return checkedItem;
    }
}
