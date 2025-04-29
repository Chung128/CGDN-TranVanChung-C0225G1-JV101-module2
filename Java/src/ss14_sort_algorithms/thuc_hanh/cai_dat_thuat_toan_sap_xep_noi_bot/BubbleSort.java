package ss14_sort_algorithms.thuc_hanh.cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    public static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            /* Mảng có thể được sắp xếp và không cần lần duyệt tiếp theo */
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    /* Đổi chỗ list[j] với list[j + 1] */
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;/* Vẫn cần lần vượt qua tiếp theo */
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
