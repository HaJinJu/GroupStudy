package hw_2021_01_06;

public class HW05 {
    public static void main(String[] args) {
        // 1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!

        final int A_HUNDRED = 100;

        for(int i = 1; i < A_HUNDRED; i++) {
            if(i % 3 == 0) {
                System.out.printf("%d = 3의 배수\n",i);
            }
        }

    }

}
