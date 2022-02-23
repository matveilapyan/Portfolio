package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.Engineer;

public class AudiEngineer implements Engineer {
    @Override
    public void createCar() {
        System.out.println("Create Audi...");
    }
}
