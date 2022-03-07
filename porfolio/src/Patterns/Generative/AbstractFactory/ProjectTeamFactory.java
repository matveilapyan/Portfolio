package Patterns.Generative.AbstractFactory;

public interface ProjectTeamFactory {
    Engineer createCar();
    TesterHuman testerHuman();
    DesignerHuman designerHuman();
    SellManagerCar sellManagerCar();

}
