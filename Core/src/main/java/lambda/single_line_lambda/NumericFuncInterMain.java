package lambda.single_line_lambda;

public class NumericFuncInterMain {
    public static void main(String[] args) {

        FuncInterNumeric fInterNum;

        fInterNum = () -> 3.14;

        System.out.println("Value of " + fInterNum.getValue());
    }
}
