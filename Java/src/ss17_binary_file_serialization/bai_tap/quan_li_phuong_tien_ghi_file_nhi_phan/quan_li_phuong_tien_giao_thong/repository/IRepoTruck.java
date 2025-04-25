package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public interface IRepoTruck {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteLicensePlate(String bienSoXe);
}
