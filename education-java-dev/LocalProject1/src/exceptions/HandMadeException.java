package exceptions;

public class HandMadeException extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("Hand Made Exception Betch!");
	}
	
	

}
