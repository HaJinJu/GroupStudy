package Sixth.Homework;

public class Homework04 {
    public static void main(String[] args) {
        //4) float 형 배열에 랜덤 값 3 개를 입력해보자!
        float[] arr = new float[3];

        for(int i = 0; i < arr.length; i++){
            float randNum = (float) Math.random();
            arr[i] = randNum;
            System.out.printf("arr[%d] = %f\n",i , arr[i]);
        }

//
    }
}
