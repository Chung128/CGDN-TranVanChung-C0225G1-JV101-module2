package ss2_loop_array.bai_tap_mang;

public class MaxElementInTwoArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 0, 2, 3},
                {2, 4, 0, 4, 6},
                {2, 3, 5, 7, 9, 3},
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("the max value is : " + max);
    }
}
