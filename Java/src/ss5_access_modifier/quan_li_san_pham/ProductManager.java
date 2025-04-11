package ss5_access_modifier.quan_li_san_pham;

import ss5_access_modifier.bai_tap_crud.StudentsList;

import java.util.Scanner;

public class ProductManager {
    public static ProductList[] product = new ProductList[10];

    static {
        product[0] = new ProductList(12, "Bạch kim", 100000);
        product[1] = new ProductList(23, "Vàng", 10000);
        product[2] = new ProductList(34, "Bạc", 1000);
    }

    Scanner scanner = new Scanner(System.in);

    public void display() {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.println(product[i]);
            }
        }
    }

    public void add() {
        System.out.print("Nhập mã sản phẩm: ");
        int number = scanner.nextInt();
        System.out.print("Nhập giá sản phẩm : ");
        double price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) {
                product[i] = new ProductList(number, name, price);
                break;
            }
        }
    }

    public void edit() {
        System.out.print("Nhập sản phẩm cần sửa : ");
        int index = scanner.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (index == i) {
                System.out.print("Nhập mã sản phẩm : ");
                int number = scanner.nextInt();
                System.out.print("Nhập giá sản phẩm : ");
                int price = scanner.nextInt();
                System.out.print("Nhập tên sản phẩm : ");
                scanner.nextLine();
                String name = scanner.nextLine();
                product[i] = new ProductList(number, name, price);
                break;
            }
        }
    }

    public void delete() {
        int index = scanner.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (index == i) {
                for (int j = i; j < product.length - 1; j++) {
                    product[j] = product[j + 1];
                }
                break;
            }
        }
    }

    public void search() {
        System.out.print("Nhập mã sản phẩm muốn tìm : ");
        int number = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].number == number) {
                System.out.println(product[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy mã vừa nhập vào ");
        }
    }
}



