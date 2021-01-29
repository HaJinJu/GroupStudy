package FirstRegularTest;

import java.util.Scanner;

//2. 클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램을 작성해보자!
class Average{
    int score;
    int Math;
    int English;

    public void StudentScore(){
        Scanner scan = new Scanner(System.in);
        System.out.println("수학점수를 입력하세요: " );
        Math = scan.nextInt();
        System.out.println("영어점수를 입력하세요: " );
        English = scan.nextInt();

        System.out.println("수학 :"+ Math +"영어 :" + English);
    }
    public void averageCalculate(){
        int averageCal;
        averageCal = (Math + English)/2;
        System.out.println("수학과 영어의 평균은 " + averageCal + "입니다.");
    }
}

public class Second {
    public static void main(String[] args) {
        Average SA = new Average();
        SA.StudentScore();
        SA.averageCalculate();
    }
}
