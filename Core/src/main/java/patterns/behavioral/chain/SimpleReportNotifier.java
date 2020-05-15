package patterns.behavioral.chain;
/**
 * Realization of Notifier for low-priotity events
 */
public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
