package Homework0106;

import java.util.Random;

public class Homework04 {
    public static void main(String[] args) {
        //float 형 배열에 랜덤 값 3 개를 입력해보자!

        Random rand = new Random();

        float[] arr = new float[3];

        for(int i = 0; i < 3; i++){
            arr[i] = rand.nextFloat();

            //System.out.println("arr["+i+"]"+"=" + arr[i]);
            System.out.printf("arr[%d] = %f\n",i, arr[i]);

        }
    }
}
