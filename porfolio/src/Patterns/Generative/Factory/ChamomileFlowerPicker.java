package Patterns.Generative.Factory;

public class ChamomileFlowerPicker implements FlowerPicker{
    @Override
    public void pickFlower() {
        System.out.println("Create bouquet Chamomile...");
    }
}
