package ss6_ke_thua_va_da_hinh.bai_tap.lop_point_va_moveable_point;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
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
        return "Point{" +"\n"+
                "x= " + x +"\n"+
                "y= " + y +"\n"+
                "xY= " + Arrays.toString(getXY()) +"\n"+
                '}';
    }
}
