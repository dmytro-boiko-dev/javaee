package incapsulation;

public class ObjectCats {
	private int age;
	private String name;
	private String temper;
	
	
	
	public ObjectCats(int age, String name, String temper) {
		this.age = age;
		this.name = name;
		this.temper = temper;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getTemper() {
		return temper;
	}


	public void setTemper(String temper) {
		this.temper = temper;
	}


	public void say(){
		System.out.println("Meow betch!");
	}
	
	@Override
	public String toString(){
		return "Name: "+ name + ", Age = " + age + ", Temper: " + temper;
	}
	

}
