package Horstman;

import java.util.*;

public class ArraySorting {

	public static void main(String... args) {
		
		int[] array = {5, 8, 12, 6, 7};
		/*
		// first version
		Arrays.sort(array);
		for(int k : array){

			System.out.println(k);
		}
		*/
		
		System.out.println("------------------");
		
		/*
		for(int i = 0; i < array.length; i++){
					
			Arrays.sort(array);
			for(int k : array){
				System.out.println(i + " : " + k);
					
			}
		}
		*/
		
		Arrays.sort(array);
		
		for(int k : array){
			
			
			for(int i = 0; i < array.length; i++){
			System.out.println(i + " : "  + k);
			
			}
			
			System.out.println("------------------");
		}
		
		
		
		
				
		//System.out.println(Arrays.toString(array));
	}

}
