import java.util.Stack;

public class NorseTestThree {

    public static Stack<String> stack1 = new Stack<String>();
    public static Stack<String> stack2 = new Stack<String>();

    public static void queue (String item){
        stack1.push(item);
    }

    public static String deque(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {

        queue("item1"); // item1 first in
        queue("item2");
        queue("item3");
        queue("item4");
        queue("item5");

        System.out.println("source: " + stack1);

        deque(); // reverse stack1 into stack2 and remove item1 - first out (like in Queue)

        System.out.println("stack1: " + stack1);
        System.out.println("stack2: " + stack2);

    }
}
