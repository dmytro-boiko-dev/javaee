package multithreading.synchro_and_racecond.synchronized_callme;

class Callme {
    synchronized void call(String message) {
        System.out.print("[" + message);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
