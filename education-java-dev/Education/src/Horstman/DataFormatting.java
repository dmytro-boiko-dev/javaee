package Horstman;

import java.util.Date;

public class DataFormatting {
	public static void main(String... args){
		double result = 10000.0 / 3.0;
		double doubleNum = 1234.1234567;
		
		System.out.println(result);
		System.out.printf("%,7.3f", result);
		System.out.println("\n");
		System.out.printf("%,7.3f", doubleNum);
		System.out.println("\n");
		System.out.printf("%tc", new Date());
		System.out.println("\n");
		
		
	}
}
