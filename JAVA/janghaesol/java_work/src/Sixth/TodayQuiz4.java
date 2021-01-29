package Sixth;

public class TodayQuiz4 {
    // float 형 배열에 랜덤 값 3 개를 입력해보자!
    public static void main(String[] args) {
        float [] arr = new float[3];

           for(int i = 0;i < arr.length; i++){
               float Random =(float)(Math.random());
               arr[i] = Random;
               System.out.printf("arr[%d] = %f\n"  , i, arr[i]);

        }
    }


}
