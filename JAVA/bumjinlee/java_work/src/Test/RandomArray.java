package Test;

import java.util.Arrays;

public class RandomArray {
    private final int ARRAYSIZE = 50;
    private int[] arr;

    public RandomArray() {
        arr = new int[ARRAYSIZE];
    }

    public void PrintArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ARRAYSIZE) + 1;
            System.out.printf("arr[%d] %d \n", i, arr[i]);
        }
    }

    public void PrintSortArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ARRAYSIZE) + 1;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

