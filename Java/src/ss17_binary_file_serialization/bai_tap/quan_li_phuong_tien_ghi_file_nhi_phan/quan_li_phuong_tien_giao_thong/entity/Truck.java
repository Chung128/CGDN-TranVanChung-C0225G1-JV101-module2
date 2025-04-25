package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity;


public class Truck extends Vehicle {
    private double trongTai;

    public Truck(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString() +
                "   trongTai=" + trongTai +
                '}';
    }
}
