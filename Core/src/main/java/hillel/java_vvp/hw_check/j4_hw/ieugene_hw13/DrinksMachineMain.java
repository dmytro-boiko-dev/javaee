package hillel.java_vvp.hw_check.j4_hw.ieugene_hw13;

import java.util.Locale;
import java.util.Scanner;

public class DrinksMachineMain {
    public static void main(String[] args) {
        System.out.println("Сделайте Ваш выбор: "+"[ "+"TEA"+
                " "+"COFFEE"+" "+"LEMONADE"+" "+"MOJITO"+" "+
                "WATER"+" "+"COCA_COLA "+"]");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        boolean next;

        do{
            DrinksMaker drinks_maker =new DrinksMaker();
            String s= scanner1.nextLine();
            drinks_maker.CustomerChoice(s.toUpperCase());
            System.out.println("Еще один напиток? YES/NO");
            String s2= scanner2.nextLine().toUpperCase(Locale.ROOT);
            next= s2.equals("YES");

        }
        while(next);
        System.out.println("За "+DrinksMaker.counter+
                " "+"напитков к оплате "+DrinksMaker.total_cost+" "+"$");

  }
}
