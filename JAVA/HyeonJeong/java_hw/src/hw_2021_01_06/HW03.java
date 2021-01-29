package hw_2021_01_06;

public class HW03 {
    public static void main(String[] args) {
       // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
       // 위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!

        final int NTH = 20;

        int[] series = new int[NTH];
        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        for(int i = 3; i < series.length; i++) {
            series[i] = series[i - 3] + series[i - 1];
            System.out.printf("series[%d] = %d\n", i, series[i]);
        }
    }
}
