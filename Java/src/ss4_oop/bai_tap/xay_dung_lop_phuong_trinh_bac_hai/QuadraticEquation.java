package ss4_oop.bai_tap.xay_dung_lop_phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double num1, double num2, double num3) {
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
        return root2;
    }
}
