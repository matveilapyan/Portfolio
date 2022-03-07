package Patterns.Generative.AbstractFactory.Audi;

import Patterns.Generative.AbstractFactory.SellManagerCar;

public class AudiSellManager implements SellManagerCar {
    @Override
    public void sellCar() {
        System.out.println("Sell Audi car...");
    }
}
