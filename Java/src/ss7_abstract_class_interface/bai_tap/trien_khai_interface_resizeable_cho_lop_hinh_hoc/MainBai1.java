package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Circle;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Rectangle;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Shape;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Square;

public class MainBai1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("diện tích hình tròn ban đầu : " + circle.getArea());
                circle.resize(20);
                System.out.println("diện tích hình tròn sau thay đổi : " + circle.getArea());
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("diện tích hình chữ nhật ban đầu : " + rectangle.getArea());
                rectangle.resize(20);
                System.out.println("diện tích hình chữ nhật sau thay đổi : " + rectangle.getArea());
            }
            if (shape instanceof Square ) {
                Square square=(Square)shape;
                System.out.println("diện tích hình vuông ban đầu : " + square.getArea());
                square.resize(20);
                System.out.println("diện tích hình vuông sau thay đổi : " + square.getArea());
            }
        }
    }
}
