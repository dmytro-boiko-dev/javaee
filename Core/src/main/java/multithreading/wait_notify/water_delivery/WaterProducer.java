package multithreading.wait_notify.water_delivery;

public class WaterProducer implements Runnable {

    WaterQueryService waterQueryService;

    WaterProducer(WaterQueryService waterQueryService){
        this.waterQueryService = waterQueryService;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        while (true){
            try {
                waterQueryService.putWater();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
