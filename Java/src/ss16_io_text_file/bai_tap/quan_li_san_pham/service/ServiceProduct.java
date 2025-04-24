package ss16_io_text_file.bai_tap.quan_li_san_pham.service;


import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;
import ss16_io_text_file.bai_tap.quan_li_san_pham.repository.IRepoProduct;
import ss16_io_text_file.bai_tap.quan_li_san_pham.repository.RepoProduct;

import java.util.ArrayList;

public class ServiceProduct implements IServiceProduct {
    private IRepoProduct products=new RepoProduct();

    @Override
    public ArrayList<Product> findAll() {
        return products.findAll();
    }

    @Override
    public void add(Product productList) {
        products.addProduct(productList);
    }

    @Override
    public void edit(Product productList) {
        products.editProduct(productList);
    }

    @Override
    public void delete(int id) {
        products.deleteProduct(id);
    }

    @Override
    public void search(int id) {
        products.searchProduct(id);
    }
}
