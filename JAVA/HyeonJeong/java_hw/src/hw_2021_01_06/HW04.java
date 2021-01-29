package hw_2021_01_06;

public class HW04 {
    public static void main(String[] args) {
        // float 형 배열에 랜덤 값 3 개를 입력해보자!

        final int NUM = 3;

        float[] f_series = new float[NUM];

        for(int i = 0; i < f_series.length; i++){
            float randomNum = (float)(Math.random() * 10);
            f_series[i] = randomNum;

            System.out.printf("array[%d] = %.3f\n", i, f_series[i]);
        }

    }
}
