package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.MotoBike;

import java.util.ArrayList;

public class RepoMotoBike implements IRepoMotoBike {
    private static ArrayList<MotoBike> motoBikes = new ArrayList<>();

    static {
        motoBikes.add(new MotoBike("43-K1-678.56", "Yamaha", 12023, "Bình", 155));
        motoBikes.add(new MotoBike("43-H1-345.89", "Honda", 12024, "Đông", 150));
        motoBikes.add(new MotoBike("43-AK-765.23", "Vinfast", 12025, "Khánh", 110));
    }

    @Override
    public ArrayList<MotoBike> findAll() {
        return new ArrayList<>(motoBikes);
    }

    @Override
    public void add(MotoBike motoBike) {
        motoBikes.add(motoBike);
    }

    @Override
    public void deleteLicensePlate(String bienSoXe) {
        MotoBike xeCanXoa = null;
        for (MotoBike moto : motoBikes) {
            if (moto.getBienKiemSoat().equalsIgnoreCase(bienSoXe)) {
                xeCanXoa = moto;
                break;
            }
        }
        if (xeCanXoa != null) {
            motoBikes.remove(xeCanXoa);
            System.out.println("Đã xóa xe máy có biển số : " + bienSoXe);
        }
    }
}
