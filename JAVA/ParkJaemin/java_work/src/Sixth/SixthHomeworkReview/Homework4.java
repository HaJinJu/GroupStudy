package Sixth.SixthHomeworkReview;

public class Homework4 {
    public static void main(String[] args) {
        // float  형 배열에 랜덤 값 3개를 입력해보자
        float randNum = (float) Math.random();
        float[] arr = new float[3];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (Math.random()*3)+1;
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }
    }
}
