package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public interface IRepoCar {
    ArrayList<Car> findAll();
    void add(Car car);
    void deleteLicensePlate(String bienSoXe);
}
