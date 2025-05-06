package ss18_thread.thuc_hanh.xay_dung_ung_dung_dem_so;

public class Main {
    public static void main(String[] args) {
        BuildCount count=new BuildCount();
        try {
            while (count.getMyThreead().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
