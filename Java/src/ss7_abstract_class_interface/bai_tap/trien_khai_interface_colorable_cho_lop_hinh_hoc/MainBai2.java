package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Circle;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Rectangle;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Shape;
import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Square;

public class MainBai2 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(10);
        shapes[1]=new Rectangle(20,21);
        shapes[2]=new Square(15);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("diện tích hình tròn là : " + circle.getArea());
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("diện tích hình chữ nhật là : " + rectangle.getArea());
            }
            if (shape instanceof Square) {
                Colorable colorable=(Square)shape;
                colorable.toMau();
            }
        }
    }
}
