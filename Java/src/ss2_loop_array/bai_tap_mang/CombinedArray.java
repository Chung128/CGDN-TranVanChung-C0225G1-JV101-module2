package ss2_loop_array.bai_tap_mang;

import java.util.Scanner;

public class CombinedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element array 1");
        int sizeArr1;
        System.out.println("enter element array 2");
            int sizeArr2;
        while (true) {
            sizeArr1 = sc.nextInt();
            sizeArr2 = sc.nextInt();
            if (sizeArr1 < 0 || sizeArr2 < 0) {
                System.out.println("re-enter element");
            } else {
                break;
            }
        }
        int[] arr1 = new int[sizeArr1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[sizeArr2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
//        int length1 = 3;
//        int length2 = 4;
//        int[] arr1 = {3, 4, 6};
//        int[] arr2 = {5, 7, 9, 8};
        int[] arr3 = new int[sizeArr1 + sizeArr2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[sizeArr1 + i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
