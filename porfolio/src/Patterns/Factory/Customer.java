package Patterns.Factory;

public class Customer {
    public static void main(String[] args) {
        FlowerFactory flowerFactory = createFlower("rosE");
        Flower flower = flowerFactory.riseFlower();
        flower.writeCode();
    }
    static FlowerFactory createFlower(String flower){
        if(flower.equalsIgnoreCase("rose")) {
            return new RoseFlowerFactory();
        } else if(flower.equalsIgnoreCase("tulip")) {
            return new TulipFlowerFactory();
        } else if (flower.equalsIgnoreCase("orchid")) {
            return new OrchidFlowerFactory();
        } else {
            throw new RuntimeException(flower+"is unknown flower");
        }
    }
}
