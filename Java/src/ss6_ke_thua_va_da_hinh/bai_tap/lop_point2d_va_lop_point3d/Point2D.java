package ss6_ke_thua_va_da_hinh.bai_tap.lop_point2d_va_lop_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float number1, float number2) {
        this.x = number1;
        this.y = number2;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xY = {this.x, this.y};
        return xY;
    }

    @Override
    public String toString() {
        return "Point2D{" + "\n" +
                "x= " + x + "\n" +
                "y= " + y + "\n" +
                '}';
    }
}
