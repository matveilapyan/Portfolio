package Patterns.Factory;

public class RoseFlowerFactory implements FlowerFactory{
    @Override
    public Flower riseFlower() {
        return new Rose();
    }
}
