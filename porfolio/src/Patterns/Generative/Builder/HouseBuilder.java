package Patterns.Generative.Builder;

public abstract class HouseBuilder {
    House house;

    void createHouse(){
        house = new House();
    }
    abstract void buildName();
    abstract void buildMaterial();
    abstract void buildPrice();

    House getHouse(){
        return house;
    }
}
