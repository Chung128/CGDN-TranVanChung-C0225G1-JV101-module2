package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc;

import ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc.Colorable;
import ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_lop_hinh_hoc.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + '\n' +
                "width = " + width + '\n' +
                "length = " + length + '\n' +
                "area = " + getArea() + '\n' +
                "perimeter = " + getPerimeter() + '\n' +
                '}';
    }

    @Override
    public void resize(double phanTram) {
        setWidth(getWidth()*(1+(phanTram/100)));
        setLength(getLength()*(1+(phanTram/100)));
    }


}
