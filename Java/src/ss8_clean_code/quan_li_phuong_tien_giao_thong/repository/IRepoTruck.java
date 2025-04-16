package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public interface IRepoTruck {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteLicensePlate(String bienSoXe);
}
