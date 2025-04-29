package ss14_sort_algorithms.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng: ");
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+ " : ");
            array[i]=sc.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("Bắt đầu sắp xếp: ");
        bubbleSortByStep(array);
    }
    public  static void bubbleSortByStep(int[] array){
        boolean needNextPass=true;
        for (int i = 1; i <array.length&&needNextPass ; i++) {
            needNextPass=false;
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    needNextPass=true;
                }
            }
            if (needNextPass==false){
                System.out.println("Mảng có thể được sắp xếp và không cần lần duyệt tiếp theo");
                break;
            }
            System.out.print("Array sau khi "+i+ " sắp xếp.");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+ " ");
            }
            System.out.println();
        }
    }
}
