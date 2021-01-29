package Sixth_Quiz;

public class SixthQuiz4 {
    public static void main(String[] args) {
        //float 형 배열에 랜덤 값 3 개를 입력해보자!
         float[] arr = new float[3];

         for (int i =0;i <3;i++){

             float rand = (float)(Math.random());
             arr[i] = rand;
             System.out.printf("arr[%d] = %f\n",i ,arr[i]);
         }

    }
}
