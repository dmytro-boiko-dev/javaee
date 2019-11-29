package excavate.HashCodeAndEquals;

public class HashCodeExample {

    private static String name = "Icar";

    public static void main(String[] args) {

        System.out.println(name.hashCode());
        HashCodeExample hashCodeExample = new HashCodeExample();
        System.out.println(hashCodeExample.hashCode());


        HashClass hashClass = new HashClass(42);
        System.out.println(hashClass.hashCodeGetMethod());
    }
}
