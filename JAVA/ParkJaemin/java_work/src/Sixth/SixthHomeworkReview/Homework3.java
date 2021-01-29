package Sixth.SixthHomeworkReview;

public class Homework3 {
    public static void main(String[] args) {

        final int FIXVALUE = 20;
        final int START = 3;

        int[] series = new int[FIXVALUE];

        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        for(int i = START; i < FIXVALUE; i++) {
            series[i] = series[i - 3] + series[i - 1];
            System.out.printf("series[%d] = %d\n", i, series[i]);
        }

        System.out.printf("이 수열의 20 번째 항은 = " + series[FIXVALUE - 1]);

        }
    }
