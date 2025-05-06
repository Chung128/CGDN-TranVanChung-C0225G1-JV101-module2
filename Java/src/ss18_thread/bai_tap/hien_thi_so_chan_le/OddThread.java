package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class OddThread extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                if (i%2==1){
                    System.out.println("Number: "+ i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
