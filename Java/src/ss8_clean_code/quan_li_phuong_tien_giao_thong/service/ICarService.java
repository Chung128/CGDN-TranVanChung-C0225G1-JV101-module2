package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    void add(Car bus);
    void delete(String bienSoXe);
}
