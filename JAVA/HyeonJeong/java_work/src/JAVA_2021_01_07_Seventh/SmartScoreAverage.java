package JAVA_2021_01_07_Seventh;

class ScoreCalculator {
    // 개수가 미정인 배열 변수
    int[] scores;
    float average;

    public void setRandomScores() {
        int student = (int)(Math.random() * 11) + 10;
        // (int)(Math.random() * 11): 0 ~ 10 + 10 => 10 ~ 20
        // 학생의 수를 최소 10명 ~ 최대 20명까지 랜덤값으로 입력
        scores = new int[student]; // 학생의 수 만큼 배열 생성

        for(int i = 0; i < student; i++) { //i는 0부터 학생수 만큼
            scores[i] = (int)(Math.random() * 101);
            // 0 ~ 100 까지 랜덤한 점수를 학생배열에 저장
        }
    }

    public float calcAverage() {
        int sum = 0;

        for(int i = 0; i < scores.length; i++) { //i는 0부터 점수의 길이만큼
            sum += scores[i];// 점수를 모두 더한다
        }
        average =  sum / scores.length; // (평균 = 총합/점수의 길이)

        return average;
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
