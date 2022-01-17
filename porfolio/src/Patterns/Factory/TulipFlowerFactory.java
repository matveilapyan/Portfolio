package Patterns.Factory;

public class TulipFlowerFactory implements FlowerFactory{
    @Override
    public Flower riseFlower() {
        return new Tulip();
    }
}
