package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.repository;


import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.MotoBike;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.util.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class RepoMotoBike implements IRepoMotoBike {
    private final String VEHICLE_DAT_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\ss17_binary_file_serialization\\bai_tap\\quan_li_phuong_tien_ghi_file_nhi_phan\\quan_li_phuong_tien_giao_thong\\data\\vehicle.dat";
    private static ArrayList<MotoBike> motoBikes = new ArrayList<>();
    @Override
    public ArrayList<MotoBike> findAll() {
        List<MotoBike> motoBikeList= ReadAndWriteBinaryFile.readBinatyMotoBikeFile(VEHICLE_DAT_FILE);
        return new ArrayList<>(motoBikeList);
    }

    @Override
    public void add(MotoBike motoBike) {
        List<MotoBike> moto=ReadAndWriteBinaryFile.readBinatyMotoBikeFile(VEHICLE_DAT_FILE);
        moto.add(motoBike);
        ReadAndWriteBinaryFile.writeBinaryMotoBikeFile(VEHICLE_DAT_FILE,moto);
    }

    @Override
    public void deleteLicensePlate(String bienSoXe) {
        List<MotoBike> motoBikeList=ReadAndWriteBinaryFile.readBinatyMotoBikeFile(VEHICLE_DAT_FILE);
        MotoBike xeCanXoa = null;
        for (MotoBike moto : motoBikeList) {
            if (moto.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                xeCanXoa = moto;
                break;
            }
        }
        if (xeCanXoa != null) {
            motoBikeList.remove(xeCanXoa);
            ReadAndWriteBinaryFile.writeBinaryMotoBikeFile(VEHICLE_DAT_FILE,motoBikeList);
            System.out.println("Đã xóa xe máy có biển số : " + bienSoXe);
        }
    }
}
