package ss16_io_text_file.bai_tap.quan_li_san_pham.repository;

import ss16_io_text_file.bai_tap.quan_li_san_pham.common.ReadAndWriteFile;
import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepoProduct implements IRepoProduct {
    private final String PRODUCT_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\ss16_io_text_file\\bai_tap\\quan_li_san_pham\\data\\data.csv";
    private final String NEW_FILE = "D:\\codegym\\module2\\module2\\Java\\src\\ss16_io_text_file\\bai_tap\\quan_li_san_pham\\data\\search_product";
    private final boolean APPEND = true;
    private final boolean NOAPPEND = false;
    private static List<Employee> products = new ArrayList<>();

    @Override
    public ArrayList<Employee> findAll() {
        List<Employee> productList = ReadAndWriteFile.readFile(PRODUCT_FILE);
        return new ArrayList<>(productList);
    }

    @Override
    public void addProduct(Employee product) {
        ReadAndWriteFile.writeFile(PRODUCT_FILE, product.getInfoToCSV(), APPEND);
        RepoProduct.products.add(product);
    }

    @Override
    public void editProduct(Employee product) {
        List<Employee> lists = findAll();
        for (Employee product1 : lists) {
            if (product1.getId() == product.getId()) {
                product1.setPrice(product.getPrice());
                product1.setName(product.getName());
                break;
            }
        }
        ReadAndWriteFile.clearFile(PRODUCT_FILE);
        for (Employee p : lists) {
            ReadAndWriteFile.writeFile(PRODUCT_FILE, p.getInfoToCSV(), APPEND);
        }
    }

    @Override
    public void deleteProduct(int id) {
        List<Employee> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(i);
                System.out.println("Đã xóa sản phẩm có mã là : " + id);
                break;
            } else {
                System.out.println("Không tìm thấy tên sản phẩm .");
            }
        }
        for (Employee p : list) {
            ReadAndWriteFile.writeFile(PRODUCT_FILE, p.getInfoToCSV(), NOAPPEND);
        }

    }

    @Override
    public void searchProduct(String name) {
        List<Employee> list = findAll();
        List<Employee> resultList = new ArrayList<>();
        for (Employee productList : list) {
            if (productList.getName().equalsIgnoreCase(name)) {
                resultList.add(productList);
            }
        }
        if (resultList.isEmpty()) {
            System.out.println("Không tìm thấy tên sản phẩm .");
        } else {
            System.out.println("Sản phẩm cần tìm là : " + resultList);
            ReadAndWriteFile.clearFile(NEW_FILE);   //xóa nội dung trong file hiển thị tìm kiếm nếu có
            for (Employee p : resultList) {
                ReadAndWriteFile.writeFile(NEW_FILE, p.getInfoToCSV(), APPEND);
            }
            System.out.println("Đã ghi kết quả tìm kếm vào file : " + NEW_FILE);
        }
    }

    @Override
    public void sortProductAscending() {
        List<Employee> products = findAll();
        products.sort(Comparator.comparingDouble(Employee::getPrice));
        ReadAndWriteFile.clearFile(NEW_FILE); //Xóa hết dữ liệu trong file mới
        for (Employee p : products) {
            ReadAndWriteFile.writeFile(NEW_FILE, p.getInfoToCSV(), APPEND);
        }
        System.out.println("Đã sắp xếp tăng dần .");
    }

    @Override
    public void sortProductDescending() {
        List<Employee> products = findAll();
        products.sort(Comparator.comparingDouble(Employee::getPrice).reversed());
        ReadAndWriteFile.clearFile(NEW_FILE); //Xóa hết dữ liệu trong file mới
        for (Employee p : products) {
            ReadAndWriteFile.writeFile(NEW_FILE, p.getInfoToCSV(), APPEND);
        }
        System.out.println("Đã sắp xếp giảm dần .");
    }
}
