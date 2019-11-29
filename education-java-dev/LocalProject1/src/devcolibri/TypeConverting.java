package devcolibri;

public class TypeConverting {

	static Integer int1 = 18;
	static Double dub = 3.14;	
	static Float flt = 5.14f;
	static Short shrt = 1;
	static String str1 = "Angus Yang";
	
	public static void main(String[] args){
		
	//primitive types:
		/*int con1 = (int) dub;
		double conv2 = a;
		
		System.out.println(con1);
		System.out.println(conv2);*/

	//reference types
		Number num = flt;
		Number num1 = dub;
		Integer i = num.intValue();
		Integer i1 = num1.intValue();
		
		System.out.println(i);
		System.out.println(i1);
		
	}

}
