
public class PatternsBuilder {
	

	enum Robots {
		R2D2, T1000, BB8, C3PO
	}
	
//	Robots r2d2 = Robots.R2D2;
	
	class RobotsSquad{
		
	//свойства класса
		String name;
		Robots robots;
		int power;
		
	//сеттеры для свойств
		public void setName(String name) {this.name = name;}
		public void setRobots(Robots robots) {this.robots = robots;}
		public void setPower(int power) {this.power = power;}
		
	}
	
	class RobotsBuilder{
		
	}
	
	
	
	
	public static void main (String[] args){
		
		
		for (Robots r2d2 : Robots.values()){
			System.out.println(r2d2.ordinal() + ": " + r2d2);		
		}
		


	
 }	
}

