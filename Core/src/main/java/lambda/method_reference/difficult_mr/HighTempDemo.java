package lambda.method_reference.difficult_mr;

public class HighTempDemo {

    static <T> int counter(T[] vals, FuncInter<T> fi, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {

            if (fi.func(vals[i], v)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int localCount;

        HighTemp[] daysHighs = {
                new HighTemp(27), new HighTemp(22),
                new HighTemp(19), new HighTemp(25),
                new HighTemp(18), new HighTemp(20),
                new HighTemp(24), new HighTemp(25),
        };

        localCount = counter(daysHighs, HighTemp::sameTemp, new HighTemp(25));

        System.out.println("Days when max temp was 25: " + localCount);

        localCount = counter(daysHighs, HighTemp::lessThenTemp, new HighTemp(25));

        System.out.println("Days when max temp was less then 25: " + localCount);

    }
}
