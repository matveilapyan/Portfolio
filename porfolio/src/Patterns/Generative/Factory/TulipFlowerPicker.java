package Patterns.Generative.Factory;

public class TulipFlowerPicker implements FlowerPicker{

    @Override
    public void pickFlower() {
        System.out.println("create bouquet Tulip...");
    }
}
