package Patterns.Generative.AbstractFactory.Audi;

import Patterns.Generative.AbstractFactory.TesterHuman;

public class AudiTesterHuman implements TesterHuman {
    @Override
    public void testCar() {
        System.out.println("Test Audi car...");
    }
}
