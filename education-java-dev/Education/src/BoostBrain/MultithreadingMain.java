package BoostBrain;

public class MultithreadingMain implements Runnable {
	
	private final String name;
	
	public MultithreadingMain(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		
		//try for sleep timer
		try {
		for(int i = 0; i < 10; i++){
			System.out.println(name + ": " + i);
			
			//stop for a certain time
				Thread.sleep(500);
		}
		
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
