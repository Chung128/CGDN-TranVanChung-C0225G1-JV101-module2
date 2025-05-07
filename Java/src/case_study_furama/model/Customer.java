package case_study_furama.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Customer extends Persons {
    private String idCustomer;
    private String typesOfCustomer;
    private String address;

    public Customer(String name, LocalDate birthDate, String gender, String IDCard, String phoneNumber, String email, String id, String typesOfCustomer, String address) {
        super(name, birthDate, gender, IDCard, phoneNumber, email);
        this.idCustomer = id;
        this.typesOfCustomer = typesOfCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypesOfCustomer() {
        return typesOfCustomer;
    }

    public void setTypesOfCustomer(String typesOfCustomer) {
        this.typesOfCustomer = typesOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                " id customer= " + idCustomer +
                " types of customer= " + typesOfCustomer +
                " address= " + address +
                '}';
    }
    public List<String> getInfotoCustomer(){
        return Collections.singletonList(super.getInfoToPerson() + "," + getIdCustomer() + ","
                + getTypesOfCustomer() + "," + getAddress());
    }
}
