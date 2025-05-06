package case_study_furama.service;

import case_study_furama.model.Employee;
import case_study_furama.repository.EmployeeRepo;
import case_study_furama.repository.IEmployeeRepo;


import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepo employeeRepo=new EmployeeRepo();

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public void add(Employee employee) {
        employeeRepo.addNewEmployee(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepo.editEmployee(employee);
    }
}
