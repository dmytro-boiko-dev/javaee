package recursion.factorial;

public class FactorialMain {
    public static void main(String[] args) {

        Factorial fact = new Factorial();

        System.out.println("Factorial of 3 = " + fact.fact(3));
        System.out.println("Factorial of 5 = " + fact.fact(5));
        System.out.println("Factorial of 12 = " + fact.fact(12));

    }
}
