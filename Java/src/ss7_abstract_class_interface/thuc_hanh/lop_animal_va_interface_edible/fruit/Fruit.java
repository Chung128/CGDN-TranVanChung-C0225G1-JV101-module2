package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.fruit;

import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;

public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Có thể ăn sống.";
    }
}
