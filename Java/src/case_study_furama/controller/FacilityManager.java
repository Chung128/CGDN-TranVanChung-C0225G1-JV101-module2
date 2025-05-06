package case_study_furama.controller;

import java.util.Scanner;

public class FacilityManager {
    private static Scanner scanner=new Scanner(System.in);
    public static void displayListFacility(){
        do {
            System.out.println(
                    "Select the function."+
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            try {
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
            } catch (Exception e) {
                System.out.println("please enter an integer.");
            }

        }while (true);
    }
    public static void addNewFacility(){

    }
    public static void displayListFacilityMaintenance(){

    }
}
