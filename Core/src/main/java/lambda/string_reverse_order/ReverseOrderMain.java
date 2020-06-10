package lambda.string_reverse_order;

public class ReverseOrderMain {

    public static void main(String[] args) {

        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() -1; i >= 0; i--) {
                result = result + str.charAt(i);

            }
            return result;
        };

        System.out.println("Reversed word is : " + reverse.getReversed("hello world"));
        System.out.println("Reversed word is : " + reverse.getReversed("昨天我是谁？今天谁是我？"));
    }
}
