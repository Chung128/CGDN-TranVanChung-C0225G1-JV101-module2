package case_study_furama.service;

import case_study_furama.model.Customer;
import java.util.List;

public interface ICustomerService extends Service{
    List<Customer> findAll();
    void add(Customer employee);
    void edit(Customer employee);
}
