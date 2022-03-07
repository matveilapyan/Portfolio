package Patterns.Generative.AbstractFactory;

import Patterns.Generative.AbstractFactory.Honda.HondaTeamFactory;

public class PoorMan {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new HondaTeamFactory();
        DesignerHuman designerHuman = projectTeamFactory.designerHuman();
        Engineer engineer = projectTeamFactory.createCar();
        TesterHuman testerHuman = projectTeamFactory.testerHuman();
        SellManagerCar sellManagerCar = projectTeamFactory.sellManagerCar();

        System.out.println("Prepare Honda...");
        System.out.println();
        designerHuman.createDesignCar();
        engineer.createCar();
        testerHuman.testCar();
        sellManagerCar.sellCar();

    }
}
