package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;



import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void add(Car car);
    void delete(String bienSoXe);
}
