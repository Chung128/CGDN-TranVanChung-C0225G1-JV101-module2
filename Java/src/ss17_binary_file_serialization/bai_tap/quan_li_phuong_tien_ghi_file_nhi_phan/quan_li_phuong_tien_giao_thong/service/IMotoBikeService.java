package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.MotoBike;

import java.util.ArrayList;

public interface IMotoBikeService {
    ArrayList<MotoBike> findAll();

    void add(MotoBike motoBike);

    void delete(String bienSoXe);
}
