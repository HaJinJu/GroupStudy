package Test;

import java.util.Scanner;
// 문제1. 클래스를 사용하여 사용자 입력을 받는 프로그램을 작성
// 문제2. 클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램 작성
class QuizOneTwo {
    Scanner scan;
    private final int SUBNUM = 3;
    private int firstNum;
    private int secondNum;
    private int thirdNum;
    private float sum;

    public QuizOneTwo() {
        scan = new Scanner(System.in);
    }

    public void UserScannerNum() {
        System.out.print("아무 숫자를 입력하세요 : ");
        int integer = scan.nextInt();
        System.out.println("입력된 숫자 = " + integer);
    }

    public void UserScannerString() {
        System.out.print("아무 글자를 입력하세요 : ");
        String str = scan.nextLine();
        System.out.println("입력된 글자 = " + str);
    }

    public void InsertScore() {
        System.out.println("숫자 3개를 입력해 주세요.");
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        firstNum = (int) scan.nextFloat();

        System.out.print("두번째 숫자 : ");
        secondNum = (int) scan.nextFloat();

        System.out.print("세번째 숫자 : ");
        thirdNum = (int) scan.nextFloat();
    }

    public void PrintAvg() {
        sum = firstNum + secondNum + thirdNum;
        float average = sum / (float) SUBNUM;

        System.out.println("세 숫자의 평균 = " + average);
    }
}
