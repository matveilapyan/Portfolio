package Patterns.Generative.AbstractFactory.Honda;

import Patterns.Generative.AbstractFactory.*;

public class HondaTeamFactory implements ProjectTeamFactory {
    @Override
    public Engineer createCar() {
        return new HondaEngineer();
    }

    @Override
    public TesterHuman testerHuman() {
        return new HondaTesterHuman();
    }

    @Override
    public DesignerHuman designerHuman() {
        return new HondaDesignerHuman();
    }

    @Override
    public SellManagerCar sellManagerCar() {
        return new HondaSellManager();
    }
}
