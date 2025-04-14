package ss6_ke_thua_va_da_hinh.bai_tap.lop_circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double theTich() {
        return area() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + '\n' +
                "radius= " + getRadius() + '\n' +
                ", color = " + getColor() + '\n' +
                "height= " + getHeight() + '\n' +
                "volume= " + theTich() + '\n' +
                '}';
    }
}
