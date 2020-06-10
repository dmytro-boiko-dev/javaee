package lambda.generic_fi;

public class GenFuncMain {
    public static void main(String[] args) {

        GenericFunctionalInterface<String> fi = (str) -> {
            String result = "";

            for (int i = str.length() -1; i >=0 ; i--) {
                result = result + str.charAt(i);
            }

            return result;
        };

        System.out.println("String usage of generic FI:");
        System.out.println(fi.func( "qwerty"));

        GenericFunctionalInterface<Integer> fInt = (num) -> {

            int result = 1;

            for (int i = 1; i < num; i++) {
                result = result * i;
            }

            return result;
        };

        System.out.println("Integer usage of generic FI:");
        System.out.println(fInt.func(6));


    }
}
