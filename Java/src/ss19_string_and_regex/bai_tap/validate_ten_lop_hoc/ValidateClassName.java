package ss19_string_and_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class ValidateClassName {
    private static final String regex = "^[ACP]\\d{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên lớp thử: ");
        String className = scanner.nextLine();
        if (className.matches(regex)) {
            System.out.println("tên lớp hợp lệ.");
        } else {
            System.out.println("tên lớp không hợp lệ.");
        }
    }
}
