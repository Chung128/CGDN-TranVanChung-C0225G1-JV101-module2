package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.interface1;

import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Circle;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[2];
        circles[0]= new ComparableCircle(10.0);
        circles[1]=new ComparableCircle(12,"black",true);
        System.out.println("Đã được sắp xếp trước");
        for (ComparableCircle comparableCircle:circles){
            System.out.println(comparableCircle);
        }
    }
}
