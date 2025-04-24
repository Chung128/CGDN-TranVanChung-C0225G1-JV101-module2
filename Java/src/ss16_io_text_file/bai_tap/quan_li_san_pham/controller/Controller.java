package ss16_io_text_file.bai_tap.quan_li_san_pham.controller;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;
import ss16_io_text_file.bai_tap.quan_li_san_pham.service.ServiceProduct;
import ss16_io_text_file.bai_tap.quan_li_san_pham.view.ViewProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);

    public static void DisplayMenu() {
        ServiceProduct serviceProduct = new ServiceProduct();
        do {
            System.out.println("------Quản lí sản phẩm------ \n"
                    + "1 . hiển thị danh sách sản phẩm \n"
                    + "2 . thêm sản phẩm \n"
                    + "3 . sửa sản phẩm theo mã số  \n"
                    + "4 . xóa sản phẩm theo mã số \n"
                    + "5 . tìm kiếm sản phẩm theo tên \n"
                    + "6 . sắp xếp sẳn phẩm theo giá \n"
                    + "7 . thoát ra \n"
                    + "--------------------------"
            );
            System.out.println("Chọn chức năng : ");
            int chose = scanner.nextInt();
            if (chose >= 1 && chose <= 7) {
                switch (chose) {
                    case 1:
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<Product> productLists = serviceProduct.findAll();
                        ViewProduct.displayProduct(productLists);
                        break;
                    case 2:
                        Product productList = ViewProduct.inputDataProduct();
                        serviceProduct.add(productList);
                        System.out.println();
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<Product> product = serviceProduct.findAll();
                        ViewProduct.displayProduct(product);
                        break;
                    case 3:
                        Product productList1 = ViewProduct.inputIdToEdit();
                        serviceProduct.edit(productList1);
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<Product> productLists1 = serviceProduct.findAll();
                        ViewProduct.displayProduct(productLists1);
                        break;
                    case 4:
                        int ids = ViewProduct.inputIdToDelete();
                        serviceProduct.delete(ids);
                        break;
                    case 5:
                        String name = ViewProduct.inputIdToSearch();
                        serviceProduct.search(name);
                        break;
                    case 6:
                        do {
                            ArrayList<Product> newList = serviceProduct.findAll();
                            System.out.print("bạn muốn sắp xếp tăng hay giảm : ");
                            int chose1 = scanner.nextInt();
                            if (chose1 == 1 || chose1 == 2 || chose1 == 3) {
                                switch (chose1) {
                                    case 1:
                                        System.out.println("sắp xếp tăng dần ");
                                        serviceProduct.sortAscending();
                                        ViewProduct.displayProduct(newList);

                                        break;
                                    case 2:
                                        System.out.println("sắp xếp giảm dần.");
                                        serviceProduct.sortDescending();
                                        ViewProduct.displayProduct(newList);
                                        break;
                                    case 3:
                                        return;
                                }
                            }
                        } while (true);
                    case 7:
                        return;
                }
            } else {
                System.out.print("Nhập lại chức năng bạn muốn : ");
            }
        } while (true);
    }
}
