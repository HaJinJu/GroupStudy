package Sixth.Homework;


import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
        //2) 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!
        //float[] arr = new float[3];
        //
        //        for(int i = 0; i < arr.length; i++){
        //            float randNum = (float) Math.random();
        //            arr[i] = randNum;
        //            System.out.printf("arr[%d] = %f\n",i , arr[i]);


        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int randNum = rand.nextInt(10);
//            int randNum = (int)(Math.random()*100);
            arr[i] = randNum;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);


        }
    }
}
