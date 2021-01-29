package Sixth_Homework;

import java.util.Random;

//float 형 배열에 랜덤 값 3 개를 입력해보자!
public class Fourth {
    public static void main(String[] args) {
        float[]number = new float[3];
        Random rand = new Random();

        for(int i = 0; i < number.length; i++)  {
            number[(int) i] = (float)(Math.random()) ;
            System.out.printf("arr[%d] = %f\n" ,i , number[(int) i]);
        }

    }
}


