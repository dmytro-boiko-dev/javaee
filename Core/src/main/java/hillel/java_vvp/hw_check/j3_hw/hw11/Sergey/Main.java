package hillel.java_vvp.hw_check.j3_hw.hw11.Sergey;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String ...args) {
        ArrayList<Integer> randomNums = new ArrayList<>();
        ArrayList<String> randomSurnames = new ArrayList<>();
        ArrayList<Visitor> guests = new ArrayList<>();

        Collections.addAll(randomSurnames,"Zelenskiy","Goloborodko","Ivanov","Antonov");
        Collections.addAll(guests,
                new Visitor(
                        "Sergii", "Shynkarenko",
                        "atlantiks@bigmir.net",
                        "+38(063)7517677",
                        "124/72",
                        92.1,
                        10, 4, 1988,
                        11400
                ),
                new Visitor(
                        "Volodymyr", "Petruk",
                        "vova88@gmail.com",
                        "+38(063)2895782",
                        "115/75",
                        96.4,
                        31, 10, 1988,
                        6300
                ),
                new Visitor(
                        "Vladislav", "Kholod",
                        "chemax88@gmail.com",
                        "+38(063)4443322",
                        "130/90",
                        102.2,
                        11, 1, 1987,
                        8100
                ),
                new Visitor(
                        "Oleg", "Voskoboinikov",
                        "oleg_logist86ods@gmail.com",
                        "+38(050)9221914",
                        "140/105",
                        136.2,
                        15, 8, 1986,
                        4300
                ),
                new Visitor(
                        "Sergii", "Denysenko",
                        "s.denysenko@meta.ua",
                        "+38(063)9221914",
                        "118/72",
                        84.5,
                        12, 4, 1988,
                        9200
                ));

        System.out.println("Выводим данные пользователей...");
        for (Visitor guest : guests) {
            guest.getAccountInfo();
        }

        System.out.println("\n\nМеняем данные пользователей...");

        for (int i = 0; i < guests.size(); i++) {
            randomNums.add(i);
        }

        Collections.shuffle(randomNums);
        Collections.shuffle(randomSurnames);

        for (int i = 0; i < 2; i++) {
            guests.get(randomNums.get(i)).setFamilyName(randomSurnames.get(i));
            guests.get(randomNums.get(i)).setBodyWeight(Math.floor(60 + Math.random() * 61));
            guests.get(randomNums.get(i)).setBloodPressure("120/80");
            guests.get(randomNums.get(i)).setDailySteps((int)(1 + Math.random() * 10000));
        }

        System.out.println("Выводим повторно на печать...");
        for (Visitor guest : guests) {
            guest.getAccountInfo();
        }

    }
}
