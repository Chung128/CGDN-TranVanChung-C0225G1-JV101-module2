package ss5_access_modifier.bai_tap_crud;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRUD manager = new CRUD();
        do {
            System.out.println("---------Quản lí sinh viên--------\n" +
                    "1.Hiển thị danh sách sinh viên\n" +
                    "2.Thêm mới sinh viên \n" +
                    "3.Xóa sinh viên \n" +
                    "4.Kết thúc chương trình \n" +
                    "----------------------------------");
            int number;
            while (true) {
                System.out.print("Chọn chức năng :");
                number = scanner.nextInt();
                if (number < 1 || number > 4) {
                    System.out.print("Nhập lại chức năng bạn muốn!");
                } else {
                    break;
                }
            }
            switch (number) {
                case 1:
                    System.out.println("Danh sách sinh viên :");
                    manager.display();
                    break;
                case 2:
                    System.out.println("Thêm mới sinh viên :");
                    manager.add();
                    manager.display();
                    break;
                case 3:
                    System.out.println("Chọn sinh viên cần xóa :");
                    manager.delete();
                    manager.display();
                    break;
                case 4:
                    System.out.println("Chương trình đã kết thúc");
                    return;
            }
        } while (true);
    }
}
