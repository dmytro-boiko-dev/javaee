package Horstman;

public class Cycles {
	public static void main(String... args){
		

		
		// FOR
		for(int i = 10; i > 0; i--){
			System.out.println("Counting down.. " + i);
		}
		System.out.println("Betch!");			
		

		// WHILE
		int n = 6;
		while (n < 10){
			n++;
			System.out.println(n);
		}
		
		// DO WHILE
		int a = 1;
		do {
			a++;
			System.out.println("Betch!");
		} while (a < 3);
		
		// IF
		int d = 0;
		int e = 99;
		if (d <= 13 && e <= 7){
			System.out.println("D and E are correct");
		} else if (d < 0 || e == 99){
			System.out.println("This is it!");
		}
	
		
		// do while again
		int year = 0;
		do {
			
			year++;
			System.out.println(year);
		} while (year < 5);
			}

}
