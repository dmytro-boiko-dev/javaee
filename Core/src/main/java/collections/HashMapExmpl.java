package collections;

import java.util.Collection;
import java.util.HashMap;

public class HashMapExmpl {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("one", 5);
        hashMap.put("two", 14);
        hashMap.put("three", 99);
        hashMap.put("five", 7);
        hashMap.put("four", -3);

        System.out.println(hashMap);

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(0, "dog");
        hashMap1.put(3, "cat");
        hashMap1.put(1, "fish");
        hashMap1.put(56, "ludacris");

        System.out.println(hashMap1);
        System.out.println(hashMap1.get(56));
        System.out.println(hashMap.containsKey("two") + " " + hashMap1.containsValue("dog"));

        hashMap.clear();
        System.out.println(hashMap.size());


        Collection<String> values = hashMap1.values();

        for (String value : values)
        {
            System.out.println(value);
        }

    }
}
