package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape {" + '\n' +
                "color= " + getColor() + '\n' +
                "filled =" + isFilled() + '\n' +
                '}';
    }
}
