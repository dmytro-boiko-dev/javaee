package udemy1.interfaces;

public class Fridge extends Electroics {

    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice() > 300){
            return 28;
        } else {
            return 0;
        }
    }
}
