package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
	public static void main(String... args) {
		
	// simple List
		List list = new ArrayList<>();
		list.add(5);			// index:0
		list.add("Betch!");		// index:1
		
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		
		System.out.println("--------------------------------------------------");
		
	// List with generic <Integer>
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);			// index:0
		list1.add(7);			// index:1
		list1.add(8);			// index:2
				
		for(int n : list1){
			System.out.println(n);
		}
			
	}

}
