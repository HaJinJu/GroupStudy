package Eighth.HomeworkReview;

class ScoreCalculator {
    int studentNum;
    int[] score;
    float mean;
    float variance;
    float stdDeviation;

    public ScoreCalculator() {
        this.studentNum = (int) (Math.random() * 11) + 10;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int) (Math.random() * 51) + 50;
        }
    }

    public ScoreCalculator(int studentNum) {
        System.out.println("안녕 ~ 나는 생성자야!");
        this.studentNum = studentNum;

        score = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            score[i] = (int) (Math.random() * 51) + 50;
        }
    }

    public void calcMean() {
        int sum = 0;

        for (int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        mean = sum / (float) studentNum;
    }

    public float getMean() {
        return mean;
    }

    public void calcVariance() {
        float sum = 0;

        // sigma (샘플 - 평균)^2 / 전체숫자 = 분산
        for (int i = 0; i < studentNum; i++) {
            // 제곱
            sum += Math.pow(score[i] - mean, 2);
        }

        variance = sum / (float) studentNum;
    }

    public float getVariance() {
        return variance;
    }

    public void calcStdDeviation() {
        // 루트
        stdDeviation = (float) Math.sqrt(variance);
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

public class Homework9 {
    public static void insertSort(float[] arr, int[] cn) {
        int i, j, classKey, len = arr.length;
        float arrKey;

        for (i = 1; i < len; i++) {
            arrKey = arr[i];
            classKey = cn[i];

            for (j = i - 1; (j != -1) && (arr[j] > arrKey); j--) {
                arr[j + 1] = arr[j];
                cn[j + 1] = cn[j];
            }

            arr[j + 1] = arrKey;
            cn[j + 1] = classKey;
        }
    }

    public static void printMax(ScoreCalculator[] arr) {
        System.out.printf("\n뭐야 ? 나 호출된거임 ?\n");

        int len = arr.length;

        float[] mean = new float[len];
        float[] stdDev = new float[len];
        int[] classArr = new int[len];


        for (int i = 0; i < len; i++) {
            classArr[i] = i + 1;
            mean[i] = arr[i].getMean();
            stdDev[i] = arr[i].getStdDeviation();
        }

        insertSort(mean, classArr);
        System.out.printf(
                "\n%d 반이 평균 최고점(%f)을 받았습니다.\n\n",
                classArr[len - 1], mean[len - 1]);

        for (int i = 0; i < len; i++) {
            classArr[i] = i + 1;
        }

        insertSort(stdDev, classArr);
        System.out.printf(
                "\n%d 반이 표준편차 최저점(%f)을 받았습니다.\n\n",
                classArr[0], stdDev[0]);
    }

    public static void main(String[] args) {
        final int FIXSIZE = 3;

        // 클래스 배열을 작성하는 방법
        // 1. 우선 배열을 선언하는것과 동일하게 접근한다.
        //    ex) int[] arr = new int[공간개수]
        //    클래스 배열도 위의 방식과 똑같다.
        //    ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE]
        //    단순히 공간만 만들었다 - 클래스가 사용할 수 있는 상태는 아니다.
        ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE];

        for (int i = 0; i < FIXSIZE; i++) {
            // 실제 생성자를 호출해서 배열 인덱스에 값을 할당하는 순간이 중요
            // 이렇게 할당하고나면 기존의 클래스 문제들에서 활용했듯이
            // 내부에 있는 매서드들을 활용할 수 있게 된다.
            scArr[i] = new ScoreCalculator();
            System.out.printf("\n%d 반\n", i + 1);
            scArr[i].printScores();
            scArr[i].calcMean();
            scArr[i].calcVariance();
            scArr[i].calcStdDeviation();
            System.out.printf("\n평균 = %f, 분산 = %f, 표준편차 = %f\n",
                    scArr[i].getMean(),
                    scArr[i].getVariance(),
                    scArr[i].getStdDeviation());
        }

        // 이건 뭐지 ?
        // 얘는 new 도 안했고
        // 어디서 갑자기 튀어나왔지 ?
        printMax(scArr);

    }
}
