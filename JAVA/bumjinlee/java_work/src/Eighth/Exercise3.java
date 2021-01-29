package Eighth;

public class Exercise3 {
    public static void main(String[] args) {

        ScoreCalculator sc = new ScoreCalculator(20);

        System.out.println("학생들의 점수를 출력합니다.");
        sc.printScores();
        System.out.println("평균: " + sc.getMean());
        System.out.println(("분산: " + sc.getVariance()));
        System.out.println("표준 편차: " + sc.getStdDeviation());
    }
}
