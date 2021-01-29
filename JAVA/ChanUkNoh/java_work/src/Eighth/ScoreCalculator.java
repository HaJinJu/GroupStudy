package Eighth;

public class ScoreCalculator {
    private int studentNum;
    private int[] score;
    private float mean;
    private float variance;
    private float stdDeviation;

    // 생성자(Constructor)
    // 사실은 new를 할 때 이 코드가 눈에 보이지 않게 내부적으로 동작한다.
    // 그러나 이와 같이 명시를 해주면 사용자가 생성자르 호출할 수 있게 된다.

    // 생성자 선언 방법
    // 1) 클래스 내부에서 메서드를 작성하는 방법과 아래의 사항을 제외하고 동일하다.

    // 메서드와 생성자의 차이점
    // 1) return타입이 없다.
    // 2) 메서드 이름이 클래스 이름과 같아야 한다.

    public ScoreCalculator(int studentNum) {
        this.studentNum = studentNum;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    public ScoreCalculator() {
        this.studentNum = (int)(Math.random() * 11) + 10;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    private void calcMean() {
        int sum = 0;

        for (int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        mean = sum / (float)studentNum;
    }

    public float getMean() {
        calcMean();
        return mean;
    }

    public float getVariance() {
        calcVariance();
        return variance;
    }

    public float getStdDeviation() {
        calcStdDeviation();
        return stdDeviation;
    }

    private void calcVariance() {
        float sum = 0;

        // sigma (샘플 - 평균)^2 / 전체숫자 = 분산
        for (int i = 0; i < studentNum; i++) {
            // pow(제곱 할 숫자, 몇 번 제곱?)
            sum += Math.pow(score[i], 2);
        }

        variance = sum / (float)studentNum;
    }

    private void calcStdDeviation() {
        // 분산에 루트를 씌우면 표준편차
        stdDeviation = (float)Math.sqrt(variance);
    }

    public void printScores() {
        int cnt = 1;

        for(int i = 0; i < studentNum; i++) {
            System.out.printf("%4d", score[i]);

            if(cnt % 10 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}
