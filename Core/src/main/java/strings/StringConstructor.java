package strings;

public class StringConstructor {
    public static void main(String[] args) {

        int alphabet_length = 26;

        char[] charArray = new char[alphabet_length];
        byte[] byteArray = new byte[alphabet_length];
        int[] intArray = new int[alphabet_length];

        int i = 0;

        for (char ch = 'a'; ch <= 'z'; i++, ch++) {
            charArray[i] = ch;
            intArray[i] = (int) ch;
            byteArray[i] = (byte) ch;
        }

        System.out.println();
        String charString = new String(charArray);
        System.out.println("charString: " + charString);

        String byteString = new String(byteArray);
        System.out.println("byteArray: " + byteString);

        String intString = new String(intArray, 0, alphabet_length);
        System.out.println("intString: " + intString);

        int offset = 17;
        String intStringOffset = new String(intArray, offset, alphabet_length - offset);
        System.out.println("intStringOffset: " + intStringOffset);

        offset = 12;
        int length = 5;
        String intStringPart = new String(intArray, offset, length);
        System.out.println("intStringPart: " + intStringPart);

    }
}
