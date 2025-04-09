package ss2_loop_array.bai_tap_mang.tinh_tong_duong_cheo;

import java.util.Scanner;

public class SumInDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        while (true) {
            System.out.print("enter a rows ");
            rows = scanner.nextInt();
            System.out.print("enter a cols ");
            cols = scanner.nextInt();
            if (cols != rows || rows <= 0 || cols <= 0) {
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
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal is : " + sum);
    }
}



