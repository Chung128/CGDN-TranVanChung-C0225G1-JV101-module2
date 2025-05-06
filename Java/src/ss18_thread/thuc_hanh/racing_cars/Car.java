package ss18_thread.thuc_hanh.racing_cars;

import java.util.Random;

import static ss18_thread.thuc_hanh.racing_cars.Main.DISTANCE;
import static ss18_thread.thuc_hanh.racing_cars.Main.STEP;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        Ký hiệu = đánh dấu quãng đường mà xe đã đi qua
//        Ký hiệu > đánh dấu xe đang ở vị trí đó
//        Ký hiệu - đánh dấu quãng đường còn lại về đích
//        Ký hiệu | đánh dấu xuất phát và đích
        // điểm bắt đầu thì km=0
        int runDistance = 0;
        //khởi tạo thời gian bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                //random tốc độ km/h
                int speed = (new Random()).nextInt(20);
                //tính khoảng cách đã đi được
                runDistance += speed;
                // đường đi của xe
                String log = "Start |";
                int percentOfTrave = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentOfTrave >= i + STEP) {
                        log += "=";
                    } else if (percentOfTrave >= i && percentOfTrave < i + STEP) {
                        log += ">";
                    } else {
                        log += "-";
                    }
                }
                log += "|| Finish";
                System.out.println("Car " + name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + name + " broken..");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
