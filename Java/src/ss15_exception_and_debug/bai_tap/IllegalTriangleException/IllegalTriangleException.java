package ss15_exception_and_debug.bai_tap.IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edge1;
        double edge2;
        double edge3;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the first edge : ");
                edge1 = scanner.nextDouble();
                System.out.println("Enter the second edge : ");
                edge2 = scanner.nextDouble();
                System.out.println("Enter the third edge : ");
                edge3 = scanner.nextDouble();
                checkTriangle(edge1, edge2, edge3);
                flag = false;
                System.out.println("đây là 1 tam giác");
                break;
            } catch (TriangleException e) {
                System.out.println("Nhập cạnh chưa đúng ." + e.getMessage());
            }
        }
    }

    public static boolean checkTriangle(double edge1, double edge2, double edge3) throws TriangleException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            throw new TriangleException("các cạnh không được là số âm .");
        } else if (edge1 >= edge2 + edge3 || edge2 >= edge1 + edge3 || edge3 >= edge1 + edge2) {
            throw new TriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại.");
        }
        return true;
    }
}
