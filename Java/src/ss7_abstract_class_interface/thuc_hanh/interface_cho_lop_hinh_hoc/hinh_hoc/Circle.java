package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc;

import ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc.Colorable;
import ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_lop_hinh_hoc.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + '\n' +
                "radius= " + getRadius() + '\n' +
                "color= " + super.getColor() + '\n' +
                "filled =" + super.isFilled() + '\n' +
                "area= " + getArea() + '\n' +
                "Perimeter= " + getPerimeter() + '\n' +
                '}';
    }

    @Override
    public void resize(double phanTram) {
        setRadius(getRadius() * (1 + (phanTram / 100)));
    }


}
