package case_study_furama.controller;

import java.util.Scanner;

public class PromotionManager {
    private static Scanner scanner = new Scanner(System.in);

   public static void customerUseService() {
        do {
            System.out.println(
                    "Select the function: " +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            try {
                int chose = scanner.nextInt();
                if (chose >= 1 && chose <= 3) {
                    switch (chose) {
                        case 1:
                        case 2:
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
    }
    public static void customerGetVoucher(){

    }
}
