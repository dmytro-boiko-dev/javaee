package Horstman;

import java.util.Arrays;

public class ArraysMain {
	public static void main(String... args){

		/*
	//one dimensional array
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++){
			a[i] = i;
			System.out.println(a[i]);
		}
		*/
		
	//sring array
		/*
		String[] cities = new String[5];
		cities[0] = "ODS";
		cities[1] = "DUB";
		cities[4] = "HVN";
		System.out.println(Arrays.toString(cities));
		*/

		/*
	//array initialization + fill
		int[] numbers = {0, 3, 4, 7, 12, 8};
		
	//anonymous array for re-initialization
		numbers = new int[] {1, 3, 5, 7, 9};
		
		for(int j : numbers){
			System.out.println(j);
		}
		*/
		
	// multiplication table

		   int b = 1;
	        for(int i = 1; i < 11; i++){
	        	System.out.print("[");
	            for(int j = 1; j < 11; j++){
	                int a = j * b;
	                
	                if(j == 10){
	                	String result = a + ""; // toString used here, bitch!
	                	System.out.print(result);
	                } else if (j < 10){
	                	String result = a + ","; // toString used here, bitch!
	                	System.out.print(result);
	                }
	            }
	           System.out.println("]");
	           b++;
	        }

		


	}
}
