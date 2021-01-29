package SecondToFiveth;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {

//        1500이 입력되면 정지하는 시스템이 있다.
//                입력값은 1000 ~ 2000 사이의 숫자다.
//        (아직 랜덤을 배우지 않았으므로 키보드 입력으로 처리한다)
//        1470 이하의 값을 넣으면 후진
//        1530 이상의 값을 넣으면 전진한다.
//        이를 if 문과 Scanner를 통해 구현해보자!

        Scanner scan = new Scanner(System.in);

        System.out.println("제어 pwm을 입력하세요");
        int pwm = scan.nextInt();

        System.out.println("당신이 입력한 pwm 값: " + pwm);

        if (pwm > 2000) {
            System.out.println("wrong number");
        } else if(pwm > 1529) {
            System.out.println("전진");
        } else if(pwm > 1470) {
            System.out.println("정지");
        } else if(pwm > 999) {
            System.out.println("후진");
        } else {
            System.out.println("wrong number");
        }
    }
}
