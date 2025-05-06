package ss18_thread.bai_tap.tao_thread_don_gian;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number: " + i + "- HashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //tạo 2 đối tượng mới
        NumberGenerator number1 = new NumberGenerator();
        NumberGenerator number2 = new NumberGenerator();

        //Tạo 2 Thread với đối tượng mới
        Thread thread1 = new Thread(number1);
        Thread thread2 = new Thread(number2);

        //Đặt priority
        thread1.setPriority(Thread.MAX_PRIORITY);// ưu tiên cao nhất
        thread2.setPriority(Thread.MIN_PRIORITY);// ưu tiên thấp nhất

        //Bắt đầu 2 thread
        thread1.start();
        thread2.start();
    }
}
