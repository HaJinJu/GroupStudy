package Seventh;
class ScoreCalculator {
    // 개수가 미정이 배열 변수
    int[] scores;
    float avg;

    public void setRandomScores() {
        int loop = (int)(Math.random() * 11) + 10;

        scores = new int[loop];

        for(int i = 0; i < loop; i++) {
            scores[i] = (int)(Math.random() * 101);
        }
    }


    // 매서드의 구성
    // public은 무조건 붙는다고 가정
    // 좀 더 디테일 하게 보자면 public 자리는 접근제한


    // public 리턴타입(float) 매서드이름(입력인자){
    // 자        매서드의 본문(내용 : 알고리즘)
    // }
    public float calcAverage() {
        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg = sum / scores.length;

        return avg;
        // 평균(avg)의 값을 반환하여 avg 변수에 대입하는 것인지? ㅡ> 리턴 값은 통일해야한다.
        // (float이면 float끼리- 상위 클래스에서 먼저 확인 후 통일 값을 확인해야한다.)
    }
}


public class SmartScoreAverage {
    public static void main(String[] args) {
        ScoreCalculator sc = new ScoreCalculator();

        sc.setRandomScores();
        System.out.println("3반 평균을 구합니다.");
        System.out.println("평균 = " + sc.calcAverage());

        ScoreCalculator sc2 = new ScoreCalculator();
        sc2.setRandomScores();
        System.out.println("7반 평균을 구합니다.");
        System.out.println("평균 = " + sc2.calcAverage());
    }
}