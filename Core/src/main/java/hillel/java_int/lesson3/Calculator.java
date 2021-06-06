package hillel.java_int.lesson3;

public class Calculator {
    public static void main(String[] args) {

      char a = 'u';
      char b = 'a';

      char ukraine = (char)(a + b);

        System.out.println(a + b);
        System.out.println(ukraine);

        float v = myMethod(3.14f, 34.2f);
        System.out.println(v);
    }

    public static float myMethod(float a, float b){
        float result = a + (b * 42);
        return result;
    }

    public static int formula(int x, int y){

        int result = Math.abs( x - y );
        System.out.println("Formula #1 is working!");
        return result;
    }

    public static int formula(int x, int y, int z){
        int result = Math.abs( x - y - z );

        System.out.println("Formula #2 is working!");
        return result;
    }

    public static boolean formula(boolean x, boolean y, boolean z){
        boolean result = x == y == z;

        System.out.println("Formula #3 is working!");
        return result;
    }

    //                                       60
    public static int countAnimalsNextYear(int a, int b){

        int bears = (78); // 78
        int tigers = (78); // 78

        int total = bears + tigers;

        return total;

    }

    /* Task #4 - Zoo
		В зоопарке живут звери (каждого вида минимум 2, максимум 30):

			медведи, тигры, попугаи, слоны, еноты

		известно, что количество заверей увеличивается каждый год на определенный коофициент:

			медведи на 30%
			тигры на 20%
			попугаи на 40%
			слоны на 5%
			еноты на 80%

		задание:
			1) посчитать c помощью метода countAnimals() - сколько зверей
			    в зоопарке в этом году;
			2) с помощью метода countAnimalsNextYear()
			    посчитать - сколько их будет через год, учитывая коэффициенты;
			3) сделать такой же метод countAnimalsNextYear()
			    но с количеством зверей 6 (в зоопарк привезли еще кенгуру)



     */

}
