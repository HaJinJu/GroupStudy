package FirstRegularTest;

import java.util.Scanner;

class Average{
    int score;
    int firstStudent;
    int secondStudent;

    public void scoreScan(){
        Scanner S = new Scanner(System.in);
        System.out.print("1번 학생의 점수를 입력하세요 : ");
        firstStudent = S.nextInt();
        System.out.print("2번 학생의 점수를 입력하세요 : ");
        secondStudent = S.nextInt();

        System.out.println("1번 학생의 점수는 :" + firstStudent +
                            "\n2번 학생의 점수는 :" + secondStudent);
    }
    public void averageScore(){
        int avCal;
        avCal = (firstStudent + secondStudent)/2;
        System.out.println("두학생의 평균은 : " + avCal + "입니다.");
    }
}

public class Second {
    //클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램을 작성해보자!
    public static void main(String[] args) {
        Average cA = new Average();
        cA.scoreScan();
        cA.averageScore();

    }
}
