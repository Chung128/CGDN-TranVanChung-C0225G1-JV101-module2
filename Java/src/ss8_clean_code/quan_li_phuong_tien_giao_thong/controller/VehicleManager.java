package ss8_clean_code.quan_li_phuong_tien_giao_thong.controller;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.service.CarService;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.view.CarView;

import java.util.Scanner;

public class VehicleManager {
    public static void displayMenu() {
        CarService busService=new CarService();
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Hiển thị phương tiện" +
                    "\n 2.Thêm mới phương tiện" +
                    "\n 3.Xóa phương tiện" +
                    "\n 4. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    VehicleController.displayVehicle();
                    break;
                case 2:
                   VehicleController.addVehicle();
                    break;
                case 3:
                   String numberPlate= CarView.delete();
                    busService.delete(numberPlate);
                    break;
                case 4:
                    return;
                default:
            }
        } while (true);
    }
}
