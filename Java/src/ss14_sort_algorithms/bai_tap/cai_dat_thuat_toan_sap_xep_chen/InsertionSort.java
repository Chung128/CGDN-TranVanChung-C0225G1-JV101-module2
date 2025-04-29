package ss14_sort_algorithms.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void insert(int[] array) {
        int temp, x;
        for (int i = 0; i < array.length; i++) {  // đoạn array[0] đã được sắp xếp
            x = array[i];
            temp = i;
            while (temp > 0 && x < array[temp - 1]) {
                array[temp] = array[temp - 1]; //đổi chổ
                temp--;
            }
            array[temp] = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Mảng nhập vào là : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        insert(array);
        System.out.println("\n-----------------------" +
                "\nmảng sau sắp xếp là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
