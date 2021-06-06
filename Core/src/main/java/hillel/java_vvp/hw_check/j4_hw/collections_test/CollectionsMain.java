package hillel.java_vvp.hw_check.j4_hw.collections_test;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsMain {
    public static void main(String[] args) {

        BeatBox box1 = new BeatBox();
        box1.volume = 70.0;
        box1.style = "hip-hop";
        box1.rhyme = 1;

        BeatBox box2 = new BeatBox();
        box2.volume = 70.0;
        box2.style = "hoop-heep";
        box2.rhyme = 2;

        BeatBox box3 = new BeatBox();
        box3.volume = 66.0;
        box3.style = "black-hop";
        box3.rhyme = 3;

        ArrayList<BeatBox> beatBoxes = new ArrayList<>();

        beatBoxes.add(box1);
        beatBoxes.add(box2);
        beatBoxes.add(box3);

        BeatBox box4 = new BeatBox();
        box4.volume = 100.0;
        box4.style = "metal";
        box4.rhyme = 4;
        beatBoxes.add(box4);

        beatBoxes.remove(box2);

        for (BeatBox box : beatBoxes) {
            box.print();
            System.out.println("-------------------------------");
        }


//        System.out.println(beatBoxes);


//        LinkedList<String> list = new LinkedList<>();
//
//        list.add("Seattle");
//        list.add("Detroit");
//        list.add("Chicago");
//
//        System.out.println(list);



    }
}
