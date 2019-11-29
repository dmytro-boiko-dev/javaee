package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airplane {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String stringNum = reader.readLine();
		int intNum = Integer.parseInt(stringNum);
		
	int divider = 2;
	int x = intNum % divider;
	
	if (x > 0){
		System.out.println("Not whole number.");
	}else{
		System.out.println("Number is good!");
	}
	
	
	
	}

}
