package Patterns.Generative.Factory;

public class Client {
    public static void main(String[] args) {
        FlowerPickerFactory fPF = createFlowerPickerBySpecialty("chamomile");
        FlowerPicker fP = fPF.createFlowerPicker();

        fP.pickFlower();
    }
static FlowerPickerFactory createFlowerPickerBySpecialty(String specialty){
    if(specialty.equalsIgnoreCase("rose")){
        return new RoseFlowerPickerFactory();
    } else if(specialty.equalsIgnoreCase("tulip")){
        return new TulipFlowerPickerFactory();
    } else if(specialty.equalsIgnoreCase("chamomile")){
        return new ChamomileFlowerPickerFactory();
    }
    else {
        throw new RuntimeException(specialty+" is unknown specialty.");
    }
}
}
