package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.service;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.repository.IRepoProduct;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.repository.RepositoryProduct;

import java.util.ArrayList;

public class ProductService implements IProductService{
    private IRepoProduct products=new RepositoryProduct();

    @Override
    public ArrayList<ProductList> findAll() {
        return products.findAll();
    }

    @Override
    public void add(ProductList productList) {
        products.add(productList);
    }

    @Override
    public void edit(ProductList productList) {
        products.editProduct(productList);
    }

    @Override
    public void delete(String name) {
        products.deleteById(name);
    }

    @Override
    public void search(int id) {
        products.searchProduct(id);
    }

//    @Override
//    public void sort() {
//        products.sortProduct();
//    }
}
