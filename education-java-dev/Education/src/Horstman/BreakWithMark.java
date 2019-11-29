package Horstman;

public class BreakWithMark {
	public static void main(String... args){
		
		
		mark:
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			
			if (i == 4){
				break mark;
			}			
		}
		/*
		System.out.println("-------------------------------------------");

		int sum = 0;
		for(int i = 1; i <=10; i++){
			if(i % 2 == 0){
				System.out.println("---");
			}
			sum = sum + i;
			System.out.println("Sum = " + sum + " | " + "i = " + i);
		}
		
		System.out.println("-------------------------------------------");

		// if continue condition is true - back to parent cyrcle
		// if continue condition is false - execute rest of code inside cyrcle
		
		int zum = 0;
		for(int i = 1; i <=10; i++){
			if(i % 2 == 1){
				continue;
			}
			zum = zum + i;
			System.out.println(zum + " | " + i);
		}
	*/
	}
}
