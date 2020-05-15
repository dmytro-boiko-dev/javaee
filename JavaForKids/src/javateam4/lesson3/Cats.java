package javateam4.lesson3;

public class Cats {

    public static void main(String[] args) {

        int redCats = 7;
        int blackCats = 5;
        int whiteCats = 11;

        countCats(whiteCats, blackCats, " белых и черных котов.");
        countCats(redCats, blackCats, " рыжих и черных котов.");

        String result = sumCats(blackCats, whiteCats, " штук.");

        System.out.println("Всего котов = " + result);

        // параметры Truck
        int length; // длина
        int width; // ширина
        int height; // высота
        // countVolume()

    }
    //                            входные параметры метода
    public static void countCats(int a, int b, String kind){
        int sum = a + b;
        System.out.println("Всего котов у нас " + sum + kind);
    }

    public static String sumCats(int x, int y, String name) {

        int sum = x * y;
        String res = sum + name;

        return res;
    }

    // Truck




}
