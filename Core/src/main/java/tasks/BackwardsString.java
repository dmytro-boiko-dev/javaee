package tasks;

import java.util.*;

public class BackwardsString {
    public static void main(String[] args) {

        String inputString = "abcd";
        String backwardsString = inputString;
//        Stack<Character> stack = new Stack<>();

        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
//            stack.push(c);
//            list.add(c);
            list.add(i, c);
        }

//        Object[] objects = stack.toArray();
//        backwardsString = Arrays.toString(objects);

//        Object[] objects = list.toArray();
        backwardsString = list.toString();
        System.out.println(backwardsString);
    }
}
