package Patterns.Generative.Builder;

public class SimpleBuildHouse extends HouseBuilder{
    @Override
    void buildName() {
        house.setName("Villa");
    }

    @Override
    void buildMaterial() {
        house.setMaterial(MaterialHouse.WOOD);
    }

    @Override
    void buildPrice() {
        house.setPrice(50000);
    }
}
