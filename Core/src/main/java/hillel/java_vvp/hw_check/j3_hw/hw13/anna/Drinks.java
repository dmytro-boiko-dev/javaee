package hillel.java_vvp.hw_check.j3_hw.hw13.anna;

public class Drinks {

    public static final double COFFEEPRICE = 4.1;
    public static final double TEAPRICE = 2.3;
    public static final double LEMONADEPRICE = 3.2;
    public static final double MOJITOPRICE = 6.5;
    public static final double WATERPRICE = 1.6;
    public static final double COLAPRICE = 5.8;

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


}
