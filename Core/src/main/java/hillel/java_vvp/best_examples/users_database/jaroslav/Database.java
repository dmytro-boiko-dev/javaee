package hillel.java_vvp.best_examples.users_database.jaroslav;

import java.util.ArrayList;

public class Database {
    public static void main(String[] args) {
        //creating users
        User user1 = new User("Иван", "Иванов", "ivanov@mail.com", "Юридический отдел");
        User user2 = new User("Семен", "Семенов", "semenov@mail.com", "Отдел разработки");
        User user3 = new User("Инна", "Степанова", "stepanova@mail.com", "Отдел HR");
        User user4 = new User("Джеймс", "Гослинг", "gosling@mail.com", "Отдел тестирования");
        User user5 = new User("Анастасия", "Стенли", "stenley@mail.com", "Бухгалтерия");

        //creating ArrayList<> and
        //adding users to ArrayList by add() method
        ArrayList<User> db = new ArrayList<>();
        db.add(user1);
        db.add(user2);
        db.add(user3);
        db.add(user4);
        db.add(user5);

        //displaying user info using foreach cycle
        for (User element: db){
            element.printUserInfo();
        }

        //removing user #4
        db.remove(user4);
        //getting index of user #1
        int index = db.indexOf(user1);
        //changing e-mail address for user #1
        user1.setEmail("\033[0;31;5mchanged@mail.com\033[0m");
        //setting the changed user #1 to its index
        db.set(index, user1);

        //displaying new user info
        System.out.println("\n╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
        System.out.println("            Измененная база");
        System.out.println("╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");

        for (User element: db){
            element.printUserInfo();
        }


    }
}
