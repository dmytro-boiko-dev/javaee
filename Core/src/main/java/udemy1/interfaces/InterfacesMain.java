package udemy1.interfaces;

public class InterfacesMain {
    public static void main(String[] args) {
        Priceable pizza = new Pizza("Neapoli", 2, 150, Size.XXL);
        Priceable phone = new CellPhone("Nokia", "6", 3, 250);
        Priceable fridge = new Fridge("Samsung", "S9856", 2, 600);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    public static void printDeliveryPrice(Priceable priceable){
        System.out.println("Delivery price: " + priceable.calcDeliveryPrice());
        System.out.println("Order price: " + priceable.calcOrderPrice());
    }
}
