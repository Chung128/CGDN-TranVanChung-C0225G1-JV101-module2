package ss16_io_text_file.bai_tap.quan_li_san_pham.view;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewProduct {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayProduct(ArrayList<Product> productLists) {
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i) != null) {
                System.out.println(productLists.get(i));
            } else {
                break;
            }
        }
    }

    public static Product inputDataProduct() {
        System.out.print("Nhập mã hàng ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá bán ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tên hàng ");
        String name = scanner.nextLine();
        Product productList = new Product(id, name, price);
        return productList;
    }

    public static int inputIdToDelete() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static Product inputIdToEdit() {
        System.out.println("Nhập mã sản phẩm ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá bán ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tên hàng ");
        String name = scanner.nextLine();
        Product productList = new Product(id, name, price);
        return productList;
    }

    public static String inputIdToSearch() {
        System.out.println("Nhập tên sản phẩm muốn tìm ");
        String name = scanner.nextLine();
        return name;
    }
}
