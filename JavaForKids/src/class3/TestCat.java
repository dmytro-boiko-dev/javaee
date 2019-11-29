package class3;

public class TestCat {

    public static void main(String[] args) {

//        catRun(5, 8, " котов.");

        int truckVolume = countVolume(3, 5, 2);
        System.out.println("Объем прицепа грузовика равен: " + truckVolume);

    }

    static void catRun(int x, int y, String z) {

        int summ = x + y;
        System.out.println("Всего у бабули " + summ + z);

    }



    private static int countVolume(int a, int b, int c){

        int result = a * b * c;

        return result;
    }

}
