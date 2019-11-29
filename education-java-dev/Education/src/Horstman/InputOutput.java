package Horstman;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {
	public static void main(String... args) throws IOException{
		/*
		System.out.println("Enter your name:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hello " + name + ".");
		System.out.println("Enter your age " + name + ":");
		int age = input.nextInt();
		System.out.println("Ok, " + name + ", you will die after " + (100 - age) + " years. Betch!");
		*/
		
		Scanner in = new Scanner(Paths.get("D:\\myfile.txt"), "UTF-8");
		String some = in.nextLine();
		System.out.println(some);
		
		PrintWriter out = new PrintWriter("D:\\myfile1.txt",  "UTF-8");
		out.print("Savvy?");
		out.close();
	}

}
