package Homework0106;

import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
        // 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!
        Random rand = new Random();

        int[] arr = new int[7];

        for(int i = 0; i < 7; i++) {
            arr[i] = rand.nextInt();
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
