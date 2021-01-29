package Second;

public class BitOperation {
    public static void main(String[] args) {
        System.out.println("비트 연산자 예제입니다.");

        int num1 = 5, num2 = 10;

        // &은 비트 연산자 AND를 의미함
        // AND 비트 연산의 특징 :
        // 같은 자리수에 1이 배치된 경우에만 1이며
        // 그 외의 케이스는 모두 0이다.
        // 집합으로 생각한다면 교집합
        int res = num1 & num2;
        System.out.println("num1 AND num2 = " + res);

        // |는 비트 연산자 OR를 의미함
        // OR 비트 연산의 특징 :
        // 같은 자리수에 하나라도 1이 배치되어 있다면 1이고
        // 그렇지 않다면 0이 된다.
        // 집합으로 생각한다면 합집합
        res = num1 | num2;
        System.out.println("num1 OR num2 = " + res);

        // ^는 비트 연산자 XOR를 의미함
        // XOR 비트 연산의 특징 :
        // 서로 일치하는 것이 없는 경우에만 1이 된다.
        res = num1 ^ num2;
        System.out.println("num1 XOR num2 = " + res);

        // ~은 비트 연산자 NOT을 의미함
        // NOT 비트 연산의 특징 :
        // 모든 것을 부정한다.
        // 참의 부정 = 거짓
        // 거짓의 부정 = 참
        res = num1;
        System.out.println("NOT num1 = " + res);
    }
}