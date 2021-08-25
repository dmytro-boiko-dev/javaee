package hillel.java_vvp.best_examples.users_database.jaroslav;

import java.util.ArrayList;
import java.util.Scanner;

public class Database_v2 {
    public static void main(String[] args) {
        //creating users
        ArrayList<User_v2> table = new ArrayList<>();
        User_v2 header = new User_v2("Имя", "Фамилия", "e-mail", "Департамент");
        table.add(header);

        int choice;
        do {
            InputChecker ic = new InputChecker();
            System.out.println("База данных предприятия. Сделайте выбор:");
            System.out.println("1. Создать пользователя");
            System.out.println("2. Редактировать пользователя");
            System.out.println("3. Показать таблицу");
            System.out.println("4. Выход");
            choice = ic.inputChecker(1, 4);
            if (choice == 1) {
                table.add(createUser());
            } else if (choice == 2) {
                editUser(table);
            } else if (choice == 3) {     //for menu item #3 calling displayResult method for displaying
                displayResult(table);     //result in a table
            }
        } while (choice != 4);
        System.exit(0);             //for menu item #4 calling System.exit(0)
    }

    public static User_v2 createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        String firstName = sc.next();
        System.out.print("Введите фамилию сотрудника: ");
        String secondName = sc.next();
        System.out.print("Введите e-mail сотрудника: ");
        String email = sc.next();
        System.out.print("Введите департамент сотрудника: ");
        String dep = sc.next();
        return new User_v2(firstName, secondName, email, dep);
    }

    public static void editUser(ArrayList<User_v2> table) {
        InputChecker ic = new InputChecker();
        System.out.println("Выберите номер пользователя, которого нужно редактировать");
        int editNum = ic.inputChecker(0);    //getting number of owner for editing
        int choice;
        User_v2 editedUser = table.get(editNum);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Какое поле Вы желаете отредактировать?");
            System.out.println("1. Имя");
            System.out.println("2. Фамилия");
            System.out.println("3. e-mail");
            System.out.println("4. Департамент");
            System.out.println("5. Выйти");
            choice = ic.inputChecker(1, 5);
            if (choice == 1) {
                System.out.print("Введите новое имя: ");
                String newFirstName = sc.next();
                editedUser.setFirstName(newFirstName);       //set new parameters using setter
            } else if (choice == 2) {
                System.out.print("Введите новую фамилию: ");
                String newSecondName = sc.next();
                editedUser.setSecondName(newSecondName);         //set new parameters using setter
            } else if (choice == 3) {
                System.out.print("Введите новый e-mail: ");
                String newEmail = sc.next();
                editedUser.setEmail(newEmail);     //set new parameters using setter
            } else if (choice == 4) {
                System.out.print("Введите новый департамент: ");
                String newDep = sc.next();
                editedUser.setDepartment(newDep);    //set new parameters using setter
            }
        } while (choice != 5);
        table.set(editNum, editedUser);
    }

    public static void displayResult(ArrayList<User_v2> table) {
        for (int i = 0; i < table.size(); i++) {
            if (i == 0) {
                System.out.print(" ┌─");
                for (int j = 1; j < table.get(i).length + 1; j++) {
                    int cellSize = calculateCellSize(j);
                    for (int k = 0; k < cellSize; k++) {
                        System.out.print("─");
                    }
                    System.out.print("─┬─");
                }
                System.out.println("───────────────────────────────────────┐");
            }
            for (int j = 0; j < table.get(i).length + 1; j++) {
                System.out.print(" │ ");
                int cellSize = calculateCellSize(j + 1);
                if (i == 0) {
                    if (j == 0) {
                        System.out.printf("%-" + cellSize + "s", " № ");
                    } else if (j == 1) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getFirstName());
                    } else if (j == 2) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getSecondName());
                    } else if (j == 3) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getEmail());
                    } else {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getDepartment());
                    }

                } else {
                    if (j == 0) {
                        System.out.printf("%-" + cellSize + "s", (i));
                    } else if (j == 1) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getFirstName());
                    } else if (j == 2) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getSecondName());
                    } else if (j == 3) {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getEmail());
                    } else {
                        System.out.printf("%-" + cellSize + "s", table.get(i).getDepartment());
                    }
                }
                if (j == table.get(i).length) {
                    System.out.println(" │");
                }
            }
            if (i < table.size() - 1) {
                System.out.print(" ├─");
                for (int j = 1; j < table.get(i).length + 1; j++) {
                    int cellSize = calculateCellSize(j);
                    for (int k = 0; k < cellSize; k++) {
                        System.out.print("─");
                    }
                    System.out.print("─┼─");
                }
                System.out.println("───────────────────────────────────────┤");
            } else {
                System.out.print(" └─");
                for (int j = 1; j < table.get(i).length + 1; j++) {
                    int cellSize = calculateCellSize(j);
                    for (int k = 0; k < cellSize; k++) {
                        System.out.print("─");
                    }
                    System.out.print("─┴─");
                }
                System.out.println("───────────────────────────────────────┘\n\n");
            }
        }
    }

    //this method will select the size based on the cell
    public static int calculateCellSize(int j) {
        int cellSize;
        if (j == 1) {
            cellSize = 3;
        } else if (j == 2) {
            cellSize = 15;
        } else if (j == 3) {
            cellSize = 13;
        } else if (j == 4) {
            cellSize = 30;
        } else {
            cellSize = 38;
        }
        return cellSize;
    }


}

