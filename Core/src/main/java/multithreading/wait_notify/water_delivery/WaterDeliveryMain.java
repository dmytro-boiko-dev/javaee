package multithreading.wait_notify.water_delivery;

public class WaterDeliveryMain {
    public static void main(String[] args) {

        WaterQueryService waterQueryService = new WaterQueryService();
        new WaterProducer(waterQueryService);
        new WaterConsumer(waterQueryService);
    }
}
