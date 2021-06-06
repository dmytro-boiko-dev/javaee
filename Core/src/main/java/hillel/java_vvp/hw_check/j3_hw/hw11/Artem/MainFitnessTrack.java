package hillel.java_vvp.hw_check.j3_hw.hw11.Artem;

public class MainFitnessTrack {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        FitnessTrack person1 = new FitnessTrack("Artem", 01, 01, 2000,
                "artembatyr@ukr.net", 123456789, "Baty4", 77.0, 220, 1456);

        person1.printAccountInfo();
        System.out.println("-----------------------------------------------------");
        FitnessTrack person2 = new FitnessTrack("Max", 02, 02, 1999,
                "max@ukr.net", 23456789, "Alaibov", 78.0, 90, 256);
        person2.printAccountInfo();
        System.out.println("-----------------------------------------------------");
        FitnessTrack person3 = new FitnessTrack("Sergei", 03, 12, 1234,
                "ser@ukr.net", 433456789, "Sebov", 13.1, 120, 96056);
        person3.printAccountInfo();
        System.out.println("-----------------------------------------------------");

        person2.setPressure(400);
        person2.setSurName("vksdfm");
        person2.printAccountInfo();
        System.out.println("-----------------------------------------------------");
        person3.setWeight(460);
        person3.printAccountInfo();

    }
}
