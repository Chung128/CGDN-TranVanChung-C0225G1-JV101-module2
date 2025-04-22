package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.controller;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.service.ProductService;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.view.ViewProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);

    public static void DisplayMenu() {
        ProductService productService = new ProductService();
        do {
            System.out.println("------Quản lí sản phẩm------ \n"
                    + "1 . hiển thị danh sách sản phẩm \n"
                    + "2 . thêm sản phẩm \n"
                    + "3 . sửa sản phẩm  \n"
                    + "4 . xóa sản phẩm theo tên \n"
                    + "5 . tìm kiếm sản phẩm theo mã số \n"
                    + "6 . sắp xếp sẳn phẩm theo tên \n"
                    + "7 . thoát ra \n"
                    + "--------------------------"
            );
            System.out.println("Chọn chức năng : ");
            int chose = scanner.nextInt();
            if (chose >= 1 && chose <= 7) {
                switch (chose) {
                    case 1:
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<ProductList> productLists = productService.findAll();
                        ViewProduct.displayProduct(productLists);
                        break;
                    case 2:
                        ProductList productList = ViewProduct.inputProduct();
                        productService.add(productList);
                        System.out.println();
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<ProductList> product = productService.findAll();
                        ViewProduct.displayProduct(product);
                        break;
                    case 3:
// để tối nay e làm nốt phần này và sắp xếp ạ.em làm chưa kịp
                    case 4:
                        String name = ViewProduct.delete();
                        productService.delete(name);
                        break;
                    case 5:
                        int id = ViewProduct.search();
                        productService.search(id);
                    case 6:
                    case 7:
                        return;
                }
            } else {
                System.out.print("Nhập lại chức năng bạn muốn : ");
            }
        } while (true);
    }
}
