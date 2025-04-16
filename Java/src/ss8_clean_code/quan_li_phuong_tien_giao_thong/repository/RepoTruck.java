package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Car;
import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public class RepoTruck implements IRepoTruck {
    private static ArrayList<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        trucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        trucks.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }

    @Override
    public ArrayList<Truck> findAll() {
        return new ArrayList<>(trucks);
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void deleteLicensePlate(String bienSoXe) {
        Truck xeCanXoa = null;
        for (Truck truck : trucks) {
            if (truck.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                xeCanXoa = truck;
                break;
            }
        }
        if (xeCanXoa != null) {
            trucks.remove(xeCanXoa);
            System.out.println("Đã xóa xe tải có biển số : " + bienSoXe);
        }
    }
}
