package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int soX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc :");
        soX = scanner.nextInt();
        int tram = (int) Math.floor(soX / 100);
        int chuc = (int) Math.floor((soX % 100) / 10);
        int donVi = soX % 10;
        System.out.println("Số nhập vào là :" + tram + " trăm " + chuc + " mươi " + donVi);
    }
}
