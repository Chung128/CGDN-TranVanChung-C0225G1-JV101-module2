package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository;

import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.util.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class RepoTruck implements IRepoTruck {
    private final String VEHICLE_DAT_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\ss17_binary_file_serialization\\bai_tap\\quan_li_phuong_tien_ghi_file_nhi_phan\\quan_li_phuong_tien_giao_thong\\data\\vehicle.dat";
    private static ArrayList<Truck> trucks = new ArrayList<>();

    @Override
    public ArrayList<Truck> findAll() {
        List<Truck> truckList= ReadAndWriteBinaryFile.readBinatyTruckFile(VEHICLE_DAT_FILE);
        return new ArrayList<>(truckList);
    }

    @Override
    public void add(Truck truck) {
        List<Truck> truckList=ReadAndWriteBinaryFile.readBinatyTruckFile(VEHICLE_DAT_FILE);
        truckList.add(truck);
        ReadAndWriteBinaryFile.writeBinaryTruckFile(VEHICLE_DAT_FILE,truckList);
    }

    @Override
    public void deleteLicensePlate(String bienSoXe) {
        List<Truck> truckList=ReadAndWriteBinaryFile.readBinatyTruckFile(VEHICLE_DAT_FILE);
        Truck xeCanXoa = null;
        for (Truck truck : truckList) {
            if (truck.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                xeCanXoa = truck;
                break;
            }
        }
        if (xeCanXoa != null) {
            truckList.remove(xeCanXoa);
            ReadAndWriteBinaryFile.writeBinaryTruckFile(VEHICLE_DAT_FILE,truckList);
            System.out.println("Đã xóa xe tải có biển số : " + bienSoXe);
        }
    }
}
