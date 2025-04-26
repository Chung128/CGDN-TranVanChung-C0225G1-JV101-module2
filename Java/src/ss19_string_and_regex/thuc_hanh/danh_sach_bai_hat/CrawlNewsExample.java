package ss19_string_and_regex.thuc_hanh.danh_sach_bai_hat;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            scanner.close();
            content=content.replaceAll("\n","");
            Pattern pattern=Pattern.compile("<h3 class=\\\"title-news\\\"><a href=\\\"(.*?)\\\" title=\\\"(.*?)\\\">");
            Matcher matcher=pattern.matcher(content);
            System.out.println("Danh sách bản tin tìm thấy: ");
            int index=1;
            while (matcher.find()){
                System.out.println(index+++" : "+matcher.group());
            }
        } catch (Exception e) {
            System.out.println("đường dẫn bị lỗi.");
        }
    }
}
