package 정기역략평가01;

import java.util.Scanner;
class Score{
    private final int SUBJECTS = 3;
    private Scanner korScan;
    private Scanner engScan;
    private Scanner mathScan;

    private int kor;
    private int eng;
    private int math;

    private int sum;
    private float mean;

    public void socoreInsert(){
        korScan = new Scanner(System.in);
        engScan = new Scanner(System.in);
        mathScan = new Scanner(System.in);
        System.out.print("국어점수: ");
        kor = korScan.nextInt();
        System.out.print("영점수: ");
        eng = engScan.nextInt();
        System.out.print("수학점수: ");
        math = mathScan.nextInt();

    }
    public void sumScore(){
        sum = 0;
        sum += (kor + eng +math);
        mean = sum / (float)SUBJECTS;
        System.out.println("이 학생의 평균은 = " + getMean());
    }

    public float getMean() {
        return mean;
    }

}


public class Exercise02 {
    public static void main(String[] args) {
        Score sco = new Score();
        sco.socoreInsert();
        sco.sumScore();
    }
}

