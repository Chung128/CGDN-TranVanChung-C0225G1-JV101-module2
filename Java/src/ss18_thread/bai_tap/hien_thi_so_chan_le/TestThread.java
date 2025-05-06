package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
