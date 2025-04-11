package ss5_access_modifier.bai_tap_access_modifier;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(3);
        System.out.println("the circle is radius = " + circle.getRadius() + " and "
                + "the color is " + circle.getColor());
    }
}
