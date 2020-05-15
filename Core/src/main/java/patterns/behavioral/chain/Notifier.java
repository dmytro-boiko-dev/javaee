package patterns.behavioral.chain;

/**
 * Main handler with logic for selecting a handler,
 * that will handle the request;
 */
public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    // same logic for all
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    // same logic for all
    public void notifyManager(String message, int level){
        if(level >= priority){
            write(message);
        }
        if (nextNotifier != null){
            nextNotifier.notifyManager(message, level);
        }
    }

    // different for each realization
    public abstract void write(String message);
}
