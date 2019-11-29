package devcolibri;

public class Constructor {
	private int age;
	private  String name;
	
	
	public Constructor(int age, String name) {
		this.age = age;
		this.name = name;
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



	public void say(){
		System.out.println("Meow, betch!");
	}

	@Override
	public String toString() {
		
		return age + " " + name;
	}

}
