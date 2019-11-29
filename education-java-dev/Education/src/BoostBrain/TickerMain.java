package BoostBrain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TickerMain {
	public static void main(String... args){
		MultithreadingMain first = new MultithreadingMain("First");
		MultithreadingMain second = new MultithreadingMain("Second");
		
		//one thread execution
		//first.run();
		//second.run();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(first);
		executorService.submit(second);
	} 

}
