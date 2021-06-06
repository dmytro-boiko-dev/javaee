package static_non_static;

public class GoldMain {
    public static void main(String[] args) {

        Gold britishGold = new Gold(10);
        Gold americanGold = new Gold(7);
        Gold indianGold = new Gold(1);

//        britishGold.price = 15;
//        americanGold.price = 10;



        System.out.println("britishGold.price = " + britishGold.price);
        System.out.println("americanGold.price = " + americanGold.price);
        britishGold.goldMethod();
        Gold.goldStaticMethod();

        System.out.println("count = " + Gold.count);

    }
}
