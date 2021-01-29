/*
    < 문제 4 >

float 형 배열에 랜덤 값 3 개를 입력해보자!

 */


public class SixthTask4 {
    public static void main(String[] args) {
        float[] arr = new float[3];
        float randNum;

        for(int i = 0; i < arr.length; i++) {
            randNum = (float)(Math.random() * 100) + 1;           // 1 ~ 100 사이의 랜덤 값을 할당
            arr[i] = randNum;
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }
    }
}
