package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();

    void add(Truck truck);

    void delete(String bienSoXe);
}
