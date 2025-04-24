package ss16_io_text_file.bai_tap.quan_li_san_pham.repository;

import ss16_io_text_file.bai_tap.quan_li_san_pham.common.ReadAndWriteFile;
import ss16_io_text_file.bai_tap.quan_li_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class RepoProduct implements IRepoProduct {
    private final String PRODUCT_FILE="D:\\codegym\\module2\\module2\\Java\\src\\ss16_io_text_file\\bai_tap\\quan_li_san_pham\\data\\data.csv";
    private final boolean APPEND=true;
    private final boolean NOAPPEND=false;
    private static List<Product> products = new ArrayList<>();

    @Override
    public ArrayList<Product> findAll() {
        List<Product> productList= ReadAndWriteFile.readFile(PRODUCT_FILE);
        return new ArrayList<>(productList);
    }

    @Override
    public void addProduct(Product product) {
        ReadAndWriteFile.writeFile(PRODUCT_FILE,product.getInfoToCSV(),APPEND);
        RepoProduct.products.add(product);
    }

    @Override
    public void editProduct(Product product) {
        List<Product> lists=findAll();
        for (Product product1 : lists) {
            if (product1.getId() == product.getId()) {
                product1.setPrice(product.getPrice());
                product1.setName(product.getName());
                break;
            }
        }
        for (Product p:lists){
            ReadAndWriteFile.writeFile(PRODUCT_FILE, p.getInfoToCSV(),APPEND);
        }
    }
    @Override
    public void deleteProduct(int id) {
        List<Product> list=findAll();
        for (int i=0 ; i<list.size();i++) {
            if (id==list.get(i).getId()) {
                list.remove(i);
                System.out.println("Đã xóa sản phẩm có mã là : "+ id);
                break;
            }else {
                System.out.println("Không tìm thấy tên sản phẩm .");
            }
        }
        for (Product p: list){
            ReadAndWriteFile.writeFile(PRODUCT_FILE, p.getInfoToCSV(),NOAPPEND);
        }

    }

    @Override
    public void searchProduct(int id) {
        Product search = null;
        for (Product productList : products) {
            if (productList.getId() == id) {
                search = productList;
                break;
            }
        }
        if (search != null) {
            System.out.println("Sản phẩm cần tìm là : " + search);
        } else {
            System.out.println("Không tìm thấy tên sản phẩm .");
        }
    }
}
