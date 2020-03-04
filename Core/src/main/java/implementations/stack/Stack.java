package implementations.stack;

public class Stack {
    int[] stack = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    void push(int element) {
        if (top == 9) {
            System.out.println("Stack is full");
        } else {
            ++top;
            stack[top] = element;

        }
    }

    int pull() {
        int element;
        if (top > 0) {
            element = stack[top];
            top--;
            return element;
        } else {
            return 0;
        }
    }
}
