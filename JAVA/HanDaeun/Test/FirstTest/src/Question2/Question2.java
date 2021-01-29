/*
        < Question 2 >
클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램을 작성해보자!
*/


package Question2;

import ClassList.CalcAverage;

public class Question2 {
    public static void main(String[] args) {
        CalcAverage calcAvg = new CalcAverage();

        calcAvg.rcvInputScore();
        calcAvg.calculateAvg();
        calcAvg.printScoreAvg();
    }
}