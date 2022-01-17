package Patterns.Factory;

public class OrchidFlowerFactory implements FlowerFactory{
    @Override
    public Flower riseFlower() {
        return new Orchid();
    }
}
