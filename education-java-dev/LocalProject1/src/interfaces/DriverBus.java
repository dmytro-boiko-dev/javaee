package interfaces;

import incapsulation.ObjectMan;

public class DriverBus implements Transport,Driver{
	
	private ObjectMan man;
	private String category;
	private int speed = 60;

	@Override
	public void setCategory(String cat) {
		this.category = cat;
		man = new ObjectMan(37, "Dug", "Doctor", null);
	}

	@Override
	public void go() {
		if(man != null){
			System.out.println("Go!");
		} else {
			System.out.println("Duck! We don't have a driver!");
		}
				
	}

	@Override
	public int getSpeed() {
		return speed;
		
	}
}
