package ClassList;

public class CalcAverage extends InputString {
    private final String INTRODUCTION = "국영수 점수의 평균을 계산합니다.\n";
    private final String INPUTKOR = "국어 점수를 입력하세요 : ";
    private final String INPUTENG = "영어 점수를 입력하세요 : ";
    private final String INPUTMATH = "수학 점수를 입력하세요 : ";
    private final String PRINTKOR = "국어 점수는 ";
    private final String PRINTENG = ", 영어 점수는 ";
    private final String PRINTMATH = ", 수학 점수는 ";
    private final String PRINTAVG = "당신의 국영수 평균 점수는 ";
    private final int SUBJECTNUM = 3;

    private int scoreKor, scoreEng, scoreMath;
    private float scoreAvg;


    public CalcAverage() {
        System.out.println(INTRODUCTION);
    }

    // 국어, 영어, 수학 점수 입력받음
    public void rcvInputScore() {
        rcvInputStr(INPUTKOR);
        scoreKor = Integer.parseInt(getInputStr());

        rcvInputStr(INPUTENG);
        scoreEng = Integer.parseInt(getInputStr());

        rcvInputStr(INPUTMATH);
        scoreMath = Integer.parseInt(getInputStr());
    }

    // 평균 점수를 계산한 뒤 소수점 2번째 자리까지 저장함
    public void calculateAvg() {
        float temp = (float)(scoreKor + scoreEng + scoreMath) / SUBJECTNUM;
        scoreAvg = Float.parseFloat(String.format("%.2f", temp));
    }

    public void printScoreAvg() {
        System.out.println();
        System.out.print(PRINTKOR + scoreKor);
        System.out.print(PRINTENG + scoreEng);
        System.out.println(PRINTMATH + scoreMath);
        System.out.println(PRINTAVG + scoreAvg);
    }
}