package multitrading;

public class MTtestFirstThread {
    public static void main(String[] args) {
        System.out.println("Main thread, sir.");

        //we already start new thread
        MTtestSecondThread secondThread = new MTtestSecondThread();
        Thread mySecondThread = new Thread(secondThread);
        mySecondThread.start();

        System.out.println("End of main thread.");
    }
}
