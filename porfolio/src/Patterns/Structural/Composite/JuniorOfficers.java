package Patterns.Structural.Composite;

public class JuniorOfficers implements Officers{
    @Override
    public void createTactic() {
        System.out.println("Junior officers create tactic...");
    }
}
