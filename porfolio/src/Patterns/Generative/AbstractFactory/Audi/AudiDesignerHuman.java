package Patterns.Generative.AbstractFactory.Audi;

import Patterns.Generative.AbstractFactory.DesignerHuman;

public class AudiDesignerHuman implements DesignerHuman {
    @Override
    public void createDesignCar() {
        System.out.println("Create design Audi...");
    }
}
