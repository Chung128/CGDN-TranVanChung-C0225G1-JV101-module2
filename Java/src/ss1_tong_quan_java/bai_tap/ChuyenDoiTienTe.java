package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
//        int USD;
//        double VND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD muốn qui đổi");
       int USD = scanner.nextInt();
        System.out.println("Nhập số tiền VND muốn qui đổi");
        double VND = scanner.nextInt();
        int quyDoi = USD * 23000;
        double quiDoi1 = VND / 23000;
        String lamTron = String.format("%.5f", quiDoi1);
        System.out.println(USD + " USD bằng" + quyDoi + " VND");
        System.out.println(VND + " VND bằng" + lamTron + " USD");
    }
}
