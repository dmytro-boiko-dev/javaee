package exceptions.examples;

import javax.validation.constraints.Null;

public class ThrowExample {

    private static void doThrowable() {
        try {
            throw new NullPointerException("Exception #1");
        } catch (NullPointerException e) {
            System.out.println("NPE catched in doThrowable() method");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            doThrowable();
        } catch (NullPointerException e) {
            System.out.println("Main method NPE exception:" + e);
        }
    }
}
