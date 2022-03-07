package Patterns.Generative.Builder;

public class DifficultBuildHouse extends HouseBuilder{
    @Override
    void buildName() {
        house.setName("skyscraper");
    }

    @Override
    void buildMaterial() {
        house.setMaterial(MaterialHouse.STONE);
    }

    @Override
    void buildPrice() {
        house.setPrice(50000000);
    }
}
