package ss2_loop_array.thuc_hanh_mang.count_students_pass;

import java.util.Scanner;

public class CountStudentsPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size.");
        int size;
        while (true) {
            size = scanner.nextInt();
            if (size < 0 || size > 10) {
                System.out.println("re-enter a size.");
            } else {
                break;
            }
        }
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter a score for student : " + (i + 1));
            arr[i] = scanner.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 6) {
                count++;
            }
        }
        System.out.println("The number of student passing the exam is : " + count);
    }
}
