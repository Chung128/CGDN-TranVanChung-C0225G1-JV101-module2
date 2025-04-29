package case_study_furama.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
            System.out.print(
                    "Select system function: "+
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "--------------------------");
            int chose = scanner.nextInt();
            if (chose <= 1 && chose <= 6) {
                switch (chose){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return;
                }
            }else {
                System.out.println("select the function again.");
            }
        }while (true);
    }
}
