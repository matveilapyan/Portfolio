package Patterns.Behavioral.ChainOfResponsibility;

public class Bugtracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotification(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK",Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!",Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we had a problem here!!!",Priority.ASAP);
    }
}
