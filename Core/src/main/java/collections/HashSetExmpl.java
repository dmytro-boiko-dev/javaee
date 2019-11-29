package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmpl {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Logitech");
        hashSet.add("Asus");
        hashSet.add("Apple");
        hashSet.add("Fujitsu");
        hashSet.add("Fujitsu"); // duplicate will not be added
        hashSet.add("Sony");

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
