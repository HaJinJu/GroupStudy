package Sixth_Homework;

public class Fifth {
    public static void main(String[] args) {
//        5) 1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            if (arr[i] % 3 == 0) {
                System.out.printf("add[%d] = %d\n", i, arr[i]);
            }

        }
    }
}
