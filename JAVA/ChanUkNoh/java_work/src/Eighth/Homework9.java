package Eighth;

import java.util.Scanner;

class ScoreManageSystem {
//    9) 오늘 풀었던 평균, 분산, 표준편차를 활용해서
//    점수 관리 시스템을 만들어보자!
//    학급을 3개 정도 만들고 랜덤한 점수를 준다.
//    평균이 가장 높은 학급,
//    표준편차가 가장 낮은 학급,
//    표준편차가 가장 큰 학급을 선별하도록 프로그래밍 해보자!
    final int STUDENT = 20;
    int i;
    final int AVERAGE = 0;
    final int TOPDEVIATION = 1;
    final int LOWERDEVIATION = 2;

    int[] class1 = new int[STUDENT];
    int[] class2 = new int[STUDENT];
    int[] class3 = new int[STUDENT];

    public void dispenseScore() {

        for (i = 0; i < STUDENT; i++) {
            class1[i] = (int)(Math.random() * 51) + 50;
            class2[i] = (int)(Math.random() * 51) + 50;
            class3[i] = (int)(Math.random() * 51) + 50;
        }
    }

    int class1Sum = 0;
    int class2Sum = 0;
    int class3Sum = 0;

    public void sumScore() {

        for (i = 0; i < STUDENT; i++) {
            class1Sum += class1[i];
            class2Sum += class2[i];
            class3Sum += class3[i];
        }
    }

    float class1Average;
    float class2Average;
    float class3Average;

    public void calcAverage() {
        class1Average = class1Sum / (float)STUDENT;
        class2Average = class2Sum / (float)STUDENT;
        class3Average = class3Sum / (float)STUDENT;
    }

    float class1Variance;
    float class2Variance;
    float class3Variance;

    public void calcVariance() {
        float sum1 = 0;
        float sum2 = 0;
        float sum3 = 0;

        for(int i = 0; i < STUDENT; i++) {
            sum1 += Math.pow(class1[i] - class1Average, 2);
            sum2 += Math.pow(class1[i] - class2Average, 2);
            sum3 += Math.pow(class1[i] - class3Average, 2);
        }
        class1Variance = sum1 / (float)STUDENT;
        class2Variance = sum2 / (float)STUDENT;
        class3Variance = sum3 / (float)STUDENT;
    }

    float class1Deviation;
    float class2Deviation;
    float class3Deviation;

    public void calcDeviation() {
        class1Deviation = (float)Math.sqrt(class1Variance);
        class2Deviation = (float)Math.sqrt(class2Variance);
        class3Deviation = (float)Math.sqrt(class3Variance);
    }

    public void pickTopClass(final int ORDER) {

        switch (ORDER) {
            case AVERAGE:

                if (class1Average > class2Average) {
                    if (class1Average > class3Average) {
                        System.out.println("반 평균 1등은 1반입니다.");
                    }
                } else if (class2Average > class3Average) {
                    System.out.println("반 평균 1등은 2반입니다.");
                } else {
                    System.out.println("반 평균 1등은 3반입니다.");
                }

                if (class1Average == class2Average) System.out.printf("1반 평균: %d 2반 평균: %d - 동률\n", class1Average, class2Average);
                if (class1Average == class3Average) System.out.printf("1반 평균: %d 3반 평균: %d - 동률\n", class1Average, class3Average);
                if (class2Average == class3Average) System.out.printf("2반 평균: %d 3반 평균: %d - 동률\n", class2Average, class3Average);
                System.out.println("성적 차트: ");
                System.out.println("1반 - " + class1Average);
                System.out.println("2반 - " + class2Average);
                System.out.println("3반 - " + class3Average);
                break;

            case TOPDEVIATION:

                if (class1Deviation > class2Deviation) {
                    if (class1Deviation > class3Deviation) {
                        System.out.println("표준 편차 1등은 1반입니다.");
                    }
                } else if (class2Deviation > class3Deviation) {
                    System.out.println("표준 편차 1등은 2반입니다.");
                } else if (class2Deviation < class3Deviation) {
                    System.out.println("표준 편차 1등은 3반입니다.");
                } else {
                    System.out.println("동률 입니다");
                }
                if (class1Deviation == class2Deviation) System.out.printf("1반 표준편차: %f 2반 표준편차: %f - 동률\n", class1Deviation, class2Deviation);
                if (class1Deviation == class3Deviation) System.out.printf("1반 표준편차: %f 3반 표준편차: %f - 동률\n", class1Deviation, class3Deviation);
                if (class2Deviation == class3Deviation) System.out.printf("2반 표준편차: %f 3반 표준편차: %f - 동률\n", class2Deviation, class3Deviation);
                System.out.println("표준 편차 차트: ");
                System.out.println("1반 - " + class1Deviation);
                System.out.println("2반 - " + class2Deviation);
                System.out.println("3반 - " + class3Deviation);
                break;

            case LOWERDEVIATION:

                if (class1Deviation < class2Deviation && class1Deviation < class3Deviation) System.out.println("표준 편차 꼴등은 1반입니다.");
                if (class2Deviation < class1Deviation && class2Deviation < class3Deviation) System.out.println("표준 편차 꼴등은 2반입니다.");
                if (class3Deviation < class2Deviation && class3Deviation < class1Deviation) System.out.println("표준 편차 꼴등은 3반입니다.");

                if (class1Deviation == class2Deviation) System.out.printf("1반 평균: %d 2반 표준편차: %d - 동률\n", class1Variance, class2Variance);
                if (class1Deviation == class3Deviation) System.out.printf("1반 평균: %d 3반 표준편차: %d - 동률\n", class1Variance, class3Variance);
                if (class2Deviation == class3Deviation) System.out.printf("2반 평균: %d 3반 표준편차: %d - 동률\n", class2Variance, class3Variance);
                System.out.println("표준 편차 차트: ");
                System.out.println("1반 - " + class1Deviation);
                System.out.println("2반 - " + class2Deviation);
                System.out.println("3반 - " + class3Deviation);
                break;

            default:
                break;
        }
    }
}

public class Homework9 {
    public static void main(String[] args) {

        ScoreManageSystem sms = new ScoreManageSystem();

        sms.dispenseScore();
        sms.sumScore();
        sms.calcAverage();
        sms.calcVariance();
        sms.calcDeviation();
        sms.pickTopClass(sms.AVERAGE);
    }
}