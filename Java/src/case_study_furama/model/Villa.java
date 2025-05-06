package case_study_furama.model;

public class Villa extends Facility {
    private String roomStandards;
    private double poolArea;
    private int floor;

    public Villa(int serviceId, String serviceName, double useArea, double price, int peoples, String roomStandards, double poolArea, int floor) {
        super(serviceId, serviceName, useArea, price, peoples);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.floor = floor;
    }



    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Override
    public String toString() {
        return "Villa {" +
                " roomStandards= " + roomStandards +
                " poolArea= " + poolArea +
                " floor= " + floor +
                '}';
    }
}
