package strings;

public class StringPool {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";

        System.out.println("s1 equals s2: " + s1.equals(s2)); // true
        System.out.println("s1 == s2: " + (s1 == s2)); // true


        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // false

    }
}
