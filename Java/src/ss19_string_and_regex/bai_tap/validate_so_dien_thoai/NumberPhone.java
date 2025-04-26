package ss19_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String regex= "^[0-9]{2}-0[0-9]{9}$";
    private static Pattern pattern;
    private static Matcher matcher;
    public NumberPhone(){
        pattern=Pattern.compile(regex);
    }

    public boolean validate(String number) {
        matcher=pattern.matcher(number);
        return matcher.matches();
    }
}
