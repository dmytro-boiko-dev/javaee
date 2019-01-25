package Exceptions;

public class ExceptionsExample {

    private static int a = 1;
//    private static int b;
    private static int c;

    private static void func(){
        int b = a / 0;
    }

    private static void testMethod(int a, int b){
        c = a * b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        testMethod(3, 83);

        try{
            System.out.println("0");
            func();
            System.out.println("1");
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println("exception");
        }
        finally {
            System.out.println("finally should run even if exception was thrown");
        }

        int sum = 2 + 2;
        System.out.println(sum);

    }
}
