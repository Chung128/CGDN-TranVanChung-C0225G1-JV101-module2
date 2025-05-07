package case_study_furama.model;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceId, String serviceName, double useArea, double price, int peoples,String rentalRoom, String freeService) {
        super(serviceId, serviceName, useArea, price, peoples,rentalRoom);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room {" +
                " freeService= " + freeService +
                '}';
    }
}
