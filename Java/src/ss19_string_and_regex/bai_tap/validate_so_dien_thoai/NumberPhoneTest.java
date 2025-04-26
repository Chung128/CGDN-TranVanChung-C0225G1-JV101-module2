package ss19_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class NumberPhoneTest {
    public static void main(String[] args) {
        NumberPhone number=new NumberPhone();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập vào sdt theo định dạng (xx)-(0xxxxxxxxx): ");
        String numberPhone=scanner.nextLine();
        boolean isvalidate=number.validate(numberPhone);
        if (isvalidate){
            System.out.println("Đây là 1 số điện thoại.");
        }else {
            System.out.println("Đây không phải số điện thoại.");
        }
    }
}
