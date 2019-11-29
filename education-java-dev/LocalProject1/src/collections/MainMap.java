package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {
	public static void main(String... args){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key0", 2);
		map.put("key1", 4);
		map.put("key2", 8);
		map.put("key3", 16);
		map.put("key4", 32);
		
		
		//Integer key = map.get("key1");
		//System.out.println(key);
		
		for(String k : map.keySet()){
			System.out.println(k);
		}
	}

}
