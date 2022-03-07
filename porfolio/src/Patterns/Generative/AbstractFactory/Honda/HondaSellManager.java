package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.SellManagerCar;

public class HondaSellManager implements SellManagerCar {
    @Override
    public void sellCar() {
        System.out.println("Sell Honda...");
    }
}
