package ss5_access_modifier.quan_li_san_pham;

import ss5_access_modifier.bai_tap_crud.CRUD;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        do {
            System.out.println("---------Quản lí sản phẩm--------\n" +
                    "1.Hiển thị danh sách sản phẩm\n" +
                    "2.Thêm mới sản phẩm \n" +
                    "3.sửa sản phẩm \n" +
                    "4.Xóa sinh viên \n" +
                    "5.Tìm kiếm sản phẩm \n" +
                    "6.Kết thúc chương trình \n" +
                    "---------------------------------");
            int number;
            while (true) {
                System.out.print("Chọn chức năng :");
                number = scanner.nextInt();
                if (number < 1 || number > 6) {
                    System.out.print("Nhập lại chức năng bạn muốn!");
                } else {
                    break;
                }
            }
            switch (number) {
                case 1:
                    System.out.println("Danh sách sản phẩm :");
                    manager.display();
                    break;
                case 2:
                    System.out.println("Thêm mới sản phẩm : ");
                    manager.add();
                    manager.display();
                    break;
                case 3:
                    System.out.println("Sửa sản phẩm : ");
                    manager.edit();
                    manager.display();
                    break;
                case 4:
                    System.out.println("Chọn sản phẩm cần xóa :");
                    manager.delete();
                    manager.display();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm : ");
                    manager.search();
                    break;
                case 6:
                    System.out.println("Chương trình đã kết thúc");
                    return;
            }
        } while (true);
    }
}
