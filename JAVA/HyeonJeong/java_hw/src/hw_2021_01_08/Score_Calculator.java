package hw_2021_01_08;

public class Score_Calculator {
    int number_of_student;
    int[] class_score;
    float class_average;
    float class_variance;
    float class_standard_deviation;

    public Score_Calculator() {
        // 학생수와 학급점수를 랜덤하게 설정할때
        this.number_of_student = (int)(Math.random() * 11) + 10;

        class_score = new int[number_of_student];

        for(int i = 0; i < number_of_student; i++) {
            class_score[i] = (int)(Math.random() * 61) + 40;
        }
    }

    public Score_Calculator(int number_of_student) {
        // 학생수는 지정, 학급점수만 랜덤하게 설정할때
        this.number_of_student = number_of_student;

        class_score = new int[number_of_student];

        for (int i = 0; i < number_of_student; i++) {
            class_score[i] = (int) (Math.random() * 61) + 40;
        }
    }

    public void calculate_average() {
        int score_sum = 0;

        for(int i = 0; i < number_of_student; i++) {
            score_sum += class_score[i];
        }
        class_average = score_sum / (float)number_of_student;
    }

    public float get_class_average() {
        return class_average;
    }

    public void calculate_variance() {
        float score_sum = 0;

        // sigma (샘플 - 평균)^2 / 전체숫자 = 분산
        for(int i = 0; i < number_of_student; i++) {
            //제곱
            score_sum += Math.pow(class_score[i] - class_average, 2);
        }
        class_variance = score_sum / (float)number_of_student;
    }

    public float get_class_variance() {
        return class_variance;
    }

    public void calculate_standard_deviation() {
        // 루트
        class_standard_deviation = (float)Math.sqrt(class_variance);
    }

    public float get_class_standard_deviation() {
        return class_standard_deviation;
    }

    public void print_scores() {
        int count = 1;

        for(int i = 0; i < number_of_student; i++) {
            System.out.printf("%4d", class_score[i]);

            if(count % 10 == 0) {
                System.out.println("");
            }

            count++;
        }
    }
}
