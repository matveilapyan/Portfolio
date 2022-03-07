package Patterns.Behavioral.ChainOfResponsibility;

public abstract class Notifier {
    public int priority;
    private Notifier nextNotifier;

    public Notifier(int priority){
        this.priority = priority;
    }
    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }
    public void notifyManager(String message, int level){
        if(level>= priority){
            write(message);
        }
        if(nextNotifier!=null){
            nextNotifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}
