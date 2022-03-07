package Patterns.Generative.AbstractFactory.Audi;

import Patterns.Generative.AbstractFactory.*;

public class AudiTeamFactory implements ProjectTeamFactory {
    @Override
    public Engineer createCar() {
        return new AudiEngineer();
    }

    @Override
    public TesterHuman testerHuman() {
        return new AudiTesterHuman();
    }

    @Override
    public DesignerHuman designerHuman() {
        return new AudiDesignerHuman();
    }

    @Override
    public SellManagerCar sellManagerCar() {
        return new AudiSellManager();
    }
}
