package Patterns.Structural.Composite;

public class SeniorOfficers implements Officers{
    @Override
    public void createTactic() {
        System.out.println("Senior officers create Tactic...");
    }
}
