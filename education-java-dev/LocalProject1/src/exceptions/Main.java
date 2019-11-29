package exceptions;

public class Main {
	public static void main(String... args){
		String[] st = new String[5];
		
		try{
			System.out.println(st[8]);
	//	}catch (ArrayIndexOutOfBoundsException ex){
	//	}catch (Exception ex){
		}catch (Throwable ex){
			System.out.println("Element with this number doesn't exists!");
		}
	}

}
