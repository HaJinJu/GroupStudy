package Eighth.Homework;

class scoreCalculatorA {
    int studentNumA;
    int studentNumB;
    int studentNumC;
    int[] scoreA;
    int[] scoreB;
    int[] scoreC;
    float meanA;
    float meanB;
    float meanC;
    float varianceA;
    float varianceB;
    float varianceC;
    float stdDeviationA;
    float stdDeviationB;
    float stdDeviationC;
    int maxmean;

    public float getMeanC() {
        return meanC;
    }

    public float getMeanB() {
        return meanB;
    }

    public float getMeanA() {
        return meanA;
    }

    public scoreCalculatorA
            (int studentNumA, int studentNumB, int studentNumC) {
        this.studentNumA = studentNumA;
        this.studentNumB = studentNumB;
        this.studentNumC = studentNumC;

        scoreA = new int[studentNumA];
        scoreB = new int[studentNumB];
        scoreC = new int[studentNumC];

        for (int i = 0; i < studentNumA; i++) {
            scoreA[i] = (int) (Math.random() * 51) + 50;
            for (int j = 0; j < studentNumB; j++) {
                scoreB[j] = (int) (Math.random() * 51) + 50;
                for (int k = 0; k < studentNumC; k++) {
                    scoreC[k] = (int) (Math.random() * 51) + 50;
                }
            }
        }
    }


    public void calcMeanA() {
        int sum = 0;

        for (int i = 0; i < studentNumA; i++) {
            sum += scoreA[i];

        }
        meanA = sum / (float) studentNumA;
    }

    public void calcMeanB() {
        int sum = 0;
        for (int j = 0; j < studentNumB; j++) {
            sum += scoreB[j];

        }
        meanB = sum / (float) studentNumB;
    }

    public void calcMeanC() {
        int sum = 0;
        for (int k = 0; k < studentNumC; k++) {
            sum += scoreC[k];

        }
        meanC = sum / (float) studentNumC;
    }

    public void calcVarianceA() {
        float sum = 0;
        for (int i = 0; i < studentNumA; i++) {
            sum += Math.pow(scoreA[i] - meanA, 2);
        }
        varianceA = sum / (float) studentNumA;
    }

    public void calcVarianceB() {
        float sum = 0;
        for (int j = 0; j < studentNumB; j++) {
            sum += Math.pow(scoreB[j] - meanB, 2);
        }
        varianceB = sum / (float) studentNumB;
    }

    public void calcVarianceC() {
        float sum = 0;
        for (int k = 0; k < studentNumB; k++) {
            sum += Math.pow(scoreB[k] - meanB, 2);
        }
        varianceC = sum / (float) studentNumC;
    }

    public float getVarianceA() {
        return varianceA;
    }

    public float getVarianceB() {
        return varianceB;
    }

    public float getVarianceC() {
        return varianceC;
    }

    public void calcStdDeviationA() {
        stdDeviationA = (float) Math.sqrt(varianceA);
    }

    public void calcStdDeviationB() {
        stdDeviationB = (float) Math.sqrt(varianceB);
    }

    public void calcStdDeviationC() {
        stdDeviationC = (float) Math.sqrt(varianceC);
    }

    public float getStdDeviationA() {
        return stdDeviationA;
    }

    public float getStdDeviationB() {
        return stdDeviationB;
    }

    public float getStdDeviationC() {
        return stdDeviationC;
    }

    public void printScoresA() {
        int cnt = 1;

        for (int i = 0; i < studentNumA; i++) {
            System.out.printf("%4d\n", scoreA[i]);
            if (cnt % 10 == 0) {
                System.out.println("");
            }
        }

        cnt++;
    }

    public void printScoresB() {
        int cnt = 1;
        for (int j = 0; j < studentNumB; j++) {
            System.out.printf("%4d\n", scoreB[j]);
            if (cnt % 10 == 0) {
                System.out.println("");
            }
        }
        cnt++;
    }

    public void printScoresC() {
        int cnt = 1;
        for (int k = 0; k < studentNumC; k++) {
            System.out.printf("%4d\n", scoreC[k]);
            if (cnt % 10 == 0) {
                System.out.printf("");
            }
        }
        cnt++;
    }

}



public class Homework9 {
    public static void main(String[] args) {
//        오늘 풀었던 평균, 분산, 표준편차를 활용해서
//        점수 관리 시스템을 만들어보자!
//                학급을 3개 정도 만들고 랜덤한 점수를 준다.
//        평균이 가장 높은 학급,
//        표준편차가 가장 낮은 학급,
//        표준편차가 가장 큰 학급을 선별하도록 프로그래밍 해보자!
        scoreCalculatorA sc = new scoreCalculatorA
                (15, 15, 15);

        sc.calcMeanA();
        sc.calcMeanB();
        sc.calcMeanC();

        sc.calcVarianceA();
        sc.calcVarianceB();
        sc.calcVarianceC();

        sc.calcStdDeviationA();
        sc.calcStdDeviationB();
        sc.calcStdDeviationC();




        System.out.println("A 반의 평균은 = " + sc.getMeanA());
        System.out.println("B 반의 평균은 = " + sc.getMeanB());
        System.out.println("C 반의 평균은 = " + sc.getMeanC());
        System.out.println();


        System.out.println("A 반의 분산은 = " + sc.getVarianceA());
        System.out.println("B 반의 분산은 = " + sc.getVarianceB());
        System.out.println("C 반의 분산은 = " + sc.getVarianceC());
        System.out.println();

        System.out.println("A 반의 표준편차는 = " + sc.getStdDeviationA());
        System.out.println("B 반의 표준편차는 = " + sc.getStdDeviationB());
        System.out.println("C 반의 표준편차는 = " + sc.getStdDeviationC());



    }

}


