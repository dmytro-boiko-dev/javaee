package exceptions;

public class NegativeNumbersCheck {
    public static void main(String[] args) {

        Integer result = squereRoot(3, -4);
        System.out.println(result);
    }


    public static Integer squereRoot (int a, int b){
        if(a <=0 || b <= 0){
            throw new IllegalStateException("Numbers are invalid: a = " + a + ", b = " + b);
        } else {
            return a * b;
        }
    }
}
