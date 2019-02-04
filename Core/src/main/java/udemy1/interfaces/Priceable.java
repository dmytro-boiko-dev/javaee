package udemy1.interfaces;

public interface Priceable extends Deliverable, Orderable {

    // Java 8
    default int calcPrice(){
        return calcOrderPrice() + calcDeliveryPrice();
    }

    // Java 8
    static void doSmth(){

    }
}
