package exceptions;

public class MainHandMadeExceptions {
	
	public static void main(String... args) {
	
		try {
			throw new HandMadeException();
		} catch (HandMadeException e) {
			
			e.printStackTrace();
		}
	
	}

}
