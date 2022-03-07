package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.Engineer;

public class HondaEngineer implements Engineer {
    @Override
    public void createCar() {
        System.out.println("Create Honda...");
    }
}
