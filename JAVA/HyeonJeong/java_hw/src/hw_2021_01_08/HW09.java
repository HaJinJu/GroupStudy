package hw_2021_01_08;


public class HW09 {
    public static void insertSort(float[] arr, int[] cn) {
        int i, j, classkey, len = arr.length;
        float array_of_key;

        for (i = 1; i < len; i++) {
            array_of_key = arr[i];
            classkey = cn[i];

            for (j = i - 1; (j != -1) && (arr[j] > array_of_key); j--) {
                arr[j + 1] = arr[j];
                cn[j + 1] = cn[j];
            }

            arr[j + 1] = array_of_key;
            cn[j + 1] = classkey;
        }
    }

    public static void print_max(Score_Calculator[] arr) {
        int len = arr.length;

        float[] class_average = new float[len];
        float[] class_standard_deviation = new float[len];
        int[] class_array = new int[len];

        for (int i = 0; i < len; i++) {
            class_array[i] = i + 1;
            class_average[i] = arr[i].get_class_average();
            class_standard_deviation[i] = arr[i].get_class_standard_deviation();
        }

        insertSort(class_average, class_array);
        System.out.printf("\n%d 반이 평균 최고점(%.2f)을 받았습니다.\n"
                , class_array[len - 1], class_average[len - 1]);

        for (int i = 0; i < len; i++) {
            class_array[i] = i + 1;
        }

        insertSort(class_standard_deviation, class_array);
        System.out.printf("\n%d 반이 표준편차 최저점(%.2f)을 받았습니다.\n"
                , class_array[0], class_standard_deviation[0]);
    }

    public static void main(String[] args) {
    final int CLASS_SIZE = 3;

    Score_Calculator[] score_array = new Score_Calculator[CLASS_SIZE];

    for(int i = 0; i < CLASS_SIZE; i++) {
        score_array[i] = new Score_Calculator();
        System.out.printf("\n%d 반\n", i + 1);
        score_array[i].print_scores();
        score_array[i].calculate_average();
        score_array[i].calculate_variance();
        score_array[i].calculate_standard_deviation();
        System.out.printf(
                "\n\n평균 = %.2f\n분산 = %.2f\n표준편차 = %.2f\n"
                ,score_array[i].get_class_average()
                ,score_array[i].get_class_variance()
                ,score_array[i].get_class_standard_deviation());
    }
    print_max(score_array);
    }
}


