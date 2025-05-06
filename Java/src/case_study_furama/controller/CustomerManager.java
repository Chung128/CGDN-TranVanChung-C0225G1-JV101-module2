package case_study_furama.controller;

import java.util.Scanner;

public class CustomerManager {
    private static Scanner scanner=new Scanner(System.in);
   public static void displayListCustomers(){
       do {
           System.out.println(
                           "select the function\n" +
                           "1.\tDisplay list customers\n" +
                           "2.\tAdd new customer\n" +
                           "3.\tEdit customer\n" +
                           "4.\tReturn main menu\n");
           try {
               int chose =scanner.nextInt();
               if (chose>=1&&chose<=4){
                   switch (chose){
                       case 1:
                       case 2:
                       case 3:
                       case 4:return;
                   }
               }else {
                   System.out.println("Select the function again.");
               }
           } catch (Exception e) {
               System.out.println("Errors: please enter an integer.");
           }
       }while (true);
   }
    public static void addNewCustomer(){

    }
    public static void editCustomer(){

    }
}
