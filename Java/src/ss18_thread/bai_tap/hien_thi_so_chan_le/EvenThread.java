package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class EvenThread extends Thread{
    public void run(){
        try {
            for (int i = 1; i <=10 ; i++) {
                if (i%2==0){
                    System.out.println("Number: "+i);
                    Thread.sleep(15);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
