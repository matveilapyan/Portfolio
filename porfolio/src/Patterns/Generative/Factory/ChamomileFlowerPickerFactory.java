package Patterns.Generative.Factory;

public class ChamomileFlowerPickerFactory implements FlowerPickerFactory{
    @Override
    public FlowerPicker createFlowerPicker() {
        return new ChamomileFlowerPicker();
    }
}
