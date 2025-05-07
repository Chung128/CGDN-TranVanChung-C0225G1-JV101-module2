package case_study_furama.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double useArea;
    private double price;
    private int peoples;
    private String rentalRoom; //{"year","month","day","hour"};

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double useArea, double price, int peoples, String rentalRoom) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.price = price;
        this.peoples = peoples;
        this.rentalRoom = rentalRoom;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public String getRentalRoom() {
        return rentalRoom;
    }

    public void setRentalRoom(String rentalRoom) {
        this.rentalRoom = rentalRoom;
    }

    @Override
    public String toString() {
        return "ServiceFurama{" +
                " serviceId= " + serviceId +
                " serviceName= " + serviceName +
                " useArea= " + useArea +
                " price= " + price +
                " peoples= " + peoples +
                " rentalRoom= " + rentalRoom +
                '}';
    }

    public List<String> getInforToFacility() {
        return Collections.singletonList(getServiceId() + "," + getServiceName() + "," + getUseArea()
                + "," + getPrice() + "," + getPeoples() + "," + getRentalRoom());
    }
}
