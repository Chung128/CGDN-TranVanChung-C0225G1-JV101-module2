package ss8_clean_code.quan_li_phuong_tien_giao_thong.controller;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.service.CarService;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.view.CarView;

import java.util.List;
import java.util.Scanner;

public class VehicleController {
   private static Scanner scanner = new Scanner(System.in);
    public static void displayVehicle() {
        CarService busService = new CarService();
        do {
            System.out.println("chọn loại xe .\n" +
                    "1. Hiển thị ôtô. \n" +
                    "2. Hiển thị xe tải. \n" +
                    "3. Hiển thị xe máy.\n ");

            System.out.println("Chọn loại xe muốn hiển thị: ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        System.out.println("Danh sách xe khách :");
                        List<Car> buses = busService.findAll();
                        CarView.displayBus(buses);
                        return;
                    case 2:

                        break;
                    case 3:
                        // code xóa
                        System.out.println("chức năng xóa");
                        break;
                    case 4:
                        return;
                    default:
                }
            }else {
                System.out.println("chọn lại loại xe.");
            }
        } while (true);
    }


    public static void addVehicle(){
        CarService busService = new CarService();
        do {
            System.out.println("chọn loại xe muốn thêm.\n" +
                    "1. thêm ôtô. \n" +
                    "2. thêm xe tải. \n" +
                    "3. thêm xe máy.\n ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        Car bus = CarView.inputDataForBus();
                        busService.add(bus);
                       List<Car> buses = busService.findAll();
                        CarView.displayBus(buses);
                        return;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        return;
                    default:
                }
            }else {
                System.out.println("chọn lại loại xe.");
            }
        } while (true);
    }
}
