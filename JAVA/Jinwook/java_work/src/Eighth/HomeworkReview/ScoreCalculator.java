package Eighth.HomeworkReview;

public class ScoreCalculator {
    int studentNum;
    int[] score;
    float mean;
    float variance;
    float stdDeviation;

    // 생성자 통한  랜덤학생수,랜덤학생수 배열을 설정하고, 그 배열안에 랜덤 점수을 배정
    public ScoreCalculator() {
        this.studentNum = (int)(Math.random() * 11) + 10;

        score = new int[studentNum];

        for(int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    // 생성자 for 학생수 입력하여 배열 갯수, 그 개수 안에 50-100점 배정
    public ScoreCalculator(int studentNum) {
        this.studentNum = studentNum;

        score = new int[studentNum];

        for(int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    //평균 구하는 메소드
    public void calcMean() {
        // sum 초기값 배정
        int sum = 0;

        // 0부터 학색수 까지 모든 배열안의 점수 합산하는 식
        for(int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        //합산한 점수를 학생수로 나눈 값 = 평균 ---> float형 해야함 0.xxxx가 나오니깐
        mean = sum / (float)studentNum;
    }

    // Mean(평균)을 float 형으로 얻기 위한 게터 메소드
    public float getMean() {
        return mean;
    }

    // 분산 구하는 메소드
    public void calcVariance() {
        float sum = 0;

        // sigma (샘플 - 평균)^2 / 전체숫자 = 분산
        for(int i = 0; i < studentNum; i++) {
            // 제곱
            sum += Math.pow(score[i] - mean, 2);
        }

        variance = sum / (float)studentNum;
    }

    public float getVariance() {
        return variance;
    }

    public void calcStdDeviation() {
        // 루트
        // 표준편차  = 분산의 루
        stdDeviation = (float)Math.sqrt(variance);
    }

    public float getStdDeviation() {
        return stdDeviation;
    }

    public void printScores() {
        //cnt 후 엔터를 하기 위해 int cnt =1 을 넣음
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
