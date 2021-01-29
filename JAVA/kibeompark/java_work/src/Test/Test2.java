package Test;

import java.util.Scanner;

class ScoreCalculator {
    private int numOfPerson;
    private int[] score;
    private int sum;
    private float avg;

    private Scanner scan;

    public ScoreCalculator(int numOfPerson) {
        scan = new Scanner(System.in);
        this.numOfPerson = numOfPerson;
        score = new int[numOfPerson];
        sum = 0;

        System.out.printf("%d명의 점수를 입력하세요. ", numOfPerson);
        for (int i = 0; i < numOfPerson; i++) {
            score[i] = scan.nextInt();
        }
    }

    public void calculateScore() {
        for (int i = 0; i < numOfPerson; i++) {
            sum += score[i];
        }

        avg = sum / (float) numOfPerson;
    }

    public void printScore() {
        for (int i = 0; i < numOfPerson; i++) {
            System.out.printf("사용자 %d : %d점\t", i + 1, score[i]);
        }
        System.out.println();

        System.out.printf("점수 합계 : %d점\n", sum);
        System.out.printf("점수 평균 : %.2f점\n", avg);
    }
}

public class Test2 {
    private static final int PERSON = 3;

    public static void main(String[] args) {
        // 클래스를 사용하여 사용자 입력으로 점수를 받고
        // 평균을 산출하는 프로그램을 작성해 보자 !
        ScoreCalculator sc = new ScoreCalculator(PERSON);

        sc.calculateScore();
        sc.printScore();
    }
}
