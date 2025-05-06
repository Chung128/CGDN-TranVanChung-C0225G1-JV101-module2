package case_study_furama.repository;

import case_study_furama.model.Employee;

import java.util.List;

public interface Repository {
    List<Employee> findAll();
    void addNewEmployee(Employee employee);
    void editEmployee(Employee employee);
}
