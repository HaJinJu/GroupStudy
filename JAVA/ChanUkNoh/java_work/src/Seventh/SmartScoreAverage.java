package Seventh;

class ScoreCalculator {
    // 개수가 미정인 배열, 변수
    int[] scores;
    float avg;

    public void setRandomScores() {
        int loop = (int)(Math.random() * 11) + 10;

        scores = new int[loop];

        for (int i = 0; i < loop; i++) {
            scores[i] = (int)(Math.random() * 101);
        }
    }

    // Alt + Insert 이후
    // 생성자(Constructor), Getter & Setter를 선택해서
    // 필요한 정보에 대한 자동완성 기능을 활용할 수 있다.

    // 메서드의 구성
    // public은 접근제한자라고 부른다
    // public 리턴타입 메서드이름(입력인자) {
    //     메서드의 본문(내용: 알고리즘)
    // }

    public float calcAverage() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg= sum /scores.length;

        return avg;
    }

}

public class SmartScoreAverage {
    public static void main(String[] args) {
    ScoreCalculator sc1 = new ScoreCalculator();

    sc1.setRandomScores();
    System.out.println("3반의 평균 = " + sc1.calcAverage());

    ScoreCalculator sc2 = new ScoreCalculator();
    sc2.setRandomScores();
    System.out.println("7반의 평균 = " + sc2.calcAverage());
    }
}
