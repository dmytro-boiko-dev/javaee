package devcolibri;

public class MethodFunction {

	static final int CONSTANTSOME = 25;
	
	public static void main(String[] args) {
		methodSum(3, 8);
		int some = methodInt(45, 34);
		System.out.println("Third sum: " + some);
	}
	
	static void methodSum(int a, int b){
		int sum1 = a + b;
		int sum2 = a + b + CONSTANTSOME;
		System.out.println("First sum: " + sum1);
		System.out.println("Second sum: " + sum2);
		
	}
	
	static int methodInt(int c, int d){
		int i = c + d;
		return i;
	}

}
