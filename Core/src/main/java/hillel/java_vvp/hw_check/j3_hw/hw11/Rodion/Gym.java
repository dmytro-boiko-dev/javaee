package hillel.java_vvp.hw_check.j3_hw.hw11.Rodion;

public class Gym {
    public static void main(String[] args) {

        Fitness firstClient = new Fitness("Alex", 22, 8, 2002, "azazartem1@gmail.com",
                "380660921048", "Tkachenko", 60, 120, 10000);
        firstClient.getAge();
        System.out.println(firstClient);

        Fitness secondClient = new Fitness("Eugen", 12, 4, 2000, "eugenCrabs@gmail.com",
                "380921112223", "Priluka", 67, 100, 1000);
        secondClient.getAge();
        System.out.println(secondClient);

        Fitness thirdClient = new Fitness("Enver", 3, 6, 2004, "enver0306@gmail.com",
                "380637283749", "Menadiev", 65, 120, 15000);
        thirdClient.getAge();
        System.out.println(thirdClient);

        Fitness fourthClient = new Fitness("Kirill", 22, 4, 2002, "kirill1794@gmail.com",
                "380660921085", "Zatyshniy", 70, 100, 5000);
        fourthClient.getAge();
        System.out.println(fourthClient);

        Fitness fifthClient = new Fitness("Yaroslav", 5, 2, 2002, "gapotchenko2311@gmail.com",
                "380949478454", "Gapotchenko", 90, 130, 7000);
        fifthClient.getAge();
        System.out.println(fifthClient);


        fourthClient.setSurname("Orlov");
        fifthClient.setWeight(86);

        System.out.println(fourthClient);
        System.out.println(fifthClient);

    }
}
