package ss19_string_and_regex.thuc_hanh.danh_sach_bai_hat;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.nhaccuatui.com/bai-hat/cach-mang-moi.html");
            //mở stream và đưa nó vào inputStreamReader
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            //đóng scanner
            scanner.close();
            //xóa tất cả các new line trong content lấy được
            content=content.replace("\n+","");
            //lọc nội dung content lấy được và in ra danh sách tên bài hát
            Pattern pattern=Pattern.compile("name_song\\\">(.*?)<\\/a>");
            Matcher matcher=pattern.matcher(content);
            System.out.println("Danh sách bài hát tìm thấy : ");
            int index=1;
            while (matcher.find()){
                System.out.println(index++ +" : "+matcher.group(1));
            };
        } catch (Exception e) {
            System.out.println("đường dẫn bị lỗi.");
        }
    }
}
