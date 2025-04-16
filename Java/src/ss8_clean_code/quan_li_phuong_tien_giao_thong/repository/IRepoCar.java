package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.List;

public interface IRepoCar {
    List<Car> findAll();
    void add(Car bus);
    void deleteLicensePlate(String bienSoXe);
}
