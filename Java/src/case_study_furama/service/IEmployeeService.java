package case_study_furama.service;

import case_study_furama.model.Employee;

import java.util.List;

public interface IEmployeeService extends Service{
    List<Employee> findAll();
    void add(Employee employee);
    void edit(Employee employee);
}
