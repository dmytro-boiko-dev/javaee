package devcolibri;

public class Arrays {
	
	static int[] array1 = new int[10];
	static String[] array2 = new String[5];
	
	public static void main(String[] args){
		array1[0] = 2;
		array1[1] = 3;
		array1[2] = 99;
		array1[3] = 87;
		array1[4] = 5;
		array1[5] = 66;
		array1[6] = 13;
		array1[7] = 00;
		array1[8] = 42;
		array1[9] = 3;
		
		array2[0] = "Fuck";
		array2[1] = " ";
		array2[2] = "the";
		array2[3] = " ";
		array2[4] = "System! ";
		
		
		
		//for (int n : array1) {
		for (int n=0; n < array1.length; n++) {
			System.out.println(n + ": " + array1[n]);
		}

		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i]);
		}
		
		
		
		
	}
}
