package ss2_loop_array.bai_tap;

public class ShowPrimeNumbersMax100 {
    public static void main(String[] args) {
        int numbers = 0;
        int resuilt = 0;
        while (true) {
            int count = 0;
            for (int i = 1; i <= resuilt; i++) {
                if (resuilt % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(resuilt);
                numbers++;
            }
            if (resuilt < 100) {
                resuilt++;
            } else {
                break;
            }
        }
    }
}
