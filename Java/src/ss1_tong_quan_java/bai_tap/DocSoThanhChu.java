package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        double soX;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số cần đọc :");
        soX=scanner.nextDouble();
        double tram=Math.floor(soX/100);
        double chuc=Math.floor((soX%100)/10);
    }
}
