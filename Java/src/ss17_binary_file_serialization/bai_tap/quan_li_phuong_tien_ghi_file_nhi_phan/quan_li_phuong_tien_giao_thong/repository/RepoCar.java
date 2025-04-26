package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.util.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class RepoCar implements IRepoCar {
    private final String VEHICLE_DAT_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\ss17_binary_file_serialization\\bai_tap\\quan_li_phuong_tien_ghi_file_nhi_phan\\quan_li_phuong_tien_giao_thong\\data\\vehicle.dat";
    private static ArrayList<Car> carList = new ArrayList<>();

    @Override
    public ArrayList<Car> findAll() {
        List<Car> cars = ReadAndWriteBinaryFile.readBinatyCarFile(VEHICLE_DAT_FILE);
        return new ArrayList<>(cars);
    }

    @Override
    public void add(Car car) {
        List<Car> cars = ReadAndWriteBinaryFile.readBinatyCarFile(VEHICLE_DAT_FILE);
        cars.add(car);
        ReadAndWriteBinaryFile.writeBinaryCarFile(VEHICLE_DAT_FILE, cars);
    }

    @Override
    public void delete(String bienSoXe) {
        List<Car> cars=ReadAndWriteBinaryFile.readBinatyCarFile(VEHICLE_DAT_FILE);
        Car deleteCar = null;
        for (Car car : cars) {
            if (car.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                deleteCar = car;
                break;
            }
        }
        if (deleteCar != null) {
            cars.remove(deleteCar);
            ReadAndWriteBinaryFile.writeBinaryCarFile(VEHICLE_DAT_FILE,cars);
            System.out.println("Đã xóa xe ô tô có biển số : " + bienSoXe);
        }
    }

    @Override
    public void update(Car car) {
        List<Car> cars=ReadAndWriteBinaryFile.readBinatyCarFile(VEHICLE_DAT_FILE);
        Car updateCar=null;
        for (Car car1:cars){
           if (car1.getBienKiemSoat().equalsIgnoreCase(updateCar.getBienKiemSoat())){
               updateCar=car1;
               break;
           }
        }
        if (updateCar!=null){
            updateCar.setHangSanXuat(car.getHangSanXuat());
            updateCar.setNamSanXuat(car.getNamSanXuat());
            updateCar.setChuSoHuu(car.getChuSoHuu());
            updateCar.setKieuXe(car.getKieuXe());
            updateCar.setSoChoNgoi(car.getSoChoNgoi());
        }
        ReadAndWriteBinaryFile.writeBinaryCarFile(VEHICLE_DAT_FILE,cars);
    }
}
