package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.repository;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;

import java.util.ArrayList;

public interface IRepoProduct {
    ArrayList<ProductList> findAll();
    void add(ProductList productList);
    void edit(int id,double price,String name);

    void editProduct(int id);

    void deleteById(String name);
    void searchProduct(int id);
    void sort();
}
