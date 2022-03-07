package Patterns.Behavioral.ChainOfResponsibility;

public class SimpleReportNotification extends Notifier{

    public SimpleReportNotification(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: "+message);
    }
}
