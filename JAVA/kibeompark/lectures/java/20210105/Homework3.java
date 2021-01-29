package Fifth;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // 시작 값을 입력 받도록 하고
        // 끝 값을 입력 받도록 만들어서
        // 시작 ~ 끝까지의 합을 출력해 보자 !
        Scanner scan = new Scanner(System.in);

        System.out.print("시작 값을 입력하세요. ");
        int start = scan.nextInt();

        System.out.print("끝 값을 입력하세요. ");
        int end = scan.nextInt();

        int i, sum = 0;

        for (i = start; i <= end; i++) {
            sum += i;
        }

        System.out.printf("%d ~ %d 까지의 합 = %d\n", start, end, sum);
    }
}
