package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileText {
    public static void main(String[] args) {
        String tt = "Chào cậu,Huỳnh Hà Diễm Uyên :v";
        try {
            FileWriter fw = new FileWriter("src/ss16_io_text_file/bai_tap/copy_file_text/data.csv.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(tt);
            bw.close();
            fw.close(); //tạo cái nào ra thì đóng luôn kẻo quên tránh rò dữ liệu
        } catch (Exception e) {
            System.out.println("tập tin không tồn tại ");
        }
    }
}
