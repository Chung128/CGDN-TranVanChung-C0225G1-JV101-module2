package ss16_io_text_file.bai_tap.quan_li_san_pham.service;

import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Employee;

import java.util.ArrayList;

public interface IServiceProduct {
    ArrayList<Employee> findAll();
    void add(Employee productList);
    void edit(Employee productList);
    void delete(int id);
    void search(String name);
    void sortAscending();
    void sortDescending();
}
