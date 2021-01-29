package Eighth;

public class ExtraQuiz3 {
    public static void main(String[] args) {
        System.out.printf("3) 학급에 학생이 20 명 있다.\n" +
                "   각 학생의 성적을 랜덤으로 기록해준다(입력으로 받으면 힘드니까)\n" +
                "   전체 학생들의 평균을 구하고 표준편차와 분산을 구해보자\n" +
                "   (\n" +
                "   (분산과 표준편차 공식을 잘 모른다면 패스해도 OK)\n");
        AvgStanDeviVariance adv = new AvgStanDeviVariance();
        adv.setScore(20);
        adv.getAverage();
        adv.scoreCalculator(20);
        adv.getCalcVariance();
        System.out.println("이 반의 분산은 = " + adv.getVariance());

        adv.calcStdDeviation();
        System.out.println(
                "이 반의 표준편차는 = " + adv.getStdDeviation());





    }
}
