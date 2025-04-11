package ss5_access_modifier.quan_li_san_pham;

public class ProductList {
    public int number;
    public String name;
    public double price;
    public ProductList(int number,String name,double price){
        this.number=number;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
