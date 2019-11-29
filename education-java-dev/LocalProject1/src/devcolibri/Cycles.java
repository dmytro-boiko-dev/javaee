package devcolibri;

public class Cycles {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		String[] stringArray = "Hello World".split(" ");
		
		for(String s : stringArray){
			System.out.println(s);
		}
		System.out.println("--------------------------- ");
		
		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}

	}

}
