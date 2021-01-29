package Test01;

import java.util.Scanner;

class InputNum {
    Scanner scan;
    private int[] scoreNum;
    int personNum;

    public InputNum() { // 1번 문제 생성자
        scan = new Scanner(System.in);
    }

    public InputNum(int personNum) { // 2번 문제 생성자
        scan = new Scanner(System.in);
        this.personNum = personNum;

        scoreNum = new int[personNum];
    }

    public void inputNumber() {
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();

        System.out.printf("당신의 입력값은 %d입니다.", num);
    }

    public void inputScore() {
        System.out.println("사용자의 점수를 입력해주세요.");

        for(int i = 0; i < personNum; i++) {
            scoreNum[i] = scan.nextInt();
            // System.out.printf("사용자%d 점수 : %d\n", i + 1, scoreNum[i]);
        }
    }

    public void avgScore(int[] arr) {
        int sum = 0;

        for(int i = 0; i < personNum; i++) {
            sum += arr[i];
        }

        int avg = sum / personNum;
        System.out.println("사용자들의 평균 : " + avg);
    }

    public int[] getScoreNum() {
        return scoreNum;
    }
}

public class Test01_01 {
    public static void main(String[] args) {
        // 클래스를 사용하여 사용자의 입력을 받는 프로그램을 작성해보자
        InputNum in = new InputNum();

        in.inputNumber();
    }
}
