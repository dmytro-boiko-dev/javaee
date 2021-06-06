package access_modifiers.package_one;

public class ClassB {
    public static void main(String[] args) {

        ClassA classA = new ClassA();

        int def = classA.def;

        System.out.println( "Class A.pub_lic = " + classA.pub_lic);
//        System.out.println( "Class A.priv = " + classA.priv ); // can't be accessible


    }
}
