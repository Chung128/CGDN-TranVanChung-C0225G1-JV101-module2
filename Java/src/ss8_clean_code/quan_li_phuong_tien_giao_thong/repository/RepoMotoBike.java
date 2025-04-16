package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.MotoBike;

public class RepoMotoBike implements IRepoMotoBike {
    private static MotoBike[] xeMay=new MotoBike[5];
    static {
        xeMay[0]=new MotoBike("43-K1-678.56","Yamaha",12023,"Bình",155);
        xeMay[1]=new MotoBike("43-H1-345.89","Honda",12024,"Đông",150);
        xeMay[2]=new MotoBike("43-AK-765.23","Vinfast",12025,"Khánh",110);
    }
}
