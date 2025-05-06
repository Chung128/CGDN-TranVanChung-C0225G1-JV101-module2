package case_study_furama.model;

public class House extends Facility {
    private String roomStandards;
    private int floors;

    public House(int serviceId, String serviceName, double useArea, double price, int peoples, String roomStandards, int floors) {
        super(serviceId, serviceName, useArea, price, peoples);
        this.roomStandards = roomStandards;
        this.floors = floors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House {" +
                " roomStandards= " + roomStandards +
                " floors=" + floors +
                '}';
    }
}
