public class NorseTestOne {

    public static String str0 = "g{fsdfg}s";
    public static String str1 = "g{f(sd)fg}s";
    public static String str2 = "{g{fsdfg}s";
    public static String str3 = "{{[cc(c)ggg]}ssss}";
    public static String str4 = "{{[cc(c)ggg]}ssss}{";

    public static char leftRoundBrackets = '(';
    public static char rightRoundBrackets = ')';

    public static char leftSquereBrackets = '[';
    public static char rightSquereBrackets = ']';

    public static char leftBraces = '{';
    public static char rightBraces = '}';

    public static int count0 = 0;
    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;


    public static boolean checkRoundBracesCount(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == leftRoundBrackets) {
                count0++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == rightRoundBrackets) {
                count1++;
            }
        }

        if (count0 == count1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSquereBracesCount(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == leftSquereBrackets) {
                count2++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == rightSquereBrackets) {
                count3++;
            }
        }

        if (count2 == count3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkBracesCount(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == leftBraces) {
                count4++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == rightBraces) {
                count5++;
            }
        }

        if (count4 == count5) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String temp = str4; // change to strN if needed

        if (checkRoundBracesCount(temp) == true &&
                checkSquereBracesCount(temp) == true &&
                checkBracesCount(temp) == true) {
            System.out.println(temp + " - true");
        } else {
            System.out.println(temp + " - false");
        }

    }
}