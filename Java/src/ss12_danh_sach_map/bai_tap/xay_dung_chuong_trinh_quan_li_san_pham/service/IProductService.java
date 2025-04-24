package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.service;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<ProductList> findAll();
    void add(ProductList productList);
    void edit(ProductList productList);
    void delete(String name);
    void search(int id);
}
