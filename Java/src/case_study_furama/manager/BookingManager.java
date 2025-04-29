package case_study_furama.manager;

import java.util.Scanner;

public class BookingManager {
    private static Scanner scanner=new Scanner(System.in);
    private static void displayListBooking(){
        do {
            System.out.println(
                    "Select the function: "+
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            int chose=scanner.nextInt();
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
        }while (true);
    }
    public static void addNewBooking(){

    }
    public static void editCustomer(){

    }
}
