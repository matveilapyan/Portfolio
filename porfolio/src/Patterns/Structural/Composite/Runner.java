package Patterns.Structural.Composite;

public class Runner {
    public static void main(String[] args) {
        Army army = new Army();
        Officers seniorOfficers = new SeniorOfficers();
        Officers juniorOfficers = new JuniorOfficers();

        army.addOfficers(seniorOfficers);
        army.addOfficers(juniorOfficers);

        army.createTactic();

    }
}
