package ss4_oop.bai_tap.xay_dung_lop_fan;

public class FanClass {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public FanClass() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed == SLOW || newSpeed == MEDIUM || newSpeed == FAST) {
            this.speed = newSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean onOff) {
        this.status = onOff;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (this.status) {
            return "FanClass {" +
                    "speed=" + speed +
                    ", on=" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "FanClass {" +
                    "Fan is off ,"+
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
