package Patterns.Generative.Builder;

public class Director {
    HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    House buildHouse(){
        houseBuilder.createHouse();
        houseBuilder.buildName();
        houseBuilder.buildMaterial();
        houseBuilder.buildPrice();

        House house = houseBuilder.getHouse();

        return house;
    }
}
