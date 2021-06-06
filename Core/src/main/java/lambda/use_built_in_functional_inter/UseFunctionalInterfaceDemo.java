package lambda.use_built_in_functional_inter;

import java.util.function.Function;

public class UseFunctionalInterfaceDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> function = (n) -> {
            int result = 1;
            for (int i = 1; i < n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Factorial of 5 = " + function.apply(5));
        System.out.println("Factorial of 10 = " + function.apply(7));


    }
}
