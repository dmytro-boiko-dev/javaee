package generics.restrictions_by_type;

/*
*   Type of class Stats can be any numeric type, that is under Number umbrella (extends it)
*   Therefore T can't be String or any non numeric type
*
*
 */
public class Stats<T extends Number> {
    T[] numbers;

    public Stats(T[] num){
        numbers = num;
    }

    double average(){
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i].doubleValue();
        }

        return sum / numbers.length;
    }
}
