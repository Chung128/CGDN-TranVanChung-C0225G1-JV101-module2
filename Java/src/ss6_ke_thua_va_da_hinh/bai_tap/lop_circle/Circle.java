package ss6_ke_thua_va_da_hinh.bai_tap.lop_circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + '\n' +
                "radius=" + getRadius() + '\n' +
                ", color='" + getColor() + '\n' +
                "area=" + area() + '\n' +
                '}';
    }
}
