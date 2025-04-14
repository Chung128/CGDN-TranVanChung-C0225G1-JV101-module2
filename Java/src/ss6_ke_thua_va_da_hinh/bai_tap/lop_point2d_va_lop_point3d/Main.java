package ss6_ke_thua_va_da_hinh.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10f, 11f);
        float[] xY = point2D.getXY();
        System.out.println(point2D + "\n" + "thì mảng có tọa độ XY là : " + Arrays.toString(xY));
        Point3D point3D = new Point3D(1f, 2f, 3f);
        point3D.setZ(123);
        float[] xYZ = point3D.getXYZ();
        System.out.println(point2D + "\n" + "thì mảng có tọa độ XY là : " + Arrays.toString(xYZ));
    }

}
