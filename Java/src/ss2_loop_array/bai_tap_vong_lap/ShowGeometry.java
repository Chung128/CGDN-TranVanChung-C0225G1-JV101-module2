package ss2_loop_array.bai_tap_vong_lap;

import java.util.Scanner;

public class ShowGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh ngang");
        int width = scanner.nextInt();
        System.out.println("nhập cạnh dọc");
        int height = scanner.nextInt();
        System.out.println("In dấu sao tăng dần");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("In dấu sao giảm dần");
        for (int i = 0; i < width; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("In tam giác cân");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int e = 1; e <= 2 * i - 1; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("In hình chữ nhật");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

