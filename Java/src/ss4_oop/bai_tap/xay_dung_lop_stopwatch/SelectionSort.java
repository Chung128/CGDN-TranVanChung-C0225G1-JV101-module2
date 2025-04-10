package ss4_oop.bai_tap.xay_dung_lop_stopwatch;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        selectionSort(array);
        stopWatch.stopTime();
        System.out.println("The execution time of selection sort is : " + stopWatch.getElapsedTime()+" ms");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
