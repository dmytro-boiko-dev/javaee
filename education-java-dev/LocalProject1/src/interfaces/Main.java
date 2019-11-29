package interfaces;

public class Main {
	public static void main(String[] args){
		DriverBus driverBus = new DriverBus();
		System.out.println(driverBus.getSpeed());
		driverBus.setCategory("B");
		driverBus.go();
	}

}
