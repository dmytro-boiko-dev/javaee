package inheritance;

public class Main {
	
	static Child child;
	
	
	public static void main(String[] args) {
		
		System.out.println("Some inheritence is here !!!");
		
		
		
		Child child1 = new Child(5, "Kid", "Rock");
		AdultSportsmen adultSportsmen = new AdultSportsmen(29, "Usain", "Bolt");
		adultSportsmen.setTypeOfSport("Judo");
		
		System.out.println(child1);
		
		child1.sayHelloPolymorphism();
		adultSportsmen.sayHelloPolymorphism();
		
	}
}
