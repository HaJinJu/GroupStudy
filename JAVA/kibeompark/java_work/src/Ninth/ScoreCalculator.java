package Ninth;

public class ScoreCalculator {
    int studentNum;
    int[] score;
    float mean;
    float variance;
    float stdDeviation;

    public ScoreCalculator() {
        this.studentNum = (int) (Math.random() * 11) + 10;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    public void calcMean() {
        int sum = 0;

        for (int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        mean = sum / (float)studentNum;
    }

    public float getMean() {
        return mean;
    }

    public void calcVariance() {
        int sum = 0;

        // sigma (샘플 - 평균)^2 / 전체 숫자 = 분산
        for (int i = 0; i < studentNum; i++) {
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
        stdDeviation = (float)(Math.sqrt(variance));
    }

    public float getStdDeviation() {
        return stdDeviation;
    }

    public void printScores() {
        int cnt = 1;

        for (int i = 0; i < studentNum; i++) {
            System.out.printf("%4d", score[i]);

            if (cnt % 10 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}

/*
class ScoreCalculator {
    int classNum, studentNum;
    int[][] score;
    float[] mean, varian, stdDev;
    int maxMean, maxStdDev, minStdDev;

    public ScoreCalculator(int classNum, int studentNum) {
        this.classNum = classNum;
        this.studentNum = studentNum;

        score = new int[classNum][studentNum];
        mean = new float[classNum];
        varian = new float[classNum];
        stdDev = new float[classNum];

        for (int i = 0; i < classNum; i++) {
            System.out.printf("%d반 성적 :", i + 1);
            for (int j = 0; j < studentNum; j++) {
                score[i][j] = (int) (Math.random() * 101);
                System.out.printf("%4d", score[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void calcMean() {
        int sum = 0;

        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                sum += score[i][j];
            }

            mean[i] = sum / (float) studentNum;
            sum = 0;
        }
    }

    public void calcVarian() {
        int sum = 0;

        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                sum += Math.pow(score[i][j] - mean[i], 2);
            }

            varian[i] = sum / (float) studentNum;
            sum = 0;
        }
    }

    public void calcStdDev() {
        for (int i = 0; i < classNum; i++) {
            stdDev[i] = (float) (Math.sqrt(varian[i]));
        }
    }

    public void findMaxMin() {
        maxMean = 0;
        maxStdDev = 0;
        minStdDev = 0;

        for (int i = 1; i < classNum; i++) {
            if (mean[maxMean] < mean[i]) {
                maxMean = i;
            }

            if (stdDev[maxStdDev] < stdDev[i]) {
                maxStdDev = i;
            }

            if (stdDev[minStdDev] > stdDev[i]) {
                minStdDev = i;
            }
        }
    }

    public int getMaxMean() {
        return maxMean;
    }

    public int getMaxStdDev() {
        return maxStdDev;
    }

    public int getMinStdDev() {
        return minStdDev;
    }
}
 */