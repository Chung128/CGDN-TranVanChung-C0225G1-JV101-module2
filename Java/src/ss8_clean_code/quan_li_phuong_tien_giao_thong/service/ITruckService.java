package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();

    void add(Truck truck);

    void delete(String bienSoXe);
}
