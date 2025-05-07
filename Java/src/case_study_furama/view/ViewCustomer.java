package case_study_furama.view;

import case_study_furama.model.Customer;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewCustomer {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i) != null) {
                System.out.println(customers.get(i));
            } else {
                break;
            }
        }
    }

    public static Customer inputDataCustomer() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        String regexName="^[A-ZĂÂÊÔƠƯ][a-zăâđêôơưỳýỷỹỵàáảãạâầấẩẫậăằắẳẵặèéẻẽẹêềếểễệòóỏõọôồốổỗộơờớởỡợùúủũụưừứửữựìíỉĩị]*(\\s[A-ZĂÂÊÔƠƯ][a-zăâđêôơưỳýỷỹỵàáảãạâầấẩẫậăằắẳẵặèéẻẽẹêềếểễệòóỏõọôồốổỗộơờớởỡợùúủũụưừứửữựìíỉĩị]*)*$";
        String regexIdCustomer = "^KH-[0-9]{4}$";
        String regexIdCard = "^[0-9]{9,12}$";
        String regexPhoneNumber = "^0[0-9]{9}$";
        String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        Pattern pattern1 = Pattern.compile(regexName);
        Pattern pattern2 = Pattern.compile(regexIdCustomer);
        Pattern pattern3 = Pattern.compile(regexIdCard);
        Pattern pattern4 = Pattern.compile(regexPhoneNumber);
        Pattern pattern5 = Pattern.compile(regexEmail);

        String name;
        while (true) {
            System.out.print("Enter customer name: ");
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
            System.out.print("Enter customer birth date (yyyy-MM-dd)");
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

        System.out.print("Enter customer gender");
        String gender = scanner.nextLine();
        String idCard;
        while (true) {
            System.out.print("Enter customer id card number: ");
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
            System.out.print("Enter customer phone number: ");
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
            System.out.print("Enter customer email: ");
            email = scanner.nextLine();

            Matcher matcher5 = pattern5.matcher(email);
            if (matcher5.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }

        String idCustomer;
        while (true) {
            System.out.print("Enter customer id number: ");
            idCustomer = scanner.nextLine();

            Matcher matcher2 = pattern2.matcher(idCustomer);
            if (matcher2.matches()) {
                break;
            } else {
                System.out.println("Invalid name format! Please re-enter.");
            }
        }
        String typeOfCustomer = "";
        do {
            System.out.println("select the type of customer");
            System.out.println("1.Diamond");
            System.out.println("2.Platinum");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            int number1 = Integer.parseInt(scanner.nextLine());
            switch (number1) {
                case 1:
                    typeOfCustomer = "Diamond";
                    break;
                case 2:
                    typeOfCustomer = "Platinum";
                    break;
                case 3:
                    typeOfCustomer = "Gold";
                    break;
                case 4:
                    typeOfCustomer = "Silver";
                    break;
                case 5:
                    typeOfCustomer = "Member";
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
                    continue;
            }
            break;
        } while (true);

        System.out.print("enter customer address.");
        String address = scanner.nextLine();
        Customer customer = new Customer(name, birthDate, gender, idCard, phoneNumber, email, idCustomer, typeOfCustomer, address);
        return customer;
    }
}
