package interfaces.simple_example;

public class TransformerRobot implements Robotics, Vehicles {

    public void doJob() {
        System.out.println("Transforming!");
    }

    public void ride() {
        System.out.println("Transformer rides!");
    }
}
