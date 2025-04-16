package ss8_clean_code.quan_li_phuong_tien_giao_thong.entity;

public class MotoBike extends Vehicle {
    private double congSuat;

    public MotoBike(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString() +
                "   congSuat=" + congSuat +
                '}';
    }
}
