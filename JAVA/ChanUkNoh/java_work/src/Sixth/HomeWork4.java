package Sixth;

public class HomeWork4 {
    public static void main(String[] args) {
        // 4) float형 배열에 랜덤 값 3개를 입력해보자!

        float[] arr = new float[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)Math.random();
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}