package Test01;

public class Test01_02 {
    public static void main(String[] args) {
        // 클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램을 작성해보자
        InputNum in = new InputNum(3);

        in.inputScore();
        in.avgScore(in.getScoreNum());
    }
}
