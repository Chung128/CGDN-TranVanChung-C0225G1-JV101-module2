package ss17_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.File;
import java.io.IOException;

public class Main {
    private static String FILE_SOURCE = "D:\\codegym\\module2\\module2\\Java\\src\\ss17_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\source_file";
    private static String FILE_TARGET = "D:\\codegym\\module2\\module2\\Java\\src\\ss17_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\target_file";

    public static void main(String[] args) {
        File sourceFile = new File(FILE_SOURCE);
        File targetFile = new File(FILE_TARGET);
        try {
            CopyFile.copyFileUsingStream(sourceFile, targetFile);
        } catch (IOException e) {
            System.out.println("Không thể sao chép file.");
            System.out.println(e.getMessage());
        }
    }
}
