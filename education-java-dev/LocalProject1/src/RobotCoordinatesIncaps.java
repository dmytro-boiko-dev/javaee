//import java.awt.Robot;

public class RobotCoordinatesIncaps extends RobotIncaps {
	public static void main(String[] args){
		RobotIncaps robot = new RobotIncaps();
		
		robot.forward(20);
		robot.printCoordinates();
		robot.setCourse(10);
		robot.forward(20);
		robot.printCoordinates();
		
		robot.setCourse(45);
		robot.forward(30);
		robot.printCoordinates();
	}
}
