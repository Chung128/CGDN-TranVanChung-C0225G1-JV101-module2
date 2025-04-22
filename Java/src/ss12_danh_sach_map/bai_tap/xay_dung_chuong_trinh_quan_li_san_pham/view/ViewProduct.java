package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.view;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.controller.ProductManager;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewProduct {
    private static Scanner scanner= new Scanner(System.in);
    public static void displayProduct(ArrayList<ProductList> productLists){
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i)!=null){
                System.out.println(productLists.get(i));
            }else {
                break;
            }
        }
    }
    public static ProductList inputProduct(){
        System.out.print("Nhập mã hàng ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá bán ");
        double price= Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên hàng ");
        String name=scanner.nextLine();
        ProductList productList=new ProductList(id,price,name);
        return productList;
    }

    public static String delete(){
        System.out.println("Nhập tên sản phẩm cần xóa");
        String name =scanner.nextLine();
        return name;
    }
    public static ProductList editProduct(){
        System.out.print("Nhập giá bán ");
        double price= Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên hàng ");
        String name=scanner.nextLine();
        ProductList productList=new ProductList(price,name);
        return productList;
    }
    public static int search(){
        System.out.println("Nhập mã sản phẩm muốn tìm ");
        int id=Integer.parseInt(scanner.nextLine());
        return id;
    }
}
