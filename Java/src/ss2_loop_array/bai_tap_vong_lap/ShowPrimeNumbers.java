package ss2_loop_array.bai_tap_vong_lap;

public class ShowPrimeNumbers {
    public static void main(String[] args) {
        int numbers = 0;
        int resuilt = 0;
        while (numbers < 20) {
            int count = 0;
            for (int i = 1; i <= resuilt; i++) {
                if (resuilt % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(resuilt);
                numbers++;
            }
            resuilt++;
        }
    }
}
