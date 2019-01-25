package udemy1;

public class Casting {
    public static void main(String[] args) {

        short shortValue = 10_000;
        int intValue = 10_000;
        float floatValue = 3.14214356457F;
        double doubleValue = 3.14214356457;

        int newIntValue = shortValue; // cast short to int
        short newShortValue = (short) intValue; // cast int to short

        double newDoubleValue = floatValue;
        float newFloatValue = (float) doubleValue;


        System.out.println("Short to int: " + newIntValue);
        System.out.println("Int to short: " + newShortValue);

        System.out.println("Float to double: " + newDoubleValue);
        System.out.println("Double to float: " + newFloatValue);


    }
}
