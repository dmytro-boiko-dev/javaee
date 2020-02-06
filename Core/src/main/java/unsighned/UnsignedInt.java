package unsighned;

public class UnsignedInt {
    public static void main(String[] args) {

        int original = Integer.MAX_VALUE;
        int maxIntOverflowCasted = (int) Integer.MAX_VALUE +3;
        int maxIntOverflowUncasted = Integer.MAX_VALUE +3;

        System.out.println("int ooriginal max: " + original);
        System.out.println("int overflow on 3: " + maxIntOverflowCasted);
        System.out.println("int overflow on 3 (uncast): " + maxIntOverflowUncasted);

        long intCastedToLong = (long)Integer.MAX_VALUE +3;
        System.out.println("int overflow on 3 inside long (cast): " + intCastedToLong);

        int parsedInt = Integer.parseUnsignedInt(new String("" + ((long) (Integer.MAX_VALUE) + 3)));
        System.out.println("parsedUnsighnedInt: " +  parsedInt);
    }
}
