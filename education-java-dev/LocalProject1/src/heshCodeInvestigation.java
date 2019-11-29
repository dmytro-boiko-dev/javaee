
public class heshCodeInvestigation {

	public static void main(String[] args) {
		Object object = new Object();
		Object object1 = new Object();
		int hCode = 7;
		hCode = object.hashCode();
		
		object = object1;
		object.equals(object1);
		
		System.out.println(hCode);
		System.out.println(object);
		System.out.println(object1);		

	}
	

}
