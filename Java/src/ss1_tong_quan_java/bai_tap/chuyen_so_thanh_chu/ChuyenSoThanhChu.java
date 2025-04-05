package ss1_tong_quan_java.bai_tap.chuyen_so_thanh_chu;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc từ 0 - 999 :");
        int soX;
        while (true) {
            soX = scanner.nextInt();
            if (soX <= 999 && soX >= 0) {
                break;
            } else {
                System.out.println("nhập lại số phù hợp");
            }
        }
        if (soX == 0) {
            System.out.println("Số cần đọc là : Không");
        }
        String hangTram = "";
        String hangChuc = "";
        String hangDonVi = "";
        int tram = (int) Math.floor(soX / 100);
        int chuc = (int) Math.floor((soX % 100) / 10);
        int donVi = soX % 10;
        if (tram > 0) {
            switch (tram) {
                case 1:
                    hangTram = "Một trăm ";
                    break;
                case 2:
                    hangTram = "Hai trăm ";
                    break;
                case 3:
                    hangTram = "Ba trăm ";
                    break;
                case 4:
                    hangTram = "Bốn trăm ";
                    break;
                case 5:
                    hangTram = "Năm trăm ";
                    break;
                case 6:
                    hangTram = "Sáu trăm ";
                    break;
                case 7:
                    hangTram = "Bảy trăm ";
                    break;
                case 8:
                    hangTram = "Tám trăm ";
                    break;
                case 9:
                    hangTram = "Chín trăm ";
                    break;
            }
        }
        if (chuc > 1) {
            switch (chuc) {
                case 2:
                    hangChuc = "hai mươi ";
                    break;
                case 3:
                    hangChuc = "ba mươi ";
                    break;
                case 4:
                    hangChuc = "bốn mươi ";
                    break;
                case 5:
                    hangChuc = "năm mươi ";
                    break;
                case 6:
                    hangChuc = "sáu mươi ";
                    break;
                case 7:
                    hangChuc = "bảy mươi ";
                    break;
                case 8:
                    hangChuc = "tám mươi ";
                    break;
                case 9:
                    hangChuc = "chín mươi ";
                    break;
            }
        } else if (chuc == 1) {
            hangChuc = "mười ";
        }
        if (donVi >= 0) {
            switch (donVi) {
                case 0:
                    hangDonVi = "";
                    break;
                case 1:
                    if (chuc == 0 || chuc == 1) {
                        hangDonVi = "một";
                    } else {
                        hangDonVi = "mốt";
                    }
                    break;
                case 2:
                    hangDonVi = "hai";
                    break;
                case 3:
                    hangDonVi = "ba";
                    break;
                case 4:
                    hangDonVi = "bốn";
                    break;
                case 5:
                    hangDonVi = "năm";
                    break;
                case 6:
                    hangDonVi = "sáu";
                    break;
                case 7:
                    hangDonVi = "bảy";
                    break;
                case 8:
                    hangDonVi = "tám";
                    break;
                case 9:
                    hangDonVi = "chín";
                    break;
            }
        }
        System.out.println(hangTram + hangChuc + hangDonVi);
    }
}

