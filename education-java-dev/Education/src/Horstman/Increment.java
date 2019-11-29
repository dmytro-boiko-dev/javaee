package Horstman;

public class Increment {
    public static void main(String[] args) {
//        int a = 2;
//        int b = ++a + 3*a++ + 6*a;
//
//        System.out.println(b);
//        a=2;
//        b = a++ + a++;//5
//        System.out.println(b);
//        System.out.println(a);


        int c = 3;
        int d = c++ + 6*c + 2*(--c);
        System.out.println(d);
    }
}
