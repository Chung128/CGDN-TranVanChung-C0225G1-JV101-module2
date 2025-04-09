package ss2_loop_array.bai_tap_mang;

import java.util.Scanner;

public class MaxElementInTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows;
        System.out.println("enter the cols");
        int cols;
        while (true) {
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            if (rows < 0 || cols < 0) {
                System.out.println("re-enter the rows and cols");
            } else {
                break;
            }
        }
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            arr[i] = new int[cols];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
//        int[][] arr = {
//                {1, 2, 0, 2, 3},
//                {2, 4, 0, 4, 6},
//                {2, 3, 5, 7, 9, 3},
//        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("the max value is : " + max);
    }
}
