package ss8_clean_code.quan_li_phuong_tien_giao_thong.controller;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.service.CarService;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.service.MotoBikeService;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.service.TruckService;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.view.VehicleView;

import java.util.Scanner;

public class VehicleManager {
    public static void displayMenu() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotoBikeService motoBikeService = new MotoBikeService();
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Hiển thị phương tiện" +
                    "\n 2.Thêm mới phương tiện" +
                    "\n 3.Xóa phương tiện" +
                    "\n 4.Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng : ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        VehicleController.displayVehicle();
                        break;
                    case 2:
                        VehicleController.addVehicle();
                        break;
                    case 3:
                        String numberPlate = VehicleView.delete();
                        carService.delete(numberPlate);
                        truckService.delete(numberPlate);
                        motoBikeService.delete(numberPlate);
                        break;
                    case 4:
                        System.out.println("Đã kết thúc chương trình");
                        return;
                    default:
                }
            } else {
                System.out.println("chọn lại loại xe.");
            }
        }while (true);
    }
}
