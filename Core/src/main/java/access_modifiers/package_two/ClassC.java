package access_modifiers.package_two;

import access_modifiers.package_one.ClassA;

public class ClassC {
    public static void main(String[] args) {

        ClassA classA = new ClassA();

        int publ = classA.pub_lic;

    }
}
