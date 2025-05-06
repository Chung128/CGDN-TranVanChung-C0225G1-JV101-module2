package case_study_furama.view;

import case_study_furama.model.Employee;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewPerson {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null) {
                System.out.println(employees.get(i));
            } else {
                break;
            }
        }
    }

    public static Employee inputDataEmployee() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        String regexIdEmployee = "^NV-[0-9]{4}$";
        String regexIdCard = "^[0-9]{9,12}$";
        String regexPhoneNumber = "^0[0-9]{9}$";
        String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        Pattern pattern1 = Pattern.compile(regexName);
        Pattern pattern2 = Pattern.compile(regexIdEmployee);
        Pattern pattern3 = Pattern.compile(regexIdCard);
        Pattern pattern4 = Pattern.compile(regexPhoneNumber);
        Pattern pattern5 = Pattern.compile(regexEmail);

        String name;
        while (true) {
            System.out.print("Enter employee name: ");
            name = scanner.nextLine();

            Matcher matcher1 = pattern1.matcher(name);
            if (matcher1.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }

        LocalDate birthDate = null;
        while (true) {
            System.out.print("Enter employee (yyyy-MM-dd)");
            String input = scanner.nextLine();
            try {
                birthDate = LocalDate.parse(input, formatter);
                LocalDate today = LocalDate.now();
                Period age = Period.between(birthDate, today);
                if (age.getYears() > 18 || (age.getYears() == 18 && (age.getMonths() >= 0 || age.getDays() >= 0))) {
                    break;
                } else {
                    System.out.println("You must be at least 18 years old. Please re-enter.");
                }
            } catch (DateTimeException e) {
                System.out.println("Invalid date format! Please enter in yyyy-MM-dd format.");
            }
        }

        System.out.print("Enter employee gender");
        String gender = scanner.nextLine();
        String idCard;
        while (true) {
            System.out.print("Enter employee id card number: ");
            idCard = scanner.nextLine();

            Matcher matcher3 = pattern3.matcher(idCard);
            if (matcher3.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }

        String phoneNumber;
        while (true) {
            System.out.print("Enter employee phone number: ");
            phoneNumber = scanner.nextLine();

            Matcher matcher4 = pattern4.matcher(phoneNumber);
            if (matcher4.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }

        String email;
        while (true) {
            System.out.print("Enter employee email: ");
            email = scanner.nextLine();

            Matcher matcher5 = pattern5.matcher(email);
            if (matcher5.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }

        String idEmployee;
        while (true) {
            System.out.print("Enter employee id number: ");
            idEmployee = scanner.nextLine();

            Matcher matcher2 = pattern2.matcher(idEmployee);
            if (matcher2.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }
        String educationLevel;
        String position = "";
        do {
            System.out.println("select the educationLevel");
            System.out.println("1.Secondary");
            System.out.println("2.College");
            System.out.println("3.University");
            System.out.println("4.Graduate");
            int number1 = Integer.parseInt(scanner.nextLine());
            switch (number1) {
                case 1:
                    educationLevel = "Secondary";
                    break;
                case 2:
                    educationLevel = "College";
                    break;
                case 3:
                    educationLevel = "University";
                    break;
                case 4:
                    educationLevel = "Graduate";
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
                    continue;
            }
            break;
        } while (true);

        do {
            System.out.println("Select the position:");
            System.out.println("1. Receptionist");
            System.out.println("2. Waiter");
            System.out.println("3. Specialist");
            System.out.println("4. Supervisor");
            System.out.println("5. Manager");
            System.out.println("6. Director");

            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    position = "Receptionist";
                    break;
                case 2:
                    position = "Waiter";
                    break;
                case 3:
                    position = "Specialist";
                    break;
                case 4:
                    position = "Supervisor";
                    break;
                case 5:
                    position = "Manager";
                    break;
                case 6:
                    position = "Director";
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
                    continue; // quay lại vòng lặp nếu nhập sai
            }
            break; // nhập đúng rồi thì thoát vòng lặp
        } while (true);
        System.out.print("Enter the salary.");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name, birthDate, gender, idCard, phoneNumber, email, idEmployee, educationLevel, position, salary);
        return employee;
    }

//    public static Employee inputIdToEdit() {
//
//    }
}
