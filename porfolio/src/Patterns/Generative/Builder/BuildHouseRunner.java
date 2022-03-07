package Patterns.Generative.Builder;

public class BuildHouseRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setHouseBuilder(new DifficultBuildHouse());
        House house = director.buildHouse();
        System.out.println(house);
    }
}
