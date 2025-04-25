package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;

import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.IRepoTruck;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.RepoTruck;

import java.util.ArrayList;

public class TruckService implements ITruckService {
    private IRepoTruck truckes = new RepoTruck();

    @Override
    public ArrayList<Truck> findAll() {
        return truckes.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckes.add(truck);
    }

    @Override
    public void delete(String bienSoXe) {
        truckes.deleteLicensePlate(bienSoXe);
    }
}
