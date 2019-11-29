package overload;

public class Overload {
	public String get() {
		return "Betch!";
	}
	
	public String get(String st) {
		return st;
	}
	
	public String get(int number) {
		return "Number" + number;
	}
	
	public void get(boolean bool) {
		System.out.println(bool);
	}

}
