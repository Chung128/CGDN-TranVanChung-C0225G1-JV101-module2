package case_study_furama.repository;

import case_study_furama.model.Customer;
import case_study_furama.model.Employee;
import case_study_furama.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    private static String CUSTOMER_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\case_study_furama\\data\\customer.csv";
    private static boolean APPEND = true;
    private static boolean NOAPPEND = false;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(CUSTOMER_FILE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            LocalDate birthDate = LocalDate.parse(array[1], formatter);
            Customer customer = new Customer(array[0], birthDate, array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        List<Customer> customers = new ArrayList<>();
        ReadAndWriteFile.writeFileToCSV(CUSTOMER_FILE, customer.getInfotoCustomer(), APPEND);
        customers.add(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        List<Customer> list = findAll();
        for (Customer customer1 : list) {
            if (customer1.getIdCustomer().equalsIgnoreCase(customer.getIdCustomer())) {
                customer1.setName(customer.getName());
                customer1.setBirthDate(customer.getBirthDate());
                customer1.setGender(customer.getGender());
                customer1.setIDCard(customer.getIDCard());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setTypesOfCustomer(customer.getTypesOfCustomer());
                customer1.setAddress(customer.getAddress());
                break;
            } else {
                System.out.println("Employee number not found");
                break;
            }
        }
        for (Customer customers : list) {
            ReadAndWriteFile.writeFileToCSV(CUSTOMER_FILE, customers.getInfotoCustomer(), NOAPPEND);
        }
    }
}
