package case_study_furama.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Employee extends Persons {
    private String idEmployee;
    private String educationLevel;
    private String position;
    private double salary;

    public Employee(String name, LocalDate birthDate, String gender, String IDCard, String phoneNumber, String email, String idEmployee, String educationLevel, String position, double salary) {
        super(name, birthDate, gender, IDCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }


    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                " id employee= " + idEmployee +
                " education level= " + educationLevel +
                " position= " + position +
                " salary= " + salary +
                '}';
    }

    public List<String> getInforToEmployee() {
        return Collections.singletonList(super.getInfoToPerson() + "," +
                getIdEmployee() + "," + getEducationLevel() + "," + getPosition() + "," + getSalary());
    }
}
