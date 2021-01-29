package Sixth_Quiz;

import java.util.Random;

public class SixthQuiz2 {
    public static void main(String[] args) {
        //1번문제 : 7개 짜리 int 형 배열을 만들어보자!
        //1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

        final int FIXNUM = 100;
        Random rand =new Random();

        int[] arr= new int[7];


        for (int i =0;i <7;i++){
            int num =rand.nextInt(FIXNUM)+1;
            arr[i] = num;
            System.out.printf("arr[%d] = %d\n", i+1,arr[i]);



        }




    }
}
