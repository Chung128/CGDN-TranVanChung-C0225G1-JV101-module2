package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.IRepoCar;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.RepoCar;

import java.util.ArrayList;

public class CarService implements ICarService {
    private IRepoCar cars = new RepoCar();

    @Override
    public ArrayList<Car> findAll() {
        return cars.findAll();
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(String bienSoXe) {
        cars.deleteLicensePlate(bienSoXe);
    }
}


