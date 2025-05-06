package case_study_furama.controller;

import case_study_furama.model.Employee;
import case_study_furama.service.EmployeeService;
import case_study_furama.view.ViewPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
//    private static Scanner scanner = new Scanner(System.in);

    public static void displayListEmployees() {
        EmployeeService employeeService = new EmployeeService();
        System.out.println("Display list employees");
        List<Employee> employees = employeeService.findAll();
        ViewPerson.displayEmployee((ArrayList<Employee>) employees);

    }

    public static void addNewEmployee() {
        EmployeeService employeeService = new EmployeeService();
        Employee employee=ViewPerson.inputDataEmployee();
        employeeService.add(employee);
    }

    public static void editEmployee() {
        EmployeeService employeeService=new EmployeeService();
        Employee employee=ViewPerson.inputDataEmployee();
        employeeService.edit(employee);
    }

}
