package incapsulation;

public class ObjectMan {
	private int age;
	private String name;
	private String lastName;
	
	public ObjectMan(int age, String name, String lastName, ObjectCats cat) {
		super();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.cat = cat;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ObjectCats getCat() {
		return cat;
	}

	public void setCat(ObjectCats cat) {
		this.cat = cat;
	}

	private ObjectCats cat;

	@Override
	public String toString() {
		return "Man: " + name + "," + lastName + "," + age + " " + cat;
	}
}
