package ss18_thread.thuc_hanh.xay_dung_ung_dung_dem_so;

public class BuildCount implements Runnable{
    private Thread myThreead;

    public BuildCount(){
        myThreead=new Thread(this,"My runnable thread");
        System.out.println("My thread created"+myThreead);
        myThreead.start();
    }
    public Thread getMyThreead(){
        return  myThreead;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("printing the count "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted.");
        }
        System.out.println("My thread run is over .");
    }
}
