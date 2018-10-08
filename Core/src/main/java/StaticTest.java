
class Stat {
    public static int field;

    static{
        //this is static block; value can be like:
        //field=5;
    }
}

class NonStat{
    public int field1;

    public int getField1() {
        return field1;
    }

    public int setField1(int field1) {
        this.field1 = field1;
        return field1;
    }

}


public class StaticTest {
    private static Stat stat;

    public static void main(String[] args) {

        Stat.field = 1;

        Stat s1 = new Stat();
        s1.field = 2;

        Stat s2 = new Stat();
        s2.field = 3;

        System.out.println(Stat.field);
        System.out.println(s1.field);
        System.out.println(s2.field);

        //as we can see - all souts show last value of field, because it is static

        NonStat nonStat =  new NonStat();
        int a1 = nonStat.setField1(1);
        int a2 = nonStat.setField1(2);
        int a3 = nonStat.setField1(3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // in the second case field1 returns three new values, because it is non static

        //also we can use static blocks:
        System.out.println(Stat.field);
    }
}
