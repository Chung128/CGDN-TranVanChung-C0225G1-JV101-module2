package ss16_io_text_file.bai_tap.quan_li_san_pham.service;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;

import java.util.ArrayList;

public interface IServiceProduct {
    ArrayList<Product> findAll();
    void add(Product productList);
    void edit(Product productList);
    void delete(int id);
    void search(String name);
    void sortAscending();
    void sortDescending();
}
