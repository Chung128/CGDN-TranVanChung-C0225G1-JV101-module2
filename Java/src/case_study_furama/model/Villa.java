package case_study_furama.model;

import java.util.Collections;
import java.util.List;

public class Villa extends Facility {
    private String roomStandards;
    private double poolArea;
    private int floor;

    public Villa(String serviceId, String serviceName, double useArea, double price, int peoples,String rentalRoom, String roomStandards, double poolArea, int floor) {
        super(serviceId, serviceName, useArea, price, peoples,rentalRoom);
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
                super.getInforToFacility()+
                " roomStandards= " + roomStandards +
                " poolArea= " + poolArea +
                " floor= " + floor +
                '}';
    }
    public List<String> getInforToVilla(){
        return Collections.singletonList(super.getInforToFacility() + "," + getRoomStandards() + "," + getPoolArea() + "," + floor);
    }
}
