package hillel.java_vvp.hw_check.j2_hw.hw_thirteen.pavel;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {

        System.out.println("Введите  высоту пирамиды: ");
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        for (int i = 0, c = Math.abs((scanner.nextInt())) * 2; i < c; i =i+2) {
            for (int j = c - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");

            }
            System.out.println();
        }


    }
}

