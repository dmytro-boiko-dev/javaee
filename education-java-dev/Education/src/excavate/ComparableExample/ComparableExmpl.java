package excavate.ComparableExample;

import java.util.Set;
import java.util.TreeSet;

public class ComparableExmpl {

    public static void main(String[] args) {

        //for comporator
        PersonComporator personComporator = new PersonComporator();
        Set set = new TreeSet(personComporator);


        //for comparable
        //Set set = new TreeSet();
        set.add(new Person(5));
        set.add(new Person(2));
        set.add(new Person(11));
        set.add(new Person(6));

        for(Object obj : set){
            System.out.println(obj);
        }
    }
}
