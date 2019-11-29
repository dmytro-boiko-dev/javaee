package Horstman;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String... args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Select boobs size: [1,2,3,4]");
		int choice = in.nextInt();
		switch (choice){
			case 1:
				System.out.println("Small!");
				break;
			case 2:
				System.out.println("Not bad!");
				break;
			case 3:
				System.out.println("Perfect!!!");
				break;
			case 4:
				System.out.println("Too much boobs!");
				break;
			default:
				System.out.println("No boobs!!11");
		}
		
		
		// if string
		Scanner stringIn = new Scanner(System.in);
		System.out.println("Enter your favorite girl name: ");
		String name = stringIn.next();
		switch (name.toLowerCase()){
			case "monika":
				System.out.println("Betch!");
				break;
			case "nastya":
				System.out.println("My lovely girl!");
				break;
			
			
		}
	}

}
