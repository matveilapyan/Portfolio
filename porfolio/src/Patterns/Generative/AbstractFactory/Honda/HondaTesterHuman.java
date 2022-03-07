package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.TesterHuman;

public class HondaTesterHuman implements TesterHuman {
    @Override
    public void testCar() {
        System.out.println("Test Honda...");
    }
}
