package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void add(Car car);
    void delete(String bienSoXe);
}
