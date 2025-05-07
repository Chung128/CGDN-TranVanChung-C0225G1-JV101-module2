package case_study_furama.service;

import case_study_furama.model.Customer;
import case_study_furama.repository.CustomerRepo;
import case_study_furama.repository.ICustomerRepo;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepo customerRepo=new CustomerRepo();
    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepo.addNewCustomer(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerRepo.editCustomer(customer);
    }
}
