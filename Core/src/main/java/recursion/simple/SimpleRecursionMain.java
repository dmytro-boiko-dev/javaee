package recursion.simple;

public class SimpleRecursionMain {
    public static void main(String[] args) {

        SimpleRecursion sr = new SimpleRecursion(10);

        for (int i = 0; i < 10; i++) {
            sr.array[i] = i * 10;
        }

        sr.printArray(10);
    }
}
