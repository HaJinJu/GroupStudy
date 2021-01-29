package Sixth;

import java.util.Random;

public class HW2_0106 {
    public static void main(String[] args) {
        // 1번 문제에서 만든 배열에 랜덤 값을 할당하자
        Random rand = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

        // int[] arr = new int[ARRSIZE];

        // for(int i = 0; i < ARRSIZE; i++) {
            // arr[i] = (int)(Math.random() * 5) + 3;
            // System.out.printf("arr[%d] = %d\n", i, arr[i]);
        // }