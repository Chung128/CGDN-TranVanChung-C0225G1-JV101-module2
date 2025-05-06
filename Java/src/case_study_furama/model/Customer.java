package case_study_furama.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer extends Persons {
    private int idCustomer;
    private String[] typesOfCustomer = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    private String address;

    public Customer(String name, LocalDate birthDate, String gender, String IDCard, String phoneNumber, String email, int id, String[] typesOfCustomer, String address) {
        super(name, birthDate, gender, IDCard, phoneNumber, email);
        this.idCustomer = id;
        this.typesOfCustomer = typesOfCustomer;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String[] getTypesOfCustomer() {
        return typesOfCustomer;
    }

    public void setTypesOfCustomer(String[] typesOfCustomer) {
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
                " id= " + idCustomer +
                " typesOfCustomer= " + Arrays.toString(typesOfCustomer) +
                " address= " + address +
                '}';
    }
}
