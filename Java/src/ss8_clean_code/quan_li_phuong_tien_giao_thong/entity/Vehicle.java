package ss8_clean_code.quan_li_phuong_tien_giao_thong.entity;

public class Vehicle {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;
    public Vehicle(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu){
        this.bienKiemSoat=bienKiemSoat;
        this.hangSanXuat=hangSanXuat;
        this.namSanXuat=namSanXuat;
        this.chuSoHuu=chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return " bienKiemSoat= " + bienKiemSoat +
                "   hangSanXuat= " + hangSanXuat +
                "   namSanXuat= " + namSanXuat +
                "   chuSoHuu= " + chuSoHuu ;
    }
}
