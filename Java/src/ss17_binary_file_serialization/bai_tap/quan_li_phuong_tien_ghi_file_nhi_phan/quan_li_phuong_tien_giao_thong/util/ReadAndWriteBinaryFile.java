package ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.util;

import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Car;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.MotoBike;
import ss17_binary_file_serialization.bai_tap.quan_li_phuong_tien_ghi_file_nhi_phan.quan_li_phuong_tien_giao_thong.entity.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinaryFile {
    //ghi file nhị phân
    public static void writeBinaryCarFile(String filePath, List<Car> carList) {
        File file = new File(filePath);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file .");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file .");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file.");
            }
        }
    }

    // đọc nhị phân
    public static List<Car> readBinatyCarFile(String filePath) {
        List<Car> carList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (file.length() > 0) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                carList = (List<Car>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }

    public static void writeBinaryTruckFile(String filePath, List<Truck> truckList) {
        File file = new File(filePath);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(truckList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file .");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file .");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file.");
            }
        }
    }

    // đọc nhị phân
    public static List<Truck> readBinatyTruckFile(String filePath) {
        List<Truck> truckList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (file.length() > 0) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                truckList = (List<Truck>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return truckList;
    }

    public static void writeBinaryMotoBikeFile(String filePath, List<MotoBike> motoBikeList) {
        File file = new File(filePath);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(motoBikeList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file .");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file .");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file.");
            }
        }
    }

    // đọc nhị phân
    public static List<MotoBike> readBinatyMotoBikeFile(String filePath) {
        List<MotoBike> motoBikeList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (file.length() > 0) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                motoBikeList = (List<MotoBike>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return motoBikeList;
    }
}
