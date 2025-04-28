package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

public class AscendingString {
    public static String longestString(String string) {
        String longest = "";

        for (int i = 0; i < string.length(); i++) {
            String current = "" + string.charAt(i);

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > current.charAt(current.length() - 1)) {
                    current += string.charAt(j);
                }
            }

            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        return longest;
    }
}