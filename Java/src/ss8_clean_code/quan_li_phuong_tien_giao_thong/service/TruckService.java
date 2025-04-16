package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.IRepoTruck;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.RepoTruck;

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
