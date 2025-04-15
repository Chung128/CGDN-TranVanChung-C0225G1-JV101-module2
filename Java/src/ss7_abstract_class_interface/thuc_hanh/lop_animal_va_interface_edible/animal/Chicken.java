package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.animal;

import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : chíp chíp ";
    }

    @Override
    public String howToEat() {
        return "Có thể nướng để ăn.";
    }
}
