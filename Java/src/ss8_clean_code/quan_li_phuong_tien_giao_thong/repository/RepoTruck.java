package ss8_clean_code.quan_li_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_li_phuong_tien_giao_thong.entity.Truck;

public class RepoTruck implements IRepoTruck {
    private static Truck[] xeTai = new Truck[5];
    static {
        xeTai[0]=new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3);
        xeTai[1]=new Truck("43C-47.678","Dongfeng",2020 , "Nguyễn Văn B",9);
        xeTai[2]=new Truck("43C-45.235","Hino",2021,"Nguyễn Văn C",12);
    }
}
