package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.Scanner;

public class ConsecutiveStringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự : ");
        String string=sc.nextLine();
        System.out.println(ConsecutiveString.consecutiveString(string));
    }
}
