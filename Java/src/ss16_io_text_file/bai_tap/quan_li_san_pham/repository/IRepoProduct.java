package ss16_io_text_file.bai_tap.quan_li_san_pham.repository;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;

import java.util.ArrayList;

public interface IRepoProduct {
    ArrayList<Product> findAll();
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(int id);
    void searchProduct(String name);
    void sortProductAscending();
    void sortProductDescending();
}
