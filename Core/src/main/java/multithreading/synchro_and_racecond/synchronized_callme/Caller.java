package multithreading.synchro_and_racecond.synchronized_callme;

public class Caller implements Runnable {

    String message;
    Callme target;
    Thread thread;

    public Caller(Callme trgt, String msg) {
        target = trgt;
        message = msg;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        target.call(message);
    }
}
