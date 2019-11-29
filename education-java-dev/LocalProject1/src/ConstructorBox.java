
public class ConstructorBox {
	
	int width;
	int height;
	int depth;
	
	//constructor.captain
	ConstructorBox (){
		width = 5;
		height = 7;
		depth = 3;		
	}
	
	int getVolume(){
		return width * height * depth;
	}
	
	private void setDim(int i, int j, int k) {
				
	}
	

	public static void main(String[] args) {
		
		ConstructorBox newBox = new ConstructorBox();
		newBox.setDim(10, 20, 30);
		System.out.println(newBox.getVolume());
	}


}
