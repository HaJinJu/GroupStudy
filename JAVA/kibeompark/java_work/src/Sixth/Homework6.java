package Sixth;

public class Homework6 {
    public static void main(String[] args) {
        System.out.print("1 ~ 100 까지의 숫자 중 3의 배수 :");

        int i, cnt = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) cnt++;
        }

        int[] arr = new int[cnt];

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                arr[(i / 3) - 1] = i;
                System.out.print(" " + arr[(i / 3) - 1]);
            }
        }
    }
}
