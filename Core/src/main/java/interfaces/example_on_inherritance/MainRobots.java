package interfaces.example_on_inherritance;

public class MainRobots {
    public static void main(String[] args) {

        WorkerRobot worker = new WorkerRobot();
        worker.doJob();

        Robots robots = new Robots();
        robots.doJob();

    }
}
