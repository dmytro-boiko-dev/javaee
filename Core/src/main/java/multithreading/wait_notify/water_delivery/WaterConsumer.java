package multithreading.wait_notify.water_delivery;

public class WaterConsumer implements Runnable {

    WaterQueryService waterQueryService;

    WaterConsumer(WaterQueryService waterQueryService) {
        this.waterQueryService = waterQueryService;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                waterQueryService.getWater();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
