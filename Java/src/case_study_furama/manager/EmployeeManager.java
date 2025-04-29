package case_study_furama.manager;

import java.util.Scanner;

public class EmployeeManager {
    private static Scanner scanner=new Scanner(System.in);
    public static void displayListEmployees(){
       do {
           System.out.println(
                   "Select the employee management position.\n"+
                   "1\tDisplay list employees\n" +
                   "2\tAdd new employee\n" +
                   "3\tEdit employee\n" +
                   "4\tReturn main menu\n"
           );
           int chose=scanner.nextInt();
           if (chose>=1&&chose<=4){
               switch (chose){
                   case 1:
                   case 2:
                   case 3:
                   case 4:return;
               }
           }else {
               System.out.println("select the function again.");
           }
       }while (true);
    }
    public static void addNewEmployee(){

    }
    public static void editEmployee(){

    }

}
