package hillel.java_vvp.hw_check.j3_hw.hw13.vlad;

import java.util.Scanner;

public class Drinks {
    public enum DrinksMachine {
        COFFEE("COFFEE"),
        TEA("TEA"),
        LEMONAD("LEMONAD"),
        MOHITO("MOHITO"),
        SODA("SODA"),
        COCACOLA("COCACOLA");

        private final String title;

        DrinksMachine(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    public static void make(int idx){
        switch (idx) {
            case 0:
                System.out.println("Готовим кофе, из лучших отборных зерен ...");

                break;

            case 1:
                System.out.println("Готовим чай, из высокогорных сортов листьев ...");

                break;

            case 2:
                System.out.println("Готовим лимонад, из свежих лимонов ...");

                break;

            case 3:
                System.out.println("Готовим мохито, из спрайта, мяты и льда ...");

                break;

            case 4:
                System.out.println("Содавая от лучших производителей ...");

                break;

            case 5:
                System.out.println("CocaCola уже ...");

                break;
        }
    }

    static final double[] cost = { 4.50, 7.25, 2.25, 9.45, 4.75, 1.20 };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] arr = {0,0,0,0,0,0};
        DrinksMachine[] types = DrinksMachine.values();
        System.out.print("В астортименте : ");
        for (int i = 0; i <6; i++) {
            String temp = types[i].getTitle();
            System.out.format("%12s", temp);
        }

        System.out.println();
        boolean flag = true;

        while (flag) {

            boolean exists;

            String st;

            do {
                System.out.println();

                System.out.print("Какой напиток выбираете ? --> ");

                st = s.nextLine();

                st = st.toUpperCase();

                exists = true;

                try {
                    DrinksMachine.valueOf(st);
                } catch (IllegalArgumentException e) {
                    exists = false;
                }

                if (exists == false) System.out.println("Внимательнее, такой позиции нет !");
                else break;
            }while (true);

            DrinksMachine drinks = DrinksMachine.valueOf(st);

            switch (drinks) {

                case COFFEE:
                    arr[0]++;
                    make(0);

                    break;

                case TEA:
                    arr[1]++;
                    make(1);

                    break;

                case LEMONAD:
                    arr[2]++;
                    make(2);

                    break;

                case MOHITO:
                    arr[3]++;
                    make(3);

                    break;

                case SODA:
                    arr[4]++;
                    make(4);

                    break;

                case COCACOLA:
                    arr[5]++;
                    make(5);

                    break;

            }

            String stt;
            System.out.println("Желаете ли вы еще напиток   Yes/No");
            st = s.nextLine();

            st = st.toUpperCase();

            if(st.charAt(0) == 'Y') flag = true;
            else flag = false;
        }

        double sum = 0;

        System.out.println("Название напитка  |  Количество  |  Стоимость одного  |  Стоимость всей позиции");

        int pos = 0;

        for (int i = 0; i <6; i++){
            String temp = types[i].getTitle();
            sum += arr[i] * cost[i];
            pos += arr[i];
            double x =  arr[i] * cost[i];
            System.out.format("%16s%15d%21.2f%27.2f", temp, arr[i], cost[i], x );
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество позиций    " + pos);
        System.out.println("Сумма заказа          " + sum);

    }

}
