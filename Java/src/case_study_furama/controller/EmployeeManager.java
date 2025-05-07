package case_study_furama.controller;

import case_study_furama.model.Employee;
import case_study_furama.service.EmployeeService;
import case_study_furama.view.ViewEmployee;

import java.util.ArrayList;
import java.util.List;
public class EmployeeManager {

    public static void displayListEmployees() {
        EmployeeService employeeService = new EmployeeService();
        System.out.println("Display list employees");
        List<Employee> employees = employeeService.findAll();
        ViewEmployee.displayEmployee((ArrayList<Employee>) employees);
    }

    public static void addNewEmployee() {
        EmployeeService employeeService = new EmployeeService();
        System.out.println("add new employee");
        Employee employee= ViewEmployee.inputDataEmployee();
        employeeService.add(employee);
    }

    public static void editEmployee() {
        EmployeeService employeeService=new EmployeeService();
        System.out.println("update employee");
        Employee employee= ViewEmployee.inputDataEmployee();
        employeeService.edit(employee);
    }

}
