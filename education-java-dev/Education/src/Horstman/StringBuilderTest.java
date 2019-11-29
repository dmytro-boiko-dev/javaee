package Horstman;

public class StringBuilderTest {
	public static void main(String... args){
		StringBuilder builder = new StringBuilder();
		builder.append("Tes");
		builder.append('t');
		
		String completeString = builder.toString();
		int len = builder.length();
		
		
		System.out.println(completeString);
		System.out.println(builder);
		System.out.println(len);
	}

}
