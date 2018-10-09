import java.util.Stack;

public class NorseTestThree {

    public static Stack<String> firstIn(Stack<String> mainStack, String s){
        Stack<String> stackIn;
        mainStack.insertElementAt(s,0);
        stackIn = mainStack;
        return stackIn;
    }

    public static void main(String[] args) {
        Stack<String> mainStack = new Stack();

        mainStack.push("item1");
        mainStack.push("item2");
        mainStack.push("item3");

        System.out.println(mainStack);
        firstIn(mainStack, "test");
        System.out.println(mainStack);
        mainStack.pop();
        System.out.println(mainStack);
    }
}
