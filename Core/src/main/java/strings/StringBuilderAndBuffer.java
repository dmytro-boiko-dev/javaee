package strings;

/**
 StringBuffer - is mutable; thread save; slow;
 StringBuilder - is mutable; not thread save; fast;
 */
public class StringBuilderAndBuffer {
    public static void main(String[] args) {

        System.out.println("Delete:");
        StringBuilder stringBuilder = new StringBuilder("Ratamatahatta");
        System.out.println(stringBuilder);
        stringBuilder.delete(2, 5);
        System.out.println(stringBuilder);

        System.out.println("Insert:");
        StringBuilder stringBuilder1 = new StringBuilder("Java");
        System.out.println(stringBuilder1);
        stringBuilder1.insert(1, "L");
        System.out.println(stringBuilder1);
        stringBuilder1.deleteCharAt(1);
        System.out.println(stringBuilder1);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        System.out.println("Append:");
        stringBuilder.append(stringBuilder1);
        System.out.println(stringBuilder + " <-- WTF?!");


        StringBuilder substring = new StringBuilder("submarine");
        System.out.println(substring);
        System.out.println(substring.substring(0,3));
    }
}
