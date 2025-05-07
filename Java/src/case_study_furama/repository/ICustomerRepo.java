package case_study_furama.repository;

import case_study_furama.model.Customer;
import case_study_furama.model.Employee;

import java.util.List;

public interface ICustomerRepo extends Repository{
    List<Customer> findAll();
    void addNewCustomer(Customer customer);
    void editCustomer(Customer customer);
}
