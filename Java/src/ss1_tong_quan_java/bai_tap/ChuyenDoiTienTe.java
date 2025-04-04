package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int VND = 23000;
        int USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD muốn qui đổi");
        USD = scanner.nextInt();
        int quidoi = USD * VND;
        System.out.println(USD + " USD bằng" + quidoi + " VND");
    }
}
