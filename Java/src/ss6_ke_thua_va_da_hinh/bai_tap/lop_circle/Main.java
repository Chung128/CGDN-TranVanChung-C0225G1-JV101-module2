package ss6_ke_thua_va_da_hinh.bai_tap.lop_circle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 5, "red");
        Circle circle = new Circle(5, "blue");
        cylinder.setColor("black");
        cylinder.setRadius(10);
        cylinder.setHeight(8);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
