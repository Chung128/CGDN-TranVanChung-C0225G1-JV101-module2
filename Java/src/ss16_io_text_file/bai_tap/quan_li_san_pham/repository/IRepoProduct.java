package ss16_io_text_file.bai_tap.quan_li_san_pham.repository;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Employee;

import java.util.ArrayList;

public interface IRepoProduct {
    ArrayList<Employee> findAll();
    void addProduct(Employee product);
    void editProduct(Employee product);
    void deleteProduct(int id);
    void searchProduct(String name);
    void sortProductAscending();
    void sortProductDescending();
}
