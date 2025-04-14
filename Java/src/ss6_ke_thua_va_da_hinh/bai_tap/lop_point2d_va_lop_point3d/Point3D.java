package ss6_ke_thua_va_da_hinh.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xYZ = {super.getX(), super.getY(), getZ()};
        return xYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" + "\n" +
                "x= " + getX() + "\n" +
                "y= " + getY() + "\n" +
                "z=" + z + "\n" +
                '}';
    }
}
