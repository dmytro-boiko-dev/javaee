package static_non_static;

public class Gold {

    int price;
    // static int price;
    static byte count;
    
    public Gold(int price) {
        this.price = price;
        count++;
    }

    public void goldMethod() {
        System.out.println("This is non-static method.");
    }

    public static void goldStaticMethod() {
        System.out.println("This is static method.");
    }
}
