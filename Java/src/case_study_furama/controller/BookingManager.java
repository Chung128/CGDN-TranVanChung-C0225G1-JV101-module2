package case_study_furama.controller;

import java.util.Scanner;

public class BookingManager {
    private static Scanner scanner=new Scanner(System.in);
    public static void displayListBooking(){
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
                int chose=scanner.nextInt();
                if (chose>=1&&chose<=6){
                    switch (chose){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:return;
                    }
                }else {
                    System.out.println("Select the function again.");
                }
            } catch (Exception e) {
                System.out.println("please enter an integer.");
            }

        }while (true);
    }
    public static void addNewBooking(){

    }
    public static void createNewContracts(){

    }
    public static void displayListContracts(){

    }
    public static void editContracts(){

    }
}
