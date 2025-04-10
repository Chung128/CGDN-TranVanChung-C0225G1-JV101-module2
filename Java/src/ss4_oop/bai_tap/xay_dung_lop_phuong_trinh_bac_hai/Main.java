package ss4_oop.bai_tap.xay_dung_lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        double a = scanner.nextDouble();
        System.out.print("enter b: ");
        double b = scanner.nextDouble();
        System.out.print("enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() < 0) {
            System.out.println("Unsolved equation.");
        }
        if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has the solution : " + (-equation.getB() / (2 * equation.getA())));
        }
        if (equation.getDiscriminant() > 0) {
            System.out.println("The equation has the solution : " + equation.getRoot1() + " and " + equation.getRoot2());
        }
    }
}
