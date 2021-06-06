package access_modifiers.package_two;

import access_modifiers.package_one.ClassA;

public class ClassSubA extends ClassA {
    public static void main(String[] args) {

        ClassA classA = new ClassA();

//        int def = classA.def; // can't be accessible

    }
}
