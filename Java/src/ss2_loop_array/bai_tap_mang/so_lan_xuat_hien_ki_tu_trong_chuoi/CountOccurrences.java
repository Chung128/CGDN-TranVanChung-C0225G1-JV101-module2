package ss2_loop_array.bai_tap_mang.so_lan_xuat_hien_ki_tu_trong_chuoi;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "viet nam vo dich";
        System.out.println("Enter char");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
