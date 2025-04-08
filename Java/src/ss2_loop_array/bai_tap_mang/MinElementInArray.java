package ss2_loop_array.bai_tap_mang;

import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the th elements");
        int sizeArr;
        while (true) {
            sizeArr = scanner.nextInt();
            if (sizeArr < 0) {
                System.out.println("re-enter elements.");
            } else {
                break;
            }
        }
        int[] arr = new int[sizeArr];
        System.out.println("enter " + sizeArr + " elements in array");
        for (int i = 0; i < sizeArr; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("the min value is :" + min);
    }
}
