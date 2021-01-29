package Second;

import java.util.Scanner;

public class SecondProbTest {
    public static void main(String[] args) {
        // 변수란 ?
        // 1. 값을 받는 것
        // 엄밀한 정의 : 특정한 데이터 타입을 저장할 수 있는 메모리 공간
        // 너프한 정의 : 특정한 데이터 타입을 저장할 수 있는 공간

        // 입력 받은 숫자가 2의 배수인지 판별해보자 !
        // 아래 보이는 Scanner scan = new Scanner(System.in)
        // 이 전체가 scan이라는 변수를 통해서
        // 키보드 입력을 받을 것임을 알려주는 것
        Scanner scan = new Scanner(System.in); // 준비 과정
        // new Scanner(System.in) 을 통해 실제 키보드 정보를 획득

        System.out.print("숫자를 입력하세요 : ");

        // 키보드 입력에 대한 처리는 아래 코드에서 수행합니다.
        // scan.nextInt() 실제 키보드 입력을 처리하는 부분

        // '=' 은 ~~과 같다가 아닌 대입 연산임을 명심하자!
        int num = scan.nextInt();

        System.out.println("입력 결과는 = " + num);

        // num % 2
        // % 연산자는 나머지를 구하는 연산자
        // num % 2 는 'num을 2로 나눈 나머지를 구해주세요'.
        // 어떤 수를 2로 나눈 나머지는 0 혹은 1 뿐이다.
        // 여기서 나머지가 0이란 뜻은 2로 나누어 떨어진다는 뜻이며
        // 2로 나누어 떨어진다면 이 값은 짝수임을 알 수 있다.
        // 나머지가 0이 아니라 1인 상황은 홀수일 것이다.

        // '==' 은 앞의 것과 뒤의 것이 같은지 질문을 하는 것이다.
        // 질문에 답이 맞다면 true(1), 아니라면 false(0)
        // num을 2로 나눈 나머지가 0이 맞나요 ?
        // else는 if에 대한 조건이 맞지 않을 경우 사용한다.
        // else가 동작하는 시점은 if의 괄호에 있는 조건이
        // 거짓(false)가 되었을 경우에 동작하게 된다.
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}