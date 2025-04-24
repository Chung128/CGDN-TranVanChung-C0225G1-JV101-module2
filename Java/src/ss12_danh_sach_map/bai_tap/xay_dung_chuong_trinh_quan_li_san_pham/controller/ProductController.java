package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.controller;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.service.ProductService;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.view.ViewProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductController {
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
                        ProductList productList1 = ViewProduct.editProduct();
                        productService.edit(productList1);
                        System.out.println("Danh sách sản phẩm : ");
                        ArrayList<ProductList> productLists1 = productService.findAll();
                        ViewProduct.displayProduct(productLists1);
                        break;
                    case 4:
                        String name = ViewProduct.delete();
                        productService.delete(name);
                        break;
                    case 5:
                        int id = ViewProduct.search();
                        productService.search(id);
                        break;
                    case 6:
                        ArrayList<ProductList> newList = productService.findAll();
                        System.out.print("bạn muốn sắp xếp tăng hay giảm : ");
                        int chose1 = scanner.nextInt();
                        if (chose1 == 1 || chose1 == 2) {
                            switch (chose1) {
                                case 1:
                                    Collections.sort(newList, new Comparator<ProductList>() {
                                        @Override
                                        public int compare(ProductList sp1, ProductList sp2) {
                                            //return Double.compare(sp1.getPrice(), sp2.getPrice());
                                            return (int) (sp1.getPrice() - sp2.getPrice());
                                        }
                                    });
                                    ViewProduct.displayProduct(newList);

                                    break;
                                case 2:
                                    Collections.sort(newList, new Comparator<ProductList>() {
                                        @Override
                                        public int compare(ProductList sp1, ProductList sp2) {
                                            return Double.compare(sp2.getPrice(), sp1.getPrice());
                                        }
                                    });
                                    ViewProduct.displayProduct(newList);
                                    break;
                            }
                        }
                        break;
                    case 7:
                        return;
                }
            } else {
                System.out.print("Nhập lại chức năng bạn muốn : ");
            }
        } while (true);
    }
}
