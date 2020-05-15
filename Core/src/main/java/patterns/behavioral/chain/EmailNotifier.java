package patterns.behavioral.chain;

/**
 * Realization of Notifier for middle important events
 */
public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
