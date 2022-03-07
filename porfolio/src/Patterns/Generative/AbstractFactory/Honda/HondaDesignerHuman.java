package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.DesignerHuman;

public class HondaDesignerHuman implements DesignerHuman {
    @Override
    public void createDesignCar() {
        System.out.println("Create design Honda...");
    }
}
