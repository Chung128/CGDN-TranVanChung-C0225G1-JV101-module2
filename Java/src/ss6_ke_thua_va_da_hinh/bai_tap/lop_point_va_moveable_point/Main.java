package ss6_ke_thua_va_da_hinh.bai_tap.lop_point_va_moveable_point;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(10,11);
        movablePoint.setX(5);
        movablePoint.setXSpeed(2);
        System.out.println(movablePoint.move());
    }
}
