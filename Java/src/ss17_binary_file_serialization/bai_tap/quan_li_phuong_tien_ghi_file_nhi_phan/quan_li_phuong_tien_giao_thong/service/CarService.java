package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.service;

import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.IRepoCar;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository.RepoCar;

import java.util.ArrayList;

public class CarService implements ICarService {
    private IRepoCar cars = new RepoCar();

    @Override
    public ArrayList<Car> findAll() {
        return cars.findAll();
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(String bienSoXe) {
        cars.delete(bienSoXe);
    }

    @Override
    public void update(Car car) {
        cars.update(car);
    }
}


