package Horstman;

public class Strings {
	public static void main(String... args){
		System.out.println("Betch!");
		
		
		String some = "Aziz light!1";
		String some2 = "Aziz light!1";
		String lowerCase = "as i walk throught the valley of";
		String trimS = "   one two three   ";
		
		int len = some.length();
		char symbol = some.charAt(11);
		boolean bool = some.equals("Some equal thing");
		boolean bool2 = some.equals(some2);
		boolean bool3 = some.equalsIgnoreCase("AZIZ LiGhT!1");
		String upperCase = lowerCase.toUpperCase();
		String trimmed = trimS.trim();
		String joInn = String.join("|", some, lowerCase);
		
		
		System.out.println(len +
				" " + symbol +
				" " + bool +
				" " + bool2 +
				" " + bool3);
		
		System.out.println(upperCase);
		System.out.println("|" + trimmed + "|");
		System.out.println(joInn);
	}

}
