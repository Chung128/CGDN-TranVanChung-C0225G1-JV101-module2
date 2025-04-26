package ss19_string_and_regex.bai_tap.validate_ten_lop_hoc;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    // không chứa kí tự đặc biệt
    // bắt đầu bằng A C P
    //tiếp theo là 4 số
    // kết thúc bằng G H I K
    private static final String REGEX="^[ACP]\\d{4}[GIHK]$";
    public ClassNameExample(){
    }
    public boolean validate(String className){
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher=pattern.matcher(className);
        return matcher.matches();
    }
}
