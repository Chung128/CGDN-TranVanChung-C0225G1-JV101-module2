package case_study_furama.repository;

import case_study_furama.model.Employee;
import case_study_furama.utils.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    private final String EMPLOYEE_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\case_study_furama\\data\\employee.csv";
    private final boolean APPEND = true;
    private final boolean NOAPPEND = false;


    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileToCSV(EMPLOYEE_FILE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            LocalDate birthDate = LocalDate.parse(array[1], formatter);
            Employee employee = new Employee(array[0], birthDate, array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        ReadAndWriteFile.writeFileToCSV(EMPLOYEE_FILE, employee.getInforToEmployee(), APPEND);
        employees.add(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        List<Employee> list = findAll();
        for (Employee employeese : list) {
            if (employeese.getIdEmployee().equalsIgnoreCase(employee.getIdEmployee())) {
                employeese.setName(employee.getName());
                employeese.setBirthDate(employee.getBirthDate());
                employeese.setGender(employee.getGender());
                employeese.setIDCard(employee.getIDCard());
                employeese.setPhoneNumber(employee.getPhoneNumber());
                employeese.setEmail(employee.getEmail());
                employeese.setEducationLevel(employee.getEducationLevel());
                employeese.setPosition(employee.getPosition());
                employeese.setSalary(employee.getSalary());
                break;
            } else {
                System.out.println("Employee number not found");
                break;
            }
        }
//        ReadAndWriteFile.clearFile(EMPLOYEE_FILE);
        for (Employee employee1 : list) {
            ReadAndWriteFile.writeFileToCSV(EMPLOYEE_FILE, employee1.getInforToEmployee(), NOAPPEND);
        }
    }
}