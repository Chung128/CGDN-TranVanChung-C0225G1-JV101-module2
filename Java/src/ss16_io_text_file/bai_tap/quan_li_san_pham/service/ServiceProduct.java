package ss16_io_text_file.bai_tap.quan_li_san_pham.service;


import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Employee;
import ss16_io_text_file.bai_tap.quan_li_san_pham.repository.IRepoProduct;
import ss16_io_text_file.bai_tap.quan_li_san_pham.repository.RepoProduct;

import java.util.ArrayList;

public class ServiceProduct implements IServiceProduct {
    private IRepoProduct products = new RepoProduct();

    @Override
    public ArrayList<Employee> findAll() {
        return products.findAll();
    }

    @Override
    public void add(Employee productList) {
        products.addProduct(productList);
    }

    @Override
    public void edit(Employee productList) {
        products.editProduct(productList);
    }

    @Override
    public void delete(int id) {
        products.deleteProduct(id);
    }

    @Override
    public void search(String name) {
        products.searchProduct(name);
    }

    @Override
    public void sortAscending() {
        products.sortProductAscending();
    }

    @Override
    public void sortDescending() {
        products.sortProductDescending();
    }
}
