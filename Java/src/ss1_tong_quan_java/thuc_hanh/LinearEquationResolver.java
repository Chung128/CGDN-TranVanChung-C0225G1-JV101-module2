package ss1_tong_quan_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        double number1;
        double number2;
        double number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a= :");
        number1 = scanner.nextDouble();
        System.out.println("b= :");
        number2 = scanner.nextDouble();
        System.out.println("c= :");
        number3 = scanner.nextDouble();
        if (number1 != 0) {
            double answer = (number3 - number2) / number1;
            System.out.printf("Equation pas with x=%.3f\n", answer);
        } else {
            if (number2 == number3) {
                System.out.println("the solution is all x");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
