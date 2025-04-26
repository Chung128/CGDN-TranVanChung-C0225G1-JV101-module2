package ss19_string_and_regex.bai_tap.validate_ten_lop_hoc;

public class Demo {
    public static void main(String[] args) {
        String name = "Tran Chung";
        String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*\\s[A-Z][a-z]*$";
        boolean check = name.matches(regex);
        System.out.println(check);
    }
}
