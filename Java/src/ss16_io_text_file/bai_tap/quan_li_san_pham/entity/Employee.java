package ss16_io_text_file.bai_tap.quan_li_san_pham.entity;

public class Employee {
    private int id;
    private String name;
    private double price;

    public Employee(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                " id= " + id +
                " name= " + name  +
                " price= " + price +
                '}';
    }
    public String getInfoToCSV(){
        return getId()+","+getPrice()+","+getName();
    }
}
