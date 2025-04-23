package ss12_danh_sach_map.bai_tap.xay_dung_chuong_trinh_quan_li_san_pham.entity;

public class ProductList {
    private int id;
    private String nameProduct;
    private double price;

    public ProductList() {
    }

    public ProductList(int id, double price, String nameProduct) {
        this.id = id;
        this.price = price;
        this.nameProduct = nameProduct;
    }

    public ProductList(double price, String name) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                " id= " + id +
                " nameProduct= " + nameProduct + '\'' +
                " price= " + price +
                '}';
    }
//    @Override
//    public int compareTo(ProductList o) {
//        return this.nameProduct.compareTo(o.nameProduct);
//        return Double.compare(price,o.price);
}
