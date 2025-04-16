package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public class RepoCar implements IRepoCar {
    private static ArrayList<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 7, "Xe du lịch"));
        carList.add(new Car("43B-453.88", "Huyndai", 2020, "Trần Văn B", 45, "Xe khách"));
        carList.add(new Car("43B-453.89", "Ford", 20205, "Lê Văn C", 16, "Xe du lịch"));
    }

    @Override
    public ArrayList<Car> findAll() {
        return new ArrayList<>(carList);
    }

    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public void deleteLicensePlate(String bienSoXe) {
        Car xeCanXoa = null;
        for (Car car : carList) {
            if (car.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                xeCanXoa = car;
                break;
            }
        }
        if (xeCanXoa != null) {
            carList.remove(xeCanXoa);
            System.out.println("Đã xóa xe ô tô có biển số : " + bienSoXe);
        }
    }
}
