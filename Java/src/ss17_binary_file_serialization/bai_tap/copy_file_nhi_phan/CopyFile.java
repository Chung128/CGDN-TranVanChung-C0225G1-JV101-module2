package ss17_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class CopyFile {
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println("Tập tin nguồn không tồn tại.");
        } catch (IOException e) {
            System.out.println("tập tin đích đã tồn tại.");
        } finally {
            is.close();
            os.close();
        }
    }
}
