package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi bất kì: ");
        String string = scanner.nextLine();
        AscendingString ascendingString = new AscendingString();
        System.out.println(ascendingString.longestString(string));
    }
}
