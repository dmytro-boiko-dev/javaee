package generics.super_and_sub_classes;

public class HierarchyMain {
    public static void main(String[] args) {

        GenericSuper<Double> genSuper = new GenericSuper<Double>(3.14);

        Double obj1 = genSuper.getObj();
        System.out.println("Object from super class: " + obj1);

        GenericSub<String, Long> genSub = new GenericSub<>("keyNum", 159265359L);
        //                                               ^ parameters omitted

        String obj21 = genSub.getObj();
        System.out.println("Object #1 from sub-class: " + obj21);

        Long obj22 = genSub.getObj2();
        System.out.println("Object #2 from sub-class: " + obj22);

    }
}
