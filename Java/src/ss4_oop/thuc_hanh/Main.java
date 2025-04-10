package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter of the rectangle is : "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle is : "+rectangle.getArea());
    }
}
