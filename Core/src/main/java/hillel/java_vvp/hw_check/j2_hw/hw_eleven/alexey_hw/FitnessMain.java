package hillel.java_vvp.hw_check.j2_hw.hw_eleven.alexey_hw;


import java.util.Scanner;

public class FitnessMain {
    public static void main(String[] args) {


        Fitness user0 = new Fitness("Vitalik", "Svyatotatov", "aaa@gmail.com", "+380803553535",
                1995, 6, 28, 90.1, "110/70", 1264);

        Fitness user1 = new Fitness("Bob", "Ross", "bobross@gmail.com", "+7782232451",
                1961, 8, 15, 95.4, "130/85", 465);

        Fitness user2 = new Fitness("Michael", "Stetina", "micha@gmail.com", "+8123452323",
                1983, 3, 4, 69.1, "140/80", 3506);

        Fitness user3 = new Fitness("Richard", "Sapogov", "handsome@gmail.com", "+4131352323",
                1991, 2, 20, 70.8, "125/88", 891);

        Fitness user4 = new Fitness("Vadim", "Zhilin", "ment@gmail.com", "+32326552323",
                1989, 12, 14, 95.1, "150/71", 1782);

        /*printAccountInfo(user0);                    // Метод в этом же классе
        printAccountInfo(user1);
        printAccountInfo(user2);
        printAccountInfo(user3);
        printAccountInfo(user4);*/

        // Всё что находится ниже, попытки дать возможность интерактивно просматривать данные и менять их.
        // Правда всё достаточно линейно - Сначала всегда просмотр а потом изменение данных

        String info;
        String repeat;
        boolean answer;

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Which user do you want to see?" + "\n" + "Print number from 1 to 5");
            System.out.println("1.Vitalik;" + "\n" + "2.Bob;" + "\n" + "3.Michael;" + "\n" +
                    "4.Richard;" + "\n" + "5.Vadim;");
            info = scanner.nextLine();

            switch (info) {
                case "1":
                    printAccountInfo(user0);
                    break;
                case "2":
                    printAccountInfo(user1);
                    break;
                case "3":
                    printAccountInfo(user2);
                    break;
                case "4":
                    printAccountInfo(user3);
                    break;
                case "5":
                    printAccountInfo(user4);
                    break;
                default:
                    System.out.println("Wrong number");
                    continue;
            }

            System.out.println("Do you want repeat?" + "\n" + "print Y/N");
            repeat = scanner.nextLine();

            switch (repeat) {
                case "Y":
                    answer = true;
                    break;
                case "y":
                    answer = true;
                    break;
                case "N":
                    answer = false;
                    break;
                case "n":
                    answer = false;
                    break;
                default:
                    System.out.println("Wrong answer");
                    return;
            }

            if (answer) {
                continue;
            } else if (!answer) {
                break;
            }

        }

        System.out.println("Do you want to change data of user?" + "\n" + "Print Y/N");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.nextLine();
        boolean answer2;
        String change;

        if (answer1.contains("Y") || answer1.contains("y")) {

            while (true) {

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Which user do you want to change?" + "\n" + "Print number from 1 to 5");
                System.out.println("1.Vitalik;" + "\n" + "2.Bob;" + "\n" + "3.Michael;" + "\n" +
                        "4.Richard;" + "\n" + "5.Vadim;");
                info = scanner2.nextLine();

                switch (info) {
                    case "1":
                        System.out.println("You can change:" + "\n" + "1.Surname;" + "\n" + "2.Weight;" + "\n" +
                                "3.Pressure;" + "\n" + "4.Steps;" + "\n" + "Print number");
                        change = scanner2.nextLine();
                        switch (change) {
                            case "1":
                                System.out.println("Enter new Surname:");
                                String surname = scanner2.nextLine();
                                user0.setSurname(surname);
                                System.out.println("Surname successfully changed.");
                                break;
                            case "2":
                                System.out.println("Enter new Weight:");
                                String weight = scanner2.nextLine();
                                user0.setWeight(Double.parseDouble(weight));
                                System.out.println("Weight successfully changed.");
                                break;
                            case "3":
                                System.out.println("Enter new Pressure:");
                                String pressure = scanner2.nextLine();
                                user0.setPressure(pressure);
                                System.out.println("Pressure successfully changed.");
                                break;
                            case "4":
                                System.out.println("Enter new Steps:");
                                int steps = scanner2.nextInt();
                                user0.setWalk(steps);
                                System.out.println("Steps successfully changed.");
                                break;
                        }
                        System.out.println("Updated user data:" + "\n" + "===============================");
                        printAccountInfo(user0);
                        break;
                    case "2":
                        System.out.println("You can change:" + "\n" + "1.Surname;" + "\n" + "2.Weight;" + "\n" +
                                "3.Pressure;" + "\n" + "4.Steps;" + "\n" + "Print number");
                        change = scanner2.nextLine();
                        switch (change) {
                            case "1":
                                System.out.println("Enter new Surname:");
                                String surname = scanner2.nextLine();
                                user1.setSurname(surname);
                                System.out.println("Surname successfully changed.");
                                break;
                            case "2":
                                System.out.println("Enter new Weight:");
                                String weight = scanner2.nextLine();
                                user1.setWeight(Double.parseDouble(weight));
                                System.out.println("Weight successfully changed.");
                                break;
                            case "3":
                                System.out.println("Enter new Pressure:");
                                String pressure = scanner2.nextLine();
                                user1.setPressure(pressure);
                                System.out.println("Pressure successfully changed.");
                                break;
                            case "4":
                                System.out.println("Enter new Steps:");
                                int steps = scanner2.nextInt();
                                user1.setWalk(steps);
                                System.out.println("Steps successfully changed.");
                                break;
                        }
                        System.out.println("Updated user data:" + "\n" + "===============================");
                        printAccountInfo(user1);
                        break;
                    case "3":
                        System.out.println("You can change:" + "\n" + "1.Surname;" + "\n" + "2.Weight;" + "\n" +
                                "3.Pressure;" + "\n" + "4.Steps;" + "\n" + "Print number");
                        change = scanner2.nextLine();
                        switch (change) {
                            case "1":
                                System.out.println("Enter new Surname:");
                                String surname = scanner2.nextLine();
                                user2.setSurname(surname);
                                System.out.println("Surname successfully changed.");
                                break;
                            case "2":
                                System.out.println("Enter new Weight:");
                                String weight = scanner2.nextLine();
                                user2.setWeight(Double.parseDouble(weight));
                                System.out.println("Weight successfully changed.");
                                break;
                            case "3":
                                System.out.println("Enter new Pressure:");
                                String pressure = scanner2.nextLine();
                                user2.setPressure(pressure);
                                System.out.println("Pressure successfully changed.");
                                break;
                            case "4":
                                System.out.println("Enter new Steps:");
                                int steps = scanner2.nextInt();
                                user2.setWalk(steps);
                                System.out.println("Steps successfully changed.");
                                break;
                        }
                        System.out.println("Updated user data:" + "\n" + "===============================");
                        printAccountInfo(user2);
                        break;
                    case "4":
                        System.out.println("You can change:" + "\n" + "1.Surname;" + "\n" + "2.Weight;" + "\n" +
                                "3.Pressure;" + "\n" + "4.Steps;" + "\n" + "Print number");
                        change = scanner2.nextLine();
                        switch (change) {
                            case "1":
                                System.out.println("Enter new Surname:");
                                String surname = scanner2.nextLine();
                                user3.setSurname(surname);
                                System.out.println("Surname successfully changed.");
                                break;
                            case "2":
                                System.out.println("Enter new Weight:");
                                String weight = scanner2.nextLine();
                                user3.setWeight(Double.parseDouble(weight));
                                System.out.println("Weight successfully changed.");
                                break;
                            case "3":
                                System.out.println("Enter new Pressure:");
                                String pressure = scanner2.nextLine();
                                user3.setPressure(pressure);
                                System.out.println("Pressure successfully changed.");
                                break;
                            case "4":
                                System.out.println("Enter new Steps:");
                                int steps = scanner2.nextInt();
                                user3.setWalk(steps);
                                System.out.println("Steps successfully changed.");
                                break;
                        }
                        System.out.println("Updated user data:" + "\n" + "===============================");
                        printAccountInfo(user3);
                        break;
                    case "5":
                        System.out.println("You can change:" + "\n" + "1.Surname;" + "\n" + "2.Weight;" + "\n" +
                                "3.Pressure;" + "\n" + "4.Steps;" + "\n" + "Print number");
                        change = scanner2.nextLine();
                        switch (change) {
                            case "1":
                                System.out.println("Enter new Surname:");
                                String surname = scanner2.nextLine();
                                user4.setSurname(surname);
                                System.out.println("Surname successfully changed.");
                                break;
                            case "2":
                                System.out.println("Enter new Weight:");
                                String weight = scanner2.nextLine();
                                user4.setWeight(Double.parseDouble(weight));
                                System.out.println("Weight successfully changed.");
                                break;
                            case "3":
                                System.out.println("Enter new Pressure:");
                                String pressure = scanner2.nextLine();
                                user4.setPressure(pressure);
                                System.out.println("Pressure successfully changed.");
                                break;
                            case "4":
                                System.out.println("Enter new Steps:");
                                int steps = scanner2.nextInt();
                                user4.setWalk(steps);
                                System.out.println("Steps successfully changed.");
                                break;
                        }
                        System.out.println("Updated user data:" + "\n" + "===============================");
                        printAccountInfo(user4);
                        break;
                    default:
                        System.out.println("Wrong number");
                        continue;
                }

                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Do you want repeat?" + "\n" + "print Y/N");
                repeat = scanner1.nextLine();

                switch (repeat) {
                    case "Y":
                        answer2 = true;
                        break;
                    case "y":
                        answer2 = true;
                        break;
                    case "N":
                        answer2 = false;
                        break;
                    case "n":
                        answer2 = false;
                        break;
                    default:
                        System.out.println("Wrong answer");
                        return;
                }

                if (answer2) {
                    continue;
                } else if (!answer2) {
                    break;
                }

            }

        }


        /*user3.setSurname("Kaloshin");               // Меняю параметры для 4 и 5 юзеров и снова вывожу их
        user3.setWalk(456);
        printAccountInfo(user3);

        user4.setPressure("130/65");
        user4.setSurname("Durakov");
        user4.setWeight(89.9);
        printAccountInfo(user4);*/

        //user0.printAccountInfo();                 // Метод находится в классе Fitness
        //user1.printAccountInfo();
        //user2.printAccountInfo();
        //user3.printAccountInfo();
        //user4.printAccountInfo();
    }

    public static void printAccountInfo(Fitness user) {

        System.out.println("Name: " + user.getName() + "; Surname: " + user.getSurname() + ";");
        System.out.println("E-mail: " + user.getEmail());
        System.out.println("Phone number: " + user.getPhone());
        System.out.println("Date of birth: " + user.getDay() + "." + user.getMonth() + "." + user.getYear());
        System.out.println("Age: " + (user.getAge() - user.getYear()));     // Вычисление происходит при выводе
        System.out.println("Weight: " + user.getWeight() + " kg");
        System.out.println("Pressure: " + user.getPressure());
        System.out.println("You have took " + user.getWalk() + " steps today");
        System.out.println("===================================");
        System.out.println();
    }

}