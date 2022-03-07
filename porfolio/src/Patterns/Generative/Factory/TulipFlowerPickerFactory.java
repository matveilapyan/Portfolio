package Patterns.Generative.Factory;

public class TulipFlowerPickerFactory implements FlowerPickerFactory{
    @Override
    public FlowerPicker createFlowerPicker() {
        return new TulipFlowerPicker();
    }
}
