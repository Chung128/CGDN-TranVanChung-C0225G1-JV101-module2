package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

public class ConsecutiveString {
    public static String consecutiveString(String string) {
        String string1 = "" + string.charAt(0);
        String string2 = "";

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) >= string.charAt(i - 1)) {
                string1 += string.charAt(i);
            } else {
                if (string1.length() > string2.length()) {
                    string2 = string1;
                }
                string1 = "" + string.charAt(i);
            }
        }

        if (string1.length() > string2.length()) {
            string2 = string1;
        }

        return string2;
    }
}
