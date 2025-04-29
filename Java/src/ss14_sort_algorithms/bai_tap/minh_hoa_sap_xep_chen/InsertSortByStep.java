package ss14_sort_algorithms.bai_tap.minh_hoa_sap_xep_chen;

import java.util.Scanner;

public class InsertSortByStep {
    public static void insert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int temp = i;
            while (temp > 0 && key < array[temp - 1]) {
                array[temp] = array[temp - 1];
                temp--;
            }
            array[temp] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] array;
        try {
            System.out.print("Nhập kích thước mảng: ");
            size = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.print("Nhập sai định dạng,nhập lại số nguyên.");
            return;
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
                array[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng,nhập lại số nguyên.");
                return;
            }
        }
        System.out.print("Mảng nhập  vào là : ");
        insert(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
