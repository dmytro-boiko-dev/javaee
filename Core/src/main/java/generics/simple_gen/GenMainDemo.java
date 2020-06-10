package generics.simple_gen;

public class GenMainDemo {
    public static void main(String[] args) {

        // create link of type Gen for integers
        Gen<Integer> intObj;

        intObj = new Gen<Integer>(88);
        intObj.showType();

        int v = intObj.getObj1();
        System.out.println("Value: " + v);

        System.out.println();

        Gen<String> strObj = new Gen<String>("Text of object");
        strObj.showType();

        String str = strObj.getObj1();
        System.out.println("Value: " + str);

        System.out.println("=================================");

        GenTwo<String, Integer> obj3 = new GenTwo<String, Integer>("Hello", 1488);
        //                                           ^  and  ^ parameters can be omitted

        obj3.showTypes();

        String object1 = obj3.getObj1();
        Integer object2 = obj3.getObj2();

        System.out.println("Value of object1: " + object1);
        System.out.println("Value of object2: " + object2);
    }
}
