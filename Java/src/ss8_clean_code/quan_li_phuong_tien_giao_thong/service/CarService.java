package ss8_clean_code.quan_li_phuong_tien_giao_thong.service;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.IRepoCar;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.repository.RepoBus;

import java.util.List;

public class CarService implements ICarService {
    private IRepoCar buses = new RepoBus();

    @Override
    public List<Car> findAll() {
        return buses.findAll();
    }

    @Override
    public void add(Car bus) {
        buses.add(bus);
    }

    @Override
    public void delete(String bienSoXe) {
        buses.deleteLicensePlate(bienSoXe);
    }

}


