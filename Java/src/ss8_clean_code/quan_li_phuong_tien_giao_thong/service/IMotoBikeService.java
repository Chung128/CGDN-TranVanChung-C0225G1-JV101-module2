package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.MotoBike;

import java.util.ArrayList;

public interface IMotoBikeService {
    ArrayList<MotoBike> findAll();

    void add(MotoBike motoBike);

    void delete(String bienSoXe);
}
