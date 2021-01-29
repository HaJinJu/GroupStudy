package SecondToFiveth;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // 시작 값과 끝나는 값을 입력받고 시작 값 ~ 끝 값 까지의 합을 출력해보자

        Scanner scan = new Scanner(System.in);

        System.out.println("시작 값을 입력해주세요");
        int start = scan.nextInt();

        System.out.println("끝 값을 입력해주세요");
        int last = scan.nextInt();

        int sum = 0;

        for (int i = start; i <= last; i++) {
            sum += i;
        }
        System.out.println("시작 값 ~ 끝 값 까지의 합 : " + sum);
    }
}
