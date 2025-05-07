package case_study_furama.controller;

import case_study_furama.model.Customer;
import case_study_furama.service.CustomerService;
import case_study_furama.view.ViewCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    public static void displayListCustomers() {
        CustomerService customerService = new CustomerService();
        System.out.println("Display list customer.");
        List<Customer> customers = customerService.findAll();
        ViewCustomer.displayEmployee((ArrayList<Customer>) customers);
    }

    public static void addNewCustomer() {
        CustomerService customerService = new CustomerService();
        System.out.println("add new customer.");
        Customer customer = ViewCustomer.inputDataCustomer();
        customerService.add(customer);
    }

    public static void editCustomer() {
        CustomerService customerService = new CustomerService();
        System.out.println("update customer.");
        Customer customer = ViewCustomer.inputDataCustomer();
        customerService.add(customer);
    }
}
