package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.controller;

import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.MotoBike;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service.CarService;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service.MotoBikeService;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service.TruckService;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.view.VehicleView;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayVehicle() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotoBikeService motoBikeService = new MotoBikeService();
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
                        ArrayList<Car> cars = carService.findAll();
                        VehicleView.displayBus(cars);
                        return;
                    case 2:
                        System.out.println("Danh sách xe tải : ");
                        ArrayList<Truck> trucks = truckService.findAll();
                        VehicleView.displayTruck(trucks);
                        return;
                    case 3:
                        System.out.println("Danh sách xe máy : ");
                        ArrayList<MotoBike> motoBikes = motoBikeService.findAll();
                        VehicleView.displayMotoBike(motoBikes);
                        return;
                    default:
                }
            } else {
                System.out.println("chọn lại loại xe.");
            }
        } while (true);
    }


    public static void addVehicle() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotoBikeService motoBikeService = new MotoBikeService();
        do {
            System.out.println("chọn loại xe muốn thêm.\n" +
                    "1. thêm ôtô. \n" +
                    "2. thêm xe tải. \n" +
                    "3. thêm xe máy.\n ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        Car car = VehicleView.inputDataForCar();
                        carService.add(car);
                        System.out.println("Danh sách xe khách :");
                        ArrayList<Car> cars = carService.findAll();
                        VehicleView.displayBus(cars);
                        return;
                    case 2:
                        Truck truck = VehicleView.inputDataForTruck();
                        truckService.add(truck);
                        System.out.println("Danh sách xe tải : ");
                        ArrayList<Truck> trucks = truckService.findAll();
                        VehicleView.displayTruck(trucks);
                        return;
                    case 3:
                        MotoBike motoBike = VehicleView.inputDataForMotoBike();
                        motoBikeService.add(motoBike);
                        System.out.println("Danh sách xe máy : ");
                        ArrayList<MotoBike> motoBikes = motoBikeService.findAll();
                        VehicleView.displayMotoBike(motoBikes);
                        return;
                    default:
                }
            } else {
                System.out.println("chọn lại loại xe.");
            }
        } while (true);
    }
    public static void updateVehicle() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotoBikeService motoBikeService = new MotoBikeService();
        do {
            System.out.println("chọn loại xe muốn cập nhật.\n" +
                    "1. cập nhật ôtô. \n" +
                    "2. cập nhật xe tải. \n" +
                    "3. cập nhật xe máy.\n ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        Car car = VehicleView.inputDataUpdateForCar();
                        carService.update(car);
                        System.out.println("Danh sách xe khách :");
                        ArrayList<Car> cars = carService.findAll();
                        VehicleView.displayBus(cars);
                        return;
                    case 2:
                        Truck truck = VehicleView.inputDataUpdateForTruck();
                        truckService.add(truck);
                        System.out.println("Danh sách xe tải : ");
                        ArrayList<Truck> trucks = truckService.findAll();
                        VehicleView.displayTruck(trucks);
                        return;
                    case 3:
                        MotoBike motoBike = VehicleView.inputDataUpdateForMotoBike();
                        motoBikeService.add(motoBike);
                        System.out.println("Danh sách xe máy : ");
                        ArrayList<MotoBike> motoBikes = motoBikeService.findAll();
                        VehicleView.displayMotoBike(motoBikes);
                        return;
                    default:
                }
            } else {
                System.out.println("chọn lại loại xe.");
            }
        } while (true);
    }
}
