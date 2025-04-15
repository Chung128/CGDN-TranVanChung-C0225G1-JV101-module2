package ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.interface1;

import ss7_abstract_class_interface.thuc_hanh.interface_cho_lop_hinh_hoc.hinh_hoc.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
