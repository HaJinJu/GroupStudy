package hw_2021_01_21;

import java.util.Scanner;

public class ScannerTest {
    Scanner scan;

    private int korean;
    private int english;
    private int math;

    public ScannerTest() {
        scan = new Scanner(System.in);
    }

    public void insertInteger() {
        System.out.print("숫자를 입력하세요: ");
        int scanInteger = scan.nextInt();
    }

    public void insertString() {
        System.out.print("글자를 입력하세요: ");
        String scanString = scan.nextLine();
    }

    public void insertScore() {
        System.out.println("시험점수를 입력해주세요!");
        Scanner scan = new Scanner(System.in);

        System.out.print("국어점수: ");
        korean = scan.nextInt();

        System.out.print("영어점수: ");
        english = scan.nextInt();

        System.out.print("수학점수: ");
        math = scan.nextInt();
    }

    public float calculateAverage(final int SUBJECTNUM) {
        int sum = korean + english + math;
        float average = sum / (float)SUBJECTNUM;
        // 평균점수를 실수로 설정하였기 때문에
        // 점수의 합을 실수로 나누어 주었다.

        return average;
    }
}
