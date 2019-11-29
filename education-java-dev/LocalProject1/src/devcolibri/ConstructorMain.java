package devcolibri;

public class ConstructorMain {

	static Constructor constructor;
	
	public static void main(String[] args){
		
		constructor = new Constructor(2, "Bemedict CatBetBetch");		
		
		constructor.say();
		System.out.println(constructor);
	}
}
