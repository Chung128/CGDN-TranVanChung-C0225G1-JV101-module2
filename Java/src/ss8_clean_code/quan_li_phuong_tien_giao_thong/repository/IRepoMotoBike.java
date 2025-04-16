package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.MotoBike;

import java.util.ArrayList;

public interface IRepoMotoBike {
    ArrayList<MotoBike> findAll();
    void add(MotoBike motoBike);
    void deleteLicensePlate(String bienSoXe);
}
