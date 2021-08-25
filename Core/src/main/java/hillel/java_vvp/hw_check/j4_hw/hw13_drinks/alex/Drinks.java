package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.alex;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Drinks
{
    public static final int COFFEE_PRICE = 40;
    public static final int TEA_PRICE = 30;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 25;
    public static final int SODA_PRICE = 15;
    public static final int COCA_COLA_PRICE = 20;

    Scanner sc = new Scanner(System.in);

    public int coffeePrepare()
    {
        System.out.println("Чашка кофе стоит: " + COFFEE_PRICE + "₴");
        System.out.print("Введите количество чашек кофе: ");
        return sc.nextInt();
    }

    public int teaPrepare()
    {
        System.out.println("Чашка чая стоит: " + TEA_PRICE + "₴");
        System.out.print("Введите количество чашек чая: ");
        return sc.nextInt();
    }
}