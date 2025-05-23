package ss1_tong_quan_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        String[] arrays = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int i = 1;
        while (i <= arrays.length) {
            switch (month) {
                case 2:
                    System.out.println(arrays[i] + " has 28 or 29 days! ");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(arrays[i] + " has 31 days! ");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(arrays[i] + " has 30 days! ");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
            i++;
        }
    }
}
