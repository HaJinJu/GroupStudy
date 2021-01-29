package SecondToFiveth;

public class ShiftOperator {
    public static void main(String[] args) {
        System.out.println("쉬프트 연산자 예제");

        // final 이란 무엇인가? 값을 고정시키는 역할을 수행한다.
        // 그런데 왜 값을 고정할까?
        // 매직 넘버
        // 공장에는 생산라인이 5개 있다.
        // 사업을 따내서 생산라인이 8개가 되었다.
        // 결국 유지 보수를 편하게 하기 위해 사용한다.

        final int SCALE_FACTOR1 = 2;
        final int SCALE_FACTOR2 = 3;
        final int SCALE_FACTOR3 = 1;
        int num = 10, num2 = 5;

        // 쉬프트 연산도 2진수와 연결이 된다.
        // 숫자 10 - 0000 1010을 왼쪽 쉬프트로 2칸 이동한다.
        // 결과 40 - 0010 1000이 된다.
        System.out.println("10 << 2 = " + (num << SCALE_FACTOR1));
        // 2칸 올라올때 빈 공간은 0으로 채워지고
        // 넘치는 공간은 버린다.
        // 3칸 이동
        // 결과 80 - 0101 0000이 된다.
        // 쉬프트 한 칸당 2의 n승이 곱해지는 것을 볼 수 있다.
        System.out.println("10 << 3 = " + (num << SCALE_FACTOR2));
        // 숫자 5 - 0000 0101 이며 오른쪽으로 1칸 이동한다.
        // 결과 2 - 0000 0010 이 된다.
        // 우리가 예상한 것은 2.5이지만 실제로 2가 나왔다.
        // 이유는 쉬프트 연산이 정수에서만 가능하기 때문이다.
        // 주의점: 곱셈은 2의n을 곱하면 되지만 나눗셈의 경우엔 나머지를 버리고 몫만 취한다.
        System.out.println("5 << 1 = " + (num2 >> SCALE_FACTOR3));

        // 쉬프트에 의해 데이터가 사라지는 것을 확인할 수 있는 예
        // 원래는 5 << 1과 같기 때문에 10이 나와야 하지만
        // 먼저 계산된 괄호속의 쉬프트 연산에서 데이터가 사라져서 88이 나오는 것을 확인할 수 있다.
        System.out.println("(5 >> 1) << 2 = " +
                ((num2 >> SCALE_FACTOR3) << SCALE_FACTOR1));
    }
}