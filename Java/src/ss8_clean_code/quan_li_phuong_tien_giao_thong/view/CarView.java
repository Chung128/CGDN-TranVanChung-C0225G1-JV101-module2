package ss8_clean_code.quan_li_phuong_tien_giao_thong.view;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner=new Scanner(System.in);
    public static void displayBus(List<Car> buses){
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i) !=null){
                System.out.println(buses.get(i));
            }else {
                break;
            }
        }
    }
    public static Car inputDataForBus(){
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
        String  carOwnerName= scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi : ");
        int numberOfSeats=Integer.parseInt(scanner.nextLine());
        Car bus=new Car(licensePlate,carBrand,manufactorYear,vehicleType,numberOfSeats,carOwnerName);
        return bus;
    }
    public static String delete(){
        System.out.println("Nhập biển số cần xóa");
        String licensePlate=scanner.nextLine();
        return licensePlate;
    }
}
