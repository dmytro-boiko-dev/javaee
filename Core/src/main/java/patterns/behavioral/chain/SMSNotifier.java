package patterns.behavioral.chain;

/**
 * Realization of Notifier for most important events
 */
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS to manager: " + message);
    }
}
