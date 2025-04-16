package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public class RepoBus implements IRepoCar {
    private static ArrayList<Car> busList =new ArrayList<>();
    static {
        busList.add(new Car("43B-453.88", "Huyndai", 2020, "Chung", 45, "Xe khách"));
        busList.add(new Car("43B-453.89", "Ford", 20205, "vẩn là Chung", 16, "Xe du lịch"));
    }
    @Override
    public ArrayList<Car> findAll(){
        return new ArrayList<>(busList);
    }
    @Override
    public void add(Car bus){
        busList.add(bus);
    }
    @Override
    public void deleteLicensePlate(String bienSoXe){
        Car xeCanXoa=null;
        for (Car bus:busList){
            if (bus.getBienKiemSoat().equalsIgnoreCase(bienSoXe)){
                xeCanXoa=  bus;
                break;
            }
        }
        if (xeCanXoa!=null){
            busList.remove(xeCanXoa);
            System.out.println("Đã xóa xe có biển số : "+bienSoXe);
        }else {
            System.out.println("Không tìm thấy xe có biển số "+bienSoXe);
        }
    }
}
