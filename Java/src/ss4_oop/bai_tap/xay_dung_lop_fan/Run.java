package ss4_oop.bai_tap.xay_dung_lop_fan;

public class Run {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(FanClass.FAST);
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1);
        FanClass fan2 = new FanClass();
        fan2.setSpeed(FanClass.MEDIUM);
        fan2.setRadius(5);
        fan2.setStatus(false);
        fan2.setColor("blue");
        System.out.println(fan2);
    }
}
