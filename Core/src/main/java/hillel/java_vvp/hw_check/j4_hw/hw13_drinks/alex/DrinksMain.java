package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.alex;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class DrinksMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Drinks drinks = new Drinks();
        boolean a = true;

        while (a)
        {
            System.out.println("Пожалуйста, выберите напиток: ");
            System.out.println(Arrays.toString(DrinksAuto.values()));

            String choice = sc.nextLine();
            choice = choice.toUpperCase();
            DrinksAuto drinksAuto = DrinksAuto.valueOf(choice);

            switch (drinksAuto)
            {
                case COFFEE:
                    drinks.coffeePrepare();
                    break;
                case TEA:
                    drinks.teaPrepare();
                    break;
                default:
                    System.out.println("Ошибка");
            }

            System.out.println("Желаете чего-нибудь ещё? ДА/НЕТ");

            boolean moreDrinks = true;

            while (moreDrinks)
            {
                String answer = sc.nextLine();

                if (answer.equals("НЕТ") || answer.equals("Нет") || answer.equals("нет"))
                {
                    moreDrinks = false;
                    a = false;
                }
                else if (answer.equals("Да") || answer.equals("ДА") || answer.equals("да"))
                {
                    moreDrinks = false;
                }
                else {
                    System.out.println("Ответьте - ДА/НЕТ");
                }
            }
        }


    }
}