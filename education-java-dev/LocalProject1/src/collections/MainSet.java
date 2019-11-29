package collections;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainSet {
	public static void main(String... args) {
		List<String> list = new ArrayList<>();
		list.add("str1");
		list.add("str1");
		list.add("str1");
		for(String item : list){
			System.out.println(item);
		}
		/*
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		*/
		for(String st : list){
			System.out.println(st);
		}
		
		
		Set<String> set = new HashSet<String>();
		set.add("spring1");
		set.add("spring2");
		set.add("spring3");
		set.add("spring4");
		
	//variant A 
		/*
		Iterator<String> iterator1 = set.iterator();
		while (iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		*/
		
	//variant B
		for(String s : set){
			System.out.println(s);
		}
		
		
	}

}
