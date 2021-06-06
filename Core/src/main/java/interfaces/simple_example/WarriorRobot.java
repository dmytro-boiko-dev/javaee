package interfaces.simple_example;

public class WarriorRobot implements Robotics {

    String name;
    static int fights = 0;

    public WarriorRobot(String name){
        this.name = name;
        fights++;
    }

    public void doJob() {
        System.out.println("Fight!");
    }
}
