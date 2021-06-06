package interfaces.simple_example;

public class MainRobotics {
    public static void main(String[] args) {

        LoadRobot loadRobot = new LoadRobot(20.0f, 12);
        WarriorRobot warriorRobot = new WarriorRobot("Atlant");

        loadRobot.doJob();
        warriorRobot.doJob();

        TransformerRobot transformer = new TransformerRobot();
        transformer.doJob();
        transformer.ride();
    }
}
