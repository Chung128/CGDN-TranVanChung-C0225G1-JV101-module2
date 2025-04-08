package ss2_loop_array.bai_tap_mang;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();       //khai báo mảng có n phần tử nhập từ bàn phím
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("nhập phần tử thứ " + (i + 1));
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("nhập phần tử cần xóa");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                found = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                int[] arr1 = new int[arr.length - 1];
                for (int k = 0; k < arr1.length; k++) {
                    arr1[k] = arr[k];
                    System.out.print(arr1[k]);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm " + x + " trong mảng");
        }
    }
}
