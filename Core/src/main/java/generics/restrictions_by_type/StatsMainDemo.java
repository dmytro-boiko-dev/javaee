package generics.restrictions_by_type;

public class StatsMainDemo {
    public static void main(String[] args) {

        Integer[] intNumbers = {12, 3, 6, 5, 0, 9, 46};
        Stats<Integer> intObject = new Stats<Integer>(intNumbers);

        double avrInt = intObject.average();
        System.out.println("Average value of intObject: " + avrInt);

        Double[] doubleNumbers = {3.14, 12.0, 6.1, 5.4, 0.01, 9.7, 36.6};
        Stats<Double> dubObject = new Stats<Double>(doubleNumbers);

        double avrDouble = dubObject.average();
        System.out.println("Average value of dubObject: " + avrDouble);
    }
}
