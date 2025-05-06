package case_study_furama.model;

import java.util.Arrays;

public abstract class Facility {
    private int serviceId;
    private String serviceName;
    private double useArea;
    private double price;
    private int peoples;
    private final String[] RENTAL_ROOM={"year","month","day","hour"};

    public Facility() {
    }

    public Facility(int serviceId, String serviceName, double useArea, double price, int peoples) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.price = price;
        this.peoples = peoples;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
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

    public String[] getRENTAL_ROOM() {
        return RENTAL_ROOM;
    }

    @Override
    public String toString() {
        return "ServiceFurama{" +
                " serviceId= " + serviceId +
                " serviceName= " + serviceName +
                " useArea= " + useArea +
                " price= " + price +
                " peoples= " + peoples +
                " RENTAL_ROOM= " + Arrays.toString(RENTAL_ROOM) +
                '}';
    }
}
