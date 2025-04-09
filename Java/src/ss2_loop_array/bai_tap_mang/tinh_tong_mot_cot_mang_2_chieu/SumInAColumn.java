package ss2_loop_array.bai_tap_mang.tinh_tong_mot_cot_mang_2_chieu;

import java.util.Scanner;

public class SumInAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        while (true) {
            System.out.print("enter a rows ");
            rows = scanner.nextInt();
            System.out.print("enter a cols ");
            cols = scanner.nextInt();
            if (rows <= 0 || cols <= 0) {
                System.out.println("re-enter rows and cols");
            } else {
                break;
            }
        }
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            arr[i] = new int[cols];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("enter the th element " + (i + 1) + (j + 1) + " :");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("enter the cols");
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number < 0 || number > rows) {
                System.out.println("re-enter a number.");
            } else {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the " + (number) + "th cols is : " + sum);
    }
}
