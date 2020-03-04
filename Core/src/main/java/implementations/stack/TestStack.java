package implementations.stack;

public class TestStack {
    public static void main(String[] args) {

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }

        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }

        System.out.println();
        for (int i = 10; i > 0; i--) {
            int current1 = stack1.pull();
            int current2 = stack2.pull();
            System.out.println("Stack1: " + current1 + " | " + "Stack2: " + current2);
        }
    }
}
