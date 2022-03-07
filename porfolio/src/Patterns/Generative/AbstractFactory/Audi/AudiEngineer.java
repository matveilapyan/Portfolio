package Patterns.Generative.AbstractFactory.Audi;

import Patterns.Generative.AbstractFactory.Engineer;

public class AudiEngineer implements Engineer {
    @Override
    public void createCar() {
        System.out.println("Create Audi...");
    }
}
