package lambda.lambda_as_argument;

/**
 * Using Lambda as argument for method
 */
public class LambdaSimpleMain {

    private static String useLambda(LambdaSimple ls, String str){
        return ls.func(str);
    }

    public static void main(String[] args) {

        String inputString = "Java (programming language)";
        System.out.println("Source string: ");
        System.out.println(inputString);

        String outputString = useLambda((str) -> str.toUpperCase(), inputString);
        System.out.println("Output string: ");
        System.out.println(outputString);

        outputString = useLambda((str) -> {

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' '){
                    result = result + str.charAt(i);
                }
            }

            return result;
        }, inputString);

        System.out.println("Output string without spaces: ");
        System.out.println(outputString);


    }
}
