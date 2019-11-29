package inheritance;

public class AdultSportsmen extends Child {

	private String typeOfSport;
	
	public AdultSportsmen(int age, String name, String lastName) {
		super(age, name, lastName);
	}

	public String getTypeOfSport() {
		return typeOfSport;
	}

	public void setTypeOfSport(String typeOfSport) {
		this.typeOfSport = typeOfSport;
	}

	@Override
	public void sayHelloPolymorphism() {
		System.out.println("Hella Good!");
	}
	
	
	
	
}
