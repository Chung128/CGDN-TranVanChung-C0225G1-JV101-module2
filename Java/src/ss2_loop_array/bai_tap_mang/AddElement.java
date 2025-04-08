package ss2_loop_array.bai_tap_mang;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("enter index");
        int index;
        while (true) {
            index = sc.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("re-enter index");
            } else {
                break;
            }
        }
        System.out.println("enter add number");
        int number = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[i - 1];
            }
            System.out.println(newArr[i]);
        }
    }
}
