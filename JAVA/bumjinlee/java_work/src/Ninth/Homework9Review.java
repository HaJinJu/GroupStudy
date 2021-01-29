package Ninth;

import Eighth.ScoreCalculator;

public class Homework9Review {
    // static 키워드가 붙으면 메모리에 상주하게 된다.
    // 원래는 자바의 클래스 로더가 클래스를 찾아서 메모리에 로드(적재)해야 한다.
    // 그러나 static키워드가 붙어있으면 JVM이 동작할 때
    // static영역의 메모리가 같이 잡혀서 올라가므로
    // 별도의 new과정이 필요없어진다.
    public static void insertSort(float[] arr, int[] cn) {
        int i, j;
        int classKey;
        int len = arr.length;
        float arrKey;

        for (i = 1; i < len; i++) {
            arrKey      = arr[i];
            classKey    = cn[i];

            for (j = i - 1; (j != -1) && (arr[j] > arrKey); j--) {
                arr[j + 1] = arr[j];
                cn[j + 1] = cn[j];
            }

            arr[j + 1] = arrKey;
            cn[j + 1] = classKey;
        }
    }

    public static void printMax(ScoreCalculator[] arr) {
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
                "\n%d 반이 표준편차 최저점(%f)을 받았습니다.\n\n",
                classArr[0], stdDev[0]);
    }

    public static void main(String[] args) {
        final int FIXSIZE = 3;

        // 클래스 배열을 작성하는 방법
        // 1. 우선 배열을 선언하는 것과 동일하게 접근
        // ex) int[]             arr   = new int[size];
        //     ----------------  ----- - --- ------------------------
        //     ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE];
        // 단순히 공간을 만든다고 해서 클래스를 사용할 수 있는 상태는 아니다.
        // 배열의 요소에 객체를 할당하면 비로소 메모리에 올라감

        ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE];

        for (int i = 0; i < FIXSIZE; i++) {
            // 실제 생성자를 호출해서 배열 인덱스에 값을 할당하는 순간이 중요
            // 이렇게 할당하고나면 기존의 클래스 문제들에서 활용했듰이
            // 내부에 있는 메서드들을 활용할 수 있게 된다.
            //    scARr[0]          scArr[1]           scArr[2]
            // ScoreCalculator   ScoreCalculator    ScoreCalculator
            //  각자의 메모리가 할당된다.
            scArr[i] = new ScoreCalculator();
            System.out.printf("%d반\n", i + 1);
            scArr[i].printScores();
            System.out.printf("\n평균 = %f, 분산 = %f, 표준편차 = %f\n",
                    scArr[i].getMean(),
                    scArr[i].getVariance(),
                    scArr[i].getStdDeviation());
        }
        printMax(scArr);
    }
}
