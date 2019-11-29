package devcolibri;

public class RecursionMethod {

	public static void main(String[] args) {
		
		int sumOut = recMethod(5, 49);
		System.out.println(sumOut);

	}
	
	public static int recMethod(int a, int b){
		int sum = a + b;
		//recursion call below
		
		if (sum == 55){
			sum = recMethod(4, 8);
		}
		
		return sum;
	}

}
