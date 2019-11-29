package inheritance;

public class AbstractCat extends AbstractAnimals{

	@Override
	void eat() {
		System.out.println("Eat");
		
	}

	@Override
	void say() {
		System.out.println("Meow, betch");
		
	}

}
