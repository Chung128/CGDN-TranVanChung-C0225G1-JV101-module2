package ss4_oop.bai_tap.xay_dung_lop_stopwatch;

public class StopWatch {
    double startTime, endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void startTime() {
        setStartTime(System.currentTimeMillis());
    }

    public void stopTime() {
        setEndTime(System.currentTimeMillis());
    }

    public double getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
