package multithreading.wait_notify.water_delivery;

/***
 * This service handles is user's water tanks are empty and depends on this
 * can order a water or bring water by getWater() and putWater() methods
 */

public class WaterQueryService {

    boolean isWaterTanksEmpty = false;

    synchronized void getWater() throws InterruptedException {

        while (!isWaterTanksEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }


        System.out.println("Water delivered to customer.");

        for (int i = 10; i >= 0; i = i - 2) {
            Thread.sleep(1000);
            System.out.println("Water level in tanks: " + (i * 10));
        }

        isWaterTanksEmpty = false;
        notify();

    }

    synchronized void putWater() throws InterruptedException {
        while (isWaterTanksEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }


        isWaterTanksEmpty = true;
            Thread.sleep(1000);
        System.out.println("Water sent to customer.");
        notify();

    }
}
