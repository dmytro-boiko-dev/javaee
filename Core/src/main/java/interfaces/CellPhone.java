package interfaces;

public class CellPhone extends Electroics {

    public CellPhone(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice() >= 150 || getQuantity() > 200){
            return 10;
        } else {
            return 0;
        }
    }
}
