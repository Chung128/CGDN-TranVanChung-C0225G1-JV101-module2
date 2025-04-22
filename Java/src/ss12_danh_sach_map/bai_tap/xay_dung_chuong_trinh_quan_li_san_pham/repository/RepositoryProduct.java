package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.repository;

import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity.ProductList;
import ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.view.ViewProduct;

import java.util.ArrayList;
import java.util.List;

public class RepositoryProduct implements IRepoProduct {
    private static List<ProductList> product = new ArrayList<>();

    static {
        product.add(new ProductList(10, 30000, "Khô bò"));
        product.add(new ProductList(11, 25000, "Khô gà"));
        product.add(new ProductList(12, 35000, "Khô mực"));
    }

    @Override
    public ArrayList<ProductList> findAll() {
        return new ArrayList<>(product);
    }

    @Override
    public void add(ProductList productList) {
        product.add(productList);
    }

    @Override
    public void edit(int id, double price, String name) {

    }

    @Override
    public void editProduct(int id) {
        for (ProductList productList:product){
            if (productList.getId()==id){
                productList.setPrice(ViewProduct.editProduct().getPrice());
                productList.setNameProduct(ViewProduct.editProduct().getNameProduct());
                return;
            }
        }
    }

    @Override
    public void deleteById(String name) {
        ProductList productsToDelete = null;
        for (ProductList productList : product) {
            if (productList.getNameProduct().equalsIgnoreCase(name)) {
                productsToDelete = productList;
                break;
            }
        }
        if (productsToDelete != null) {
            product.remove(productsToDelete);
            System.out.println("Đã xóa sản phẩm " + productsToDelete);
        } else {
            System.out.println("Không tìm thấy tên sản phẩm .");
        }
    }

    @Override
    public void searchProduct(int id) {
        ProductList search = null;
        for (ProductList productList : product) {
            if (productList.getId()==id) {
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

    @Override
    public void sort() {

    }
}
