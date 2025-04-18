package ss8_clean_code.quan_li_phuong_tien_giao_thong.view;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.MotoBike;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayBus(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null) {
                System.out.println(cars.get(i));
            } else {
                break;
            }
        }
    }

    public static void displayTruck(ArrayList<Truck> trucks) {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i) != null) {
                System.out.println(trucks.get(i));
            } else {
                break;
            }
        }
    }

    public static void displayMotoBike(ArrayList<MotoBike> motoBikes) {
        for (int i = 0; i < motoBikes.size(); i++) {
            if (motoBikes.get(i) != null) {
                System.out.println(motoBikes.get(i));
            } else {
                break;
            }
        }
    }

    public static Car inputDataForCar() {
        System.out.println("Chức năng thêm mới");
        System.out.print("Nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất : ");
        String carBrand = scanner.nextLine();
        System.out.print("Nhập năm sản xuất : ");
        int manufactorYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại xe : ");
        String vehicleType = scanner.nextLine();
        System.out.print("Nhập tên chủ xe : ");
        String carOwnerName = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi : ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        Car car = new Car(licensePlate, carBrand, manufactorYear, vehicleType, numberOfSeats, carOwnerName);
        return car;
    }
    public static Truck inputDataForTruck(){
        System.out.println("Chức năng thêm mới");
        System.out.print("Nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất : ");
        String carBrand = scanner.nextLine();
        System.out.print("Nhập năm sản xuất : ");
        int manufactorYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên chủ xe : ");
        String carOwnerName = scanner.nextLine();
        System.out.print("Nhập trọng tải : ");
        int vehicleWeight = Integer.parseInt(scanner.nextLine());
        Truck truck=new Truck(licensePlate, carBrand, manufactorYear,carOwnerName,vehicleWeight);
        return truck;
    }
    public static MotoBike inputDataForMotoBike(){
        System.out.println("Chức năng thêm mới");
        System.out.print("Nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất : ");
        String carBrand = scanner.nextLine();
        System.out.print("Nhập năm sản xuất : ");
        int manufactorYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên chủ xe : ");
        String carOwnerName = scanner.nextLine();
        System.out.print("Nhập công suất : ");
        int capacity = Integer.parseInt(scanner.nextLine());
        MotoBike motoBike=new MotoBike(licensePlate, carBrand, manufactorYear,carOwnerName,capacity);
        return motoBike;
    }

    public static String delete() {
        System.out.println("Nhập biển số cần xóa");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }
}
