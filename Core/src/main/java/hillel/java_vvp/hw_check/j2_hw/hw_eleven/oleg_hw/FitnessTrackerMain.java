package hillel.java_vvp.hw_check.j2_hw.hw_eleven.oleg_hw;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class FitnessTrackerMain {
    public static void main(String[] args) throws ParseException {
        int k;// Для цикла do while
        int e;// Для switch
        Scanner in = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//Форматирование даты под нужный шаблон
        Date registerDate1 = new Date();
        //Вводим дату дня рождения первого пользователя
        GregorianCalendar birthdayDate1 = new GregorianCalendar(2000, Calendar.JULY, 19);
        //Вводим дату дня рождения второго пользователя
        GregorianCalendar birthdayDate2 = new GregorianCalendar(1995, Calendar.SEPTEMBER, 26);
        //Вводим дату дня рождения третьего пользователя
        GregorianCalendar birthdayDate3 = new GregorianCalendar(1982, Calendar.MARCH, 5);
        //Вводим дату дня рождения третьего пользователя
        GregorianCalendar birthdayDate4 = new GregorianCalendar(1984, Calendar.MAY, 11);
        //Вводим дату дня рождения третьего пользователя
        GregorianCalendar birthdayDate5 = new GregorianCalendar(1991, Calendar.JANUARY, 30);
        FitnessTracker[] athlete = new FitnessTracker[5];
        System.out.println("Мы вводим данные со следующей последовательностью: имя, фамилия, дата рождения, почта, номер, давление, вес, кол-во шагов, дата регистрации ...");
        System.out.println("Из всех перечисленных данных, мы можем изменить фамилию, вес, давление, кол-во шагов ");
        System.out.println("=======================================================================================");
        athlete[0] = new FitnessTracker("Василий", "Пирожков", birthdayDate1, "piroj@mail.ru", "+380955653956", "120/80", 60.6, 6300, formater.format(registerDate1));
        athlete[1] = new FitnessTracker("Николай", "Уткин", birthdayDate2, "bestytki4@mail.ru", "+380923653121", "110/70", 63.8, 8000, formater.format(registerDate1));
        athlete[2] = new FitnessTracker("Федор", "Пончиков", birthdayDate3, "whassuppons@mail.ru", "+380930653221", "125/85", 72.1, 5311, formater.format(registerDate1));
        athlete[3] = new FitnessTracker("Антон", "Короб", birthdayDate4, "korob412@mail.ru", "+380955116956", "120/80", 64.6, 4300, formater.format(registerDate1));
        athlete[4] = new FitnessTracker("Виктор", "Вишняков", birthdayDate5, "vishnya1lol@mail.ru", "+380951653944", "120/80", 71.6, 2300, formater.format(registerDate1));
        do {
            System.out.println("Информацию про какого пользователя вы бы хотели вывести на экран ? : 1, 2, 3, 4 или 5 ");
            e = in.nextInt();
            switch (e) {
                case 1:
                    athlete[0].printAccount();
                    break;
                case 2:
                    athlete[1].printAccount();
                    break;
                case 3:
                    athlete[2].printAccount();
                    break;
                case 4:
                    athlete[3].printAccount();
                    break;
                case 5:
                    athlete[4].printAccount();
                    break;
            }
            System.out.println();
            System.out.println("Хотите вывести на экран информацию про другого атлета ? 1-да, 0-нет ");
            k = in.nextInt();
        } while (k == 1);

        int f;
        do {
            System.out.println("Возможно вы хотите редактировать какие-то значения (фамилия, вес, давление, количество шагов) ? 1-да,0-нет");
            k = in.nextInt();
            if(k!=1){
                break;
            }
            System.out.println("Мы сделаем всё за вас ! :)");
            System.out.println("Информацию какого пользователя вы хотите редактировать ? 1, 2, 3, 4 или 5 ");
            e = in.nextInt();
            while (k == 1) {
                switch (e) {
                    case 1:
                        System.out.println("Какие данные вы хотите редактировать ? 1-фамилия, 2-вес, 3-давление, 4-количество шагов");
                        int c = in.nextInt();
                        if (c == 1) {
                            System.out.println("Вводим новую фамилию ...");
                            athlete[0].setSecondName("Перчиков");
                        }
                        if (c == 2) {
                            System.out.println("Вводим новый вес ...");
                            athlete[0].setWeight(80.0);
                        }
                        if (c == 3) {
                            System.out.println("Вводим новое давление ...");
                            athlete[0].setPressure("127/83");
                        }
                        if (c == 4) {
                            System.out.println("Вводим новое количество шагов ...");
                            athlete[0].setStepsAmount(10000);
                        }
                        break;
                    case 2:
                        System.out.println("Какие данные вы хотите редактировать ? 1-фамилия, 2-вес, 3-давление, 4-количество шагов");
                        c = in.nextInt();
                        if (c == 1) {
                            System.out.println("Вводим новую фамилию ...");
                            athlete[1].setSecondName("Пальчиков");
                        }
                        if (c == 2) {
                            System.out.println("Вводим новый вес ...");
                            athlete[1].setWeight(64.0);
                        }
                        if (c == 3) {
                            System.out.println("Вводим новое давление ...");
                            athlete[1].setPressure("123/81");
                        }
                        if (c == 4) {
                            System.out.println("Вводим новое количество шагов ...");
                            athlete[1].setStepsAmount(5100);
                        }
                        break;
                    case 3:
                        System.out.println("Какие данные вы хотите редактировать ? 1-фамилия, 2-вес, 3-давление, 4-количество шагов");
                        c = in.nextInt();
                        if (c == 1) {
                            System.out.println("Вводим новую фамилию ...");
                            athlete[2].setSecondName("Гатаулов");
                        }
                        if (c == 2) {
                            System.out.println("Вводим новый вес ...");
                            athlete[2].setWeight(91.2);
                        }
                        if (c == 3) {
                            System.out.println("Вводим новое давление ...");
                            athlete[2].setPressure("130/75");
                        }
                        if (c == 4) {
                            System.out.println("Вводим новое количество шагов ...");
                            athlete[2].setStepsAmount(5155);
                        }
                        break;
                    case 4:
                        System.out.println("Какие данные вы хотите редактировать ? 1-фамилия, 2-вес, 3-давление, 4-количество шагов");
                        c = in.nextInt();
                        if (c == 1) {
                            System.out.println("Вводим новую фамилию ...");
                            athlete[3].setSecondName("Базаров");
                        }
                        if (c == 2) {
                            System.out.println("Вводим новый вес ...");
                            athlete[3].setWeight(83.6);
                        }
                        if (c == 3) {
                            System.out.println("Вводим новое давление ...");
                            athlete[3].setPressure("130/75");
                        }
                        if (c == 4) {
                            System.out.println("Вводим новое количество шагов ...");
                            athlete[3].setStepsAmount(6215);
                        }
                        break;
                    case 5:
                        System.out.println("Какие данные вы хотите редактировать ? 1-фамилия, 2-вес, 3-давление, 4-количество шагов");
                        c = in.nextInt();
                        if (c == 1) {
                            System.out.println("Вводим новую фамилию ...");
                            athlete[4].setSecondName("Баянов");
                        }
                        if (c == 2) {
                            System.out.println("Вводим новый вес ...");
                            athlete[4].setWeight(72.9);
                        }
                        if (c == 3) {
                            System.out.println("Вводим новое давление ...");
                            athlete[4].setPressure("131/80");
                        }
                        if (c == 4) {
                            System.out.println("Вводим новое количество шагов ...");
                            athlete[4].setStepsAmount(8115);
                        }
                        break;
                }
                System.out.println("Хотите еще изменить какие-то данные ? 1-да, 0-нет");
                k = in.nextInt();
            }
            System.out.println("Хотите ли изменить данные другого пользователя ? 1-да,0-нет");
            f = in.nextInt();
        } while (f == 1);
        System.out.println("===============================================================");
        System.out.println("===============================================================");
        System.out.println("===============================================================");
        System.out.println("Новые данные пользователей : ");
        do {
            System.out.println("Информацию про какого пользователя вы бы хотели вывести на экран ? : 1, 2, 3, 4 или 5 ");
            e = in.nextInt();
            switch (e) {
                case 1:
                    athlete[0].printAccount();
                    break;
                case 2:
                    athlete[1].printAccount();
                    break;
                case 3:
                    athlete[2].printAccount();
                    break;
                case 4:
                    athlete[3].printAccount();
                    break;
                case 5:
                    athlete[4].printAccount();
                    break;
            }
            System.out.println();
            System.out.println("Хотите вывести на экран информацию про другого атлета ? 1-да, 0-нет ");
            k = in.nextInt();
        } while (k == 1);
    }
}