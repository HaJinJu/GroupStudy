package Eighth;

import java.util.Arrays;

public class pblcMethod {
    private int plusSum     = 0;
    private int minusSum    = 0;

    public int sumResult(int start, int end) {

        for (int i = start; i < end; i++) {

            if (i % 3 == 0) {
                plusSum += i;
            } else if (i % 5 == 0) {
                minusSum -= i;
            }
        }

        System.out.println("plusSum = " + plusSum);
        System.out.println("minusSum = " + minusSum);

        return plusSum + minusSum;
    }

    public void makeAverage() {
        final int FIXEDNUM = 20;
        int[] student = new int[FIXEDNUM];

        int scoreSum = 0;
        float average;

        for (int i = 0; i < FIXEDNUM; i++) {
            int score = (int) (Math.random() * 101);

            student[i] = score;
            scoreSum += score;
        }
        average = scoreSum / FIXEDNUM;

        System.out.println("평균: " + average);
    }
}
