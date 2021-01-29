package SecondToFiveth;

import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int num = scan.nextInt();

        // && 논리 연산자 AND
        // 논리 연산자 AND는 두 개의 조건이 모두 참인 경우에만 참이다.

        if((num % 2 == 0) && (num % 3 == 0)) {
            // 2의 배수이면서 3의 배수인가? = 6의 배수인가?
            // 두 조건이 모두 참이면 본문을 실행한다.
            System.out.println(num + "은 6의 배수다!");
        } else {
            System.out.println(num + "은 6의 배수가 아니다!");
        }

        // || 논리 연산자 OR
        // 둘 중 하나라도 참이라면 참
        if((num % 2 == 0) || (num % 3 == 0)) {
            System.out.println(num + "은 2혹은 3의 배수다!");
        } else {
            System.out.println(num + "은 2혹은 3의 배수가 아니다!");
        }

        // ! 논리 연산자 NOT
        // 결과 자체를 부정한다.
        if(!(num % 2 == 0)) {
            System.out.println(num + "은 2의 배수가 아니다!");
        } else {
            System.out.println((num + "은 2의 배수다!"));
        }
    }
}
