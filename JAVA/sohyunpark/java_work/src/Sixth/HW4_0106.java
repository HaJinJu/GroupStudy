package Sixth;

import java.util.Random;

public class HW4_0106 {
    public static void main(String[] args) {
        // float형 배열에 랜덤 값 3개 입력하기

        Random rand = new Random();

        float[] arr = new float[3];

        for(int i = 0; i < arr.length; i++){
           arr[i] = rand.nextFloat();
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }

    }
}

        // final int ARRSIZE = 3;

        // float[] arr = new float[ARRSIZE];

        // Random rand = new Random();

        // for(int i = 0; i < ARRSIZE; i++) {
            // nextFloat은 실수를 뽑으며 범위는 0.0 ~ 1.0
            // arr[i] = rand.nextFloat() * 10;
            // %d는 정수형, %f는 실수
            // System.out.printf("arr[%d] = %f\n", i, arr[i]);
        // }
