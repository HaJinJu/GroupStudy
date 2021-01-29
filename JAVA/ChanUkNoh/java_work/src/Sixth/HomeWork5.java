package Sixth;

public class HomeWork5 {
    public static void main(String[] args) {
        // 5 - 1) 1 ~ 100 까지의 숫자중 3의 배수만 출력해보자!
        // 5 - 2) 5 - 1 값들을 배열에 저장하고 출력해보자!

        int dividedNum = 100 / 3;

        int[] oddNum = new int[dividedNum];
        int j = -1;
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                j += 1;
                while (j <= dividedNum) {
                    oddNum[j] = i;
                    System.out.printf("oddNum[%d] = %d\n", j, oddNum[j]);
                    break;
                }
            }
        }
    }
}
