package Third;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // 1500이 입력되면 정지하는 시스템이 있다.
        // 입력값은 1000 ~ 2000 사이의 숫자다.
        // (아직 랜덤을 배우지 않았으므로 키보드 입력으로 처리한다)
        // 1470 이하의 값을 넣으면 후진
        // 1530 이상의 값을 넣으면 전진한다.
        // 1471 ~ 1529 전체가 정지 구간
        // 999 이하 정지, 2001 이상도 정지
        Scanner scan = new Scanner(System.in);

        System.out.print("제어 pwm을 입력하세요 : ");
        int pwm = scan.nextInt();

        System.out.println("당신이 입력한 pwm 값 : " + pwm);

        if (pwm > 2000) {            // pwm이 2000 보다 크다면
            System.out.println("잘못된 값 입력!");
        } else if (pwm >= 1530) {    // pwm이 1530 보다 크거나 같다면 && 2000 보다 작거나 같다면
            System.out.println("전진");
        } else if (pwm > 1470) {     // pwm이 1470 보다 크다면 && 1530 보다 작다면
            System.out.println("정지");
        } else if (pwm > 999) {      // pwm이 999 보다 크다면 && 1470 보다 작거나 같다면
            System.out.println("후진");
        } else {                    // pwm이 999 보다 작거나 같다면
            System.out.println("잘못된 값 입력!");
        }
    }
}