package hillel.java_vvp.hw_check.j4_hw.jaroslav_hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymMain_v3 {
    //constants definition for using color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_MAGENTA_BLINK = "\u001B[5;35m";
    public static final String ANSI_WHITE_BG = "\u001B[30;47m";

    public static void main(String[] args) {
        menu();
    }

    //creating owner using GymOwner_v2 class and place it to array of Strings. Return array
    public static String[] createRows() {
        System.out.println(ANSI_MAGENTA_BLINK + "Создание карточки пользователя фитнес-трекера" + ANSI_RESET);
        GymOwner_v3 owner = new GymOwner_v3(
                enterStringData("имя"),
                enterStringData("фамилию"),
                enterStringData("e-mail"),
                enterStringData("телефон"),
                enterStringData("дату рождения в формате: 01.01.2020"),
                enterStringData("вес"),
                enterStringData("давление"),
                enterStringData("количество шагов")
        );
        String[] array = {
                owner.getSurname(),
                owner.getName(),
                owner.getEmail(),
                owner.getPhoneNumber(),
                owner.getBirthDate(),
                String.valueOf(owner.calculatingAge()),
                owner.getWeight(),
                owner.getPressure(),
                owner.getStepsCount()
        };
        return array;

    }

    //scanning data from console input
    public static String enterStringData(String field) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + field + ": ");
        return sc.next();
    }

    //menu method
    public static void menu() {
        List<String[]> table = new ArrayList<String[]>();  //creating a List of arrays
        String[] header = {    //creating first element of List. This array will be a header of table.
                "Фамилия",
                "Имя",
                "e-mail",
                "Телефон",
                "Дата рождения",
                "Возраст, лет",
                "Вес, кг",
                "Давление",
                "Сч. шагов"
        };
        table.add(header);     //add this array to List
        int choice;
        do {
            InputChecker ic = new InputChecker();
            System.out.println(ANSI_MAGENTA_BLINK + "⚽∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴∴⚽" + ANSI_RESET);
            System.out.println("Программа управления фитнес-трекером. Сделайте выбор:");
            System.out.println(ANSI_MAGENTA_BLINK + "⚾∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵⚾" + ANSI_RESET);
            System.out.println("1. Создать пользователя");
            System.out.println("2. Редактировать пользователя");
            System.out.println("3. Показать таблицу");
            System.out.println("4. Выход");
            System.out.println(ANSI_MAGENTA_BLINK + "⛹∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷⛹" + ANSI_RESET);
            choice = ic.inputChecker(1, 4);
            if (choice == 1) {            //for menu item #1 calling createRows method for creating
                table.add(createRows());  //new class member and place it to array. Then add array to List table
            } else if (choice == 2) {
                table = editOwner(table);
            } else if (choice == 3) {     //for menu item # calling displayResult method for displaying
                displayResult(table);     //result in a table
            }
        } while (choice != 4);
        System.exit(0);             //for menu item #3 calling System.exit(0)
    }

    //editing owners
    public static List<String[]> editOwner(List<String[]> table) {
        List<String[]> newTable = table;
        InputChecker ic = new InputChecker();
        System.out.println("Выберите номер пользователя, которого нужно редактировать");
        int editNum = ic.inputChecker(0);    //getting number of owner for editing
        int choice;

        //creating a new class member with parameters from editing owner
        // by retrieving data from List item
        GymOwner_v3 owner = new GymOwner_v3(
                newTable.get(editNum)[1],
                newTable.get(editNum)[0],
                newTable.get(editNum)[2],
                newTable.get(editNum)[3],
                newTable.get(editNum)[4],
                newTable.get(editNum)[6],
                newTable.get(editNum)[7],
                newTable.get(editNum)[8]
        );
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Какое поле Вы желаете отредактировать?");
            System.out.println("1. Фамилия");
            System.out.println("2. Вес");
            System.out.println("3. Давление");
            System.out.println("4. Счетчик шагов");
            System.out.println("5. Выйти");
            choice = ic.inputChecker(1, 5);
            if (choice == 1) {
                System.out.print("Введите новую фамилию: ");
                String newSurname = sc.next();
                owner.setSurname(newSurname);       //set new parameters using setter
            } else if (choice == 2) {
                System.out.print("Введите новый вес: ");
                String newWeight = sc.next();
                owner.setWeight(newWeight);         //set new parameters using setter
            } else if (choice == 3) {
                System.out.print("Введите новое давление: ");
                String newPressure = sc.next();
                owner.setPressure(newPressure);     //set new parameters using setter
            } else if (choice == 4) {
                System.out.print("Введите новое количество шагов: ");
                String newStCount = sc.next();
                owner.setStepsCount(newStCount);    //set new parameters using setter
            }

        } while (choice != 5);
        //getting new parameters and creating an array
        String[] newArray = {
                owner.getSurname(),
                owner.getName(),
                owner.getEmail(),
                owner.getPhoneNumber(),
                owner.getBirthDate(),
                String.valueOf(owner.calculatingAge()),
                owner.getWeight(),
                owner.getPressure(),
                owner.getStepsCount()
        };
        newTable.set(editNum, newArray);         //replacing old array to new in a list
        return newTable;
    }

    //displaying result in a table
    public static void displayResult(List<String[]> table) {
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
                System.out.println("──────────┐");
            }
            for (int j = 0; j < table.get(i).length + 1; j++) {
                System.out.print(" │ ");
                int cellSize = calculateCellSize(j + 1);
                if (i == 0) {
                    if (j == 0) {
                        System.out.printf(ANSI_WHITE_BG + "%-" + cellSize + "s" + ANSI_RESET, " № ");
                    } else {
                        System.out.printf(ANSI_WHITE_BG + "%-" + cellSize + "s" + ANSI_RESET, table.get(i)[j - 1]);
                    }

                } else {
                    if (j == 0) {
                        System.out.printf("%-" + cellSize + "s", (i));
                    } else {
                        System.out.printf("%-" + cellSize + "s", table.get(i)[j - 1]);
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
                System.out.println("──────────┤");
            } else {
                System.out.print(" └─");
                for (int j = 1; j < table.get(i).length + 1; j++) {
                    int cellSize = calculateCellSize(j);
                    for (int k = 0; k < cellSize; k++) {
                        System.out.print("─");
                    }
                    System.out.print("─┴─");
                }
                System.out.println("──────────┘\n\n");
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
        } else if (j == 3 || j == 6 || j == 7) {
            cellSize = 13;
        } else if (j == 5) {
            cellSize = 17;
        } else if (j == 4) {
            cellSize = 30;
        } else {
            cellSize = 9;
        }
        return cellSize;
    }
}
