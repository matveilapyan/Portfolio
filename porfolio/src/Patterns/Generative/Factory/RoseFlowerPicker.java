package Patterns.Generative.Factory;

public class RoseFlowerPicker implements FlowerPicker{

    @Override
    public void pickFlower() {
        System.out.println("create bouquet Rose...");
    }
}
