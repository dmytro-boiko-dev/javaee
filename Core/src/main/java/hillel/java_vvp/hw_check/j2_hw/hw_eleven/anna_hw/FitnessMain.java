package hillel.java_vvp.hw_check.j2_hw.hw_eleven.anna_hw;

import java.util.Scanner;

public class FitnessMain {
    //Смена цвета
    public static final String RESET = "\033[0m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLACK_BOLD = "\033[1;30m";

    public static void main(String[] args) {
        System.out.println(CYAN_BOLD + "\t---Создание аккаунта(ов) для фитнес трекера---" + RESET);
        //Создание пользователей
        Fitness user1 = new Fitness("Иван", 28, 3, 1998,
                "ivanov.98@gmail.com", "+38(050)456 46 21", "Иванов", 87.5,
                "125/81", 15_843);
        user1.printAccountInfo();
        addInfo(user1);
        Fitness user2 = new Fitness("Ольга", 12, 7, 2002,
                "olga.02@gmail.com", "+38(097)432 19 01", "Яновская", 60.0,
                "110/72", 19_102);
        user2.printAccountInfo();
        addInfo(user2);
        Fitness user3 = new Fitness("Александр", 5, 11, 1974,
                "alex_melnik_74@gmail.com", "+38(063)962 02 34", "Мельник", 90.8,
                "130/89", 5_321);
        user3.printAccountInfo();
        addInfo(user3);

    }

    //Редактирование информации
    private static void addInfo(Fitness user) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int tempChoice = 0; //Временный ответ
        String tempAnswer;//Временный ответ
        String tempAnswer2;//Временный ответ
        boolean rightInput;//Проверка на ввод
        System.out.println("\n\tВсе данные введены правильно?" + BLUE_BOLD + " Да/Нет" + RESET);
        tempAnswer = scanner2.nextLine();
        tempAnswer = tempAnswer.toLowerCase();
        do {
            if (tempAnswer.equals("нет")) {
                System.out.println(PURPLE_BOLD + "---Вы можете изменить такие данные : " + RESET);
                System.out.println("Нажмите" + BLACK_BOLD + " 1" + RESET + " чтобы изменить фамилию");
                System.out.println("Нажмите" + BLACK_BOLD + " 2" + RESET + " чтобы изменить вес");
                System.out.println("Нажмите" + BLACK_BOLD + " 3" + RESET + " чтобы изменить давление");
                System.out.println("Нажмите" + BLACK_BOLD + " 4" + RESET + " чтобы изменить кол-во шагов");
                tempChoice = scanner.nextInt();
                scanner.nextLine();
                switch (tempChoice) {
                    case 1:
                        do {
                            System.out.println("\t---Вы выбрали изменить фамилию");
                            System.out.println("Пожалуйста, введите новую фамилию : ");
                            rightInput = scanner2.hasNextInt();
                            if (!rightInput) {
                                String newSurname = scanner2.next();
                                user.setSurname(newSurname);

                            } else {
                                System.out.println(RED_BOLD + "\tОшибка " +
                                        "\n\tНужно ввести буквы!!! " +
                                        "\n\tПопробуйте еще раз" + RESET);
                            }
                            scanner2.nextLine();
                        } while (rightInput);

                        break;
                    case 2:
                        do {
                            System.out.println("\t---Вы выбрали изменить вес");
                            System.out.println("Пожалуйста, введите новый вес : ");
                            rightInput = scanner.hasNextDouble();
                            if (rightInput) {
                                double newWeight = scanner.nextDouble();
                                user.setWeight(newWeight);
                            } else {
                                System.out.println(RED_BOLD + "\tОшибка " +
                                        "\n\tНужно ввести числа!!! " +
                                        "\n\tПопробуйте еще раз" + RESET);
                            }
                            scanner.nextLine();
                        } while (!rightInput);
                        break;

                    case 3:
                        System.out.println("\t---Вы выбрали изменить давление");
                        System.out.println("Пожалуйста, введите новое давление : ");
                        String newPressure = scanner2.nextLine();
                        user.setPressure(newPressure);
                        break;
                    case 4:
                        do {
                            System.out.println("\t---Вы выбрали изменить кол-во шагов");
                            System.out.println("Пожалуйста, введите новое кол-во шагов : ");
                            rightInput = scanner.hasNextInt();
                            if (rightInput) {
                                int newNumberOfS = scanner.nextInt();
                                user.setNumberOfSteps(newNumberOfS);
                            } else {
                                System.out.println(RED_BOLD + "\tОшибка " +
                                        "\n\tНужно ввести числа!!! " +
                                        "\n\tПопробуйте еще раз" + RESET);
                            }
                            scanner.nextLine();
                        } while (!rightInput);
                        break;

                }
                user.printAccountInfo();
            }
            if (tempAnswer.equals("да")) {
                break;
            }
            System.out.println("\n\tВсе данные введены правильно?" + BLUE_BOLD + " Да/Нет" + RESET);
            tempAnswer2 = scanner2.nextLine();
            tempAnswer2 = tempAnswer2.toLowerCase();
        } while (tempAnswer2.equals("нет"));
        System.out.println("============================================================");
    }
}
