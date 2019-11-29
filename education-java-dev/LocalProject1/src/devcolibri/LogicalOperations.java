package devcolibri;

public class LogicalOperations {
	
	public static void main(String[] args){
		
		int a = 90;
		int b = 60;
		boolean c = true;
		
		if (a == b){
			System.out.println("Thats true.");
		}else if(a == b && c){
			System.out.println("Thats also true.");
		}else if(a == b || c){
			System.out.println("Thats false.");
		}
	}

}
