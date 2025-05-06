package case_study_furama.controller;

import case_study_furama.service.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        EmployeeService employeeService=new EmployeeService();
        CustomerService customerService=new CustomerService();
        FacilityService facilityService=new FacilityService();
        BookingService bookingService=new BookingService();
        ContractService contractService=new ContractService();
        do {
            System.out.println(
                    "Select system function:\n"+
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "--------------------------");
            int chose = scanner.nextInt();
            if (chose >= 1 && chose <= 6) {
                switch (chose){
                    case 1:
                        do {
                            System.out.println(
                                    "Employee Management\n"+
                                            "1\tDisplay list employees\n" +
                                            "2\tAdd new employee\n" +
                                            "3\tEdit employee\n" +
                                            "4\tReturn main menu\n"
                            );
                            try {
                                System.out.println("Select the employee management position");
                                int number=scanner.nextInt();
                                if (number>=1&&number<=4){
                                    switch (number){
                                        case 1:
                                            EmployeeManager.displayListEmployees();
                                           break;
                                        case 2:
                                            EmployeeManager.addNewEmployee();
                                           break;
                                        case 3:
                                            EmployeeManager.editEmployee();
                                           break;
                                        case 4:
                                            System.out.println("Exited.");
                                            return;
                                    }
                                }else {
                                    System.out.println("select the function again.");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                System.out.println("please enter an integer.");
                            }
                        }while(true);
                    case 2:
                        do {
                            System.out.println(
                                    "Customer Management\n" +
                                            "1.\tDisplay list customers\n" +
                                            "2.\tAdd new customer\n" +
                                            "3.\tEdit customer\n" +
                                            "4.\tReturn main menu\n");
                            try {
                                System.out.println("select the function.");
                                int number =scanner.nextInt();
                                if (number>=1&&number<=4){
                                    switch (number){
                                        case 1:
                                           CustomerManager.displayListCustomers();
                                        case 2:
                                            CustomerManager.addNewCustomer();
                                        case 3:
                                            CustomerManager.editCustomer();
                                        case 4:break;
                                    }
                                }else {
                                    System.out.println("Select the function again.");
                                }
                            } catch (Exception e) {
                                System.out.println("Errors: please enter an integer.");
                            }
                        }while (true);
                    case 3:
                        do {
                            System.out.println(
                                    "Select the function."+
                                            "1\tDisplay list facility\n" +
                                            "2\tAdd new facility\n" +
                                            "3\tDisplay list facility maintenance\n" +
                                            "4\tReturn main menu\n");
                            try {
                                int number=scanner.nextInt();
                                if (number>=1&&number<=4){
                                    switch (number){
                                        case 1:
                                            FacilityManager.displayListFacility();
                                        case 2:
                                            FacilityManager.addNewFacility();
                                        case 3:
                                            FacilityManager.displayListFacilityMaintenance();
                                        case 4:return;
                                    }
                                }else {
                                    System.out.println("select the function again.");
                                }
                            } catch (Exception e) {
                                System.out.println("please enter an integer.");
                            }

                        }while (true);
                    case 4:
                        do {
                            System.out.println(
                                    "Select the function: "+
                                            "1.\tDisplay list booking\n" +
                                            "2.\tAdd new booking\n" +
                                            "3.\tCreate new contracts\n" +
                                            "4.\tDisplay list contracts\n" +
                                            "5.\tEdit contracts\n" +
                                            "6.\tReturn main menu\n");
                            try {
                                int number=scanner.nextInt();
                                if (number>=1&&number<=6){
                                    switch (number){
                                        case 1:
                                            BookingManager.displayListBooking();
                                        case 2:
                                            BookingManager.addNewBooking();
                                        case 3:
                                            BookingManager.createNewContracts();
                                        case 4:
                                            BookingManager.displayListContracts();
                                        case 5:
                                            BookingManager.editContracts();
                                        case 6:return;
                                    }
                                }else {
                                    System.out.println("Select the function again.");
                                }
                            } catch (Exception e) {
                                System.out.println("please enter an integer.");
                            }

                        }while (true);
                    case 5:
                        do {
                            System.out.println(
                                    "Select the function: " +
                                            "1.\tDisplay list customers use service\n" +
                                            "2.\tDisplay list customers get voucher\n" +
                                            "3.\tReturn main menu\n");
                            try {
                                int number = scanner.nextInt();
                                if (number >= 1 && number <= 3) {
                                    switch (number) {
                                        case 1:
                                            PromotionManager.customerUseService();
                                        case 2:
                                            PromotionManager.customerGetVoucher();
                                        case 3:
                                            return;
                                    }
                                } else {
                                    System.out.println("Select the function again.");
                                }
                            } catch (Exception e) {
                                System.out.println("please enter an integer");
                            }
                        } while (true);
                    case 6:
                        return;
                }
            }else {
                System.out.println("select the function again.");
            }
        }while (true);
    }
}
