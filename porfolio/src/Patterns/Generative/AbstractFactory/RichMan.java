package Patterns.Generative.AbstractFactory;

import Patterns.Generative.AbstractFactory.Audi.AudiDesignerHuman;
import Patterns.Generative.AbstractFactory.Audi.AudiTeamFactory;
import Patterns.Generative.AbstractFactory.Honda.*;

public class RichMan {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new AudiTeamFactory();
        DesignerHuman designerHuman = projectTeamFactory.designerHuman();
        Engineer engineer = projectTeamFactory.createCar();
        TesterHuman testerHuman = projectTeamFactory.testerHuman();
        SellManagerCar sellManagerCar = projectTeamFactory.sellManagerCar();

        System.out.println("Creating Audi car...");
        designerHuman.createDesignCar();
        engineer.createCar();
        testerHuman.testCar();
        sellManagerCar.sellCar();


    }
}
