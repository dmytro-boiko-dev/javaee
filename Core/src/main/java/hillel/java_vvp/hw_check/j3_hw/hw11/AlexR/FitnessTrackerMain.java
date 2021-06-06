package hillel.java_vvp.hw_check.j3_hw.hw11.AlexR;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Bob", "Marley", 31, 2, 1983,
                "Bobo@gmail.com", 54325345445L, 70.7, 120, 82, 10000);
        FitnessTracker person2 = new FitnessTracker("Andy", "Bayern", 7, 7, 2000,
                "AndyB@gmail.com", 643754623452L, 87.3, 142, 75, 9547);
        FitnessTracker person3 = new FitnessTracker("Mickey", "Stein", 31, 9, 1997,
                "Stein.m@gmail.com", 435345334L, 55.1, 114, 73, 13754);


        person1.printAccountInfo();
        person2.printAccountInfo();
        person3.printAccountInfo();

        person2.setWeight(57.3);
        person2.setSteps(11003);
        person3.setSurname("Cooper");
        person3.setDiastolicPressure(81);

        person2.printAccountInfo();
        person3.printAccountInfo();
    }
}
