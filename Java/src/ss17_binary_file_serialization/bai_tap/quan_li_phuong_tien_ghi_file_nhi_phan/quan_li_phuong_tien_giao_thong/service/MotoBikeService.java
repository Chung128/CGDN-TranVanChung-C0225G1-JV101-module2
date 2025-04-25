package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.MotoBike;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.IRepoMotoBike;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.RepoMotoBike;

import java.util.ArrayList;

public class MotoBikeService implements IMotoBikeService {
    private IRepoMotoBike motoBikes = new RepoMotoBike();

    @Override
    public ArrayList<MotoBike> findAll() {
        return motoBikes.findAll();
    }

    @Override
    public void add(MotoBike motoBike) {
        motoBikes.add(motoBike);
    }

    @Override
    public void delete(String bienSoXe) {
        motoBikes.deleteLicensePlate(bienSoXe);
    }
}
