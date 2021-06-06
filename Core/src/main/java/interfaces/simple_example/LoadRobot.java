package interfaces.simple_example;

public class LoadRobot implements Robotics {

    float weight;
    int count;

    public LoadRobot(float weight, int count){
        this.weight = weight;
        this.count = count;
    }

    public void doJob() {

        float totalLoadWeight = weight * count;
        System.out.println("Total weight = " + totalLoadWeight);
    }
}
