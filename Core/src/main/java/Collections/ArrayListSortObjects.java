package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortObjects {
    public static void main(String[] args) {
        ArrayList<Cars> carsArrayList = new ArrayList<Cars>();

        carsArrayList.add(new Cars(99, "Subaru", 2.0));
        carsArrayList.add(new Cars(7, "Mitsubishi", 2.0));
        carsArrayList.add(new Cars(2, "Toyota", 1.8));
        carsArrayList.add(new Cars(5, "Honda", 1.5));
        carsArrayList.add(new Cars(1, "Suzuki", 0.9));

        System.out.println("Before sorting:");
        System.out.println(carsArrayList);

        Collections.sort(carsArrayList);
        System.out.println("After sorting:");
        System.out.println(carsArrayList);

    }

}

class Cars implements Comparable<Cars>{

    int id;
    String manufacturer;
    double engineCapacity;

    public Cars(int id, String manufacturer, double engineCapacity) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.engineCapacity = engineCapacity;
    }

    //        here is the sorting method; in this case - by id
    public int compareTo(Cars o) {
        //return this.id - o.id;
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
