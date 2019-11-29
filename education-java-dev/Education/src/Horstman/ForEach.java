package Horstman;

import java.util.Arrays;

public class ForEach {
	public static void main(String... args){
		
		//create and fill an array
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = i;
		}
		
		for(int elem : a){
			System.out.println(elem);
		}
		
		// another type of array displaying
		System.out.println("another type of array displaying");
		System.out.println(Arrays.toString(a));
		
		
		
		System.out.println("   ");
		System.out.println("String array [str]:");
		System.out.println("   ");
		
		
		String[] str = new String[3];
		str[0] = "Odessa";
		str[1] = "Gmerenka";
		str[2] = "West Coast";
		
		//for each
		for(String elemString : str){
			System.out.println(elemString);
		}
		
		//same for string
		System.out.println(Arrays.toString(str));
		
		
		
		
	}

}
