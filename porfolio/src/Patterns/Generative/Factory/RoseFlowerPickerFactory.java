package Patterns.Generative.Factory;

public class RoseFlowerPickerFactory implements FlowerPickerFactory{
    @Override
    public FlowerPicker createFlowerPicker() {
        return new RoseFlowerPicker();
    }
}
