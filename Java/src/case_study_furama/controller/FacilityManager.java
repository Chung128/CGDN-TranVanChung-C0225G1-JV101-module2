package case_study_furama.controller;

import case_study_furama.model.Facility;
import case_study_furama.service.FacilityService;

import java.util.Scanner;

public class FacilityManager {
    private static Scanner scanner=new Scanner(System.in);
    public static void displayListFacility(){
        FacilityService facilityService=new FacilityService();
//        boolean flag=false;
        do {
            System.out.println(
                    "Select the function."+
                    "1\tDisplay list villa\n" +
                    "2\tDisplay list house\n" +
                    "3\tDisplay list room\n" +
                    "4\tBack to menu\n");
            try {
                int chose=scanner.nextInt();
                    switch (chose){
                        case 1:
                            System.out.println("Villa list");
                        case 2:
                        case 3:
                        case 4:return;
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
