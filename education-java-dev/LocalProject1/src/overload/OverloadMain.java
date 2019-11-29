package overload;

public class OverloadMain {

	public static void main(String[] args) {
		Overload over1 = new Overload();
		
		String s1 = over1.get();
		String s2 = over1.get(5);
		String s3 = over1.get("Captain Jack Sparrow");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		over1.get(true);
	}

}
