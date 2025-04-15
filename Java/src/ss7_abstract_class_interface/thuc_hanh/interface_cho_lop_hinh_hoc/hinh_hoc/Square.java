package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc;

import ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc.Colorable;
import ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_lop_hinh_hoc.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void resize(double phanTram) {
        setSide(getSide() * (1 + (phanTram / 100)));
    }

    @Override
    public void toMau() {
        System.out.println(" Color all four sides..");
    }
}
