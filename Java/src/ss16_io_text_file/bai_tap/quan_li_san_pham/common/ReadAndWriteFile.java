package ss16_io_text_file.bai_tap.quan_li_san_pham.common;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    //phương thức ghi
    public static void writeFile(String fileName, String line, boolean append) {
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, append);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file : ");
        }
    }

    //phương thức đọc
    public static List<Product> readFile(String fileName) {
        List<Product> stringList = new ArrayList<>();
        File file = new File(fileName);
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            while (true) {
                String line = br.readLine();
                if (line == null) {   //dừng lại khi gặp trống
                    break;
                }
                String[] infor = line.split(",");
                int id=Integer.parseInt(infor[0].trim());   //dùng trim để bỏ khoảng trắng 2 đầu tránh lỗi
                double price=Double.parseDouble(infor[1].trim());
                String name=infor[2].trim();
                stringList.add(new Product(id, name, price));
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file .");
        }
        return stringList;
    }
}
