package Third;

public class Quiz5 {
    public static void main(String[] args) {
        // 피보나치 수열을 프로그래밍으로 구현해 보자 !
        // 구체적으로 13번째 항의 숫자를 구하도록 만들어 보자!
        //
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .......
        //
        // 힌트
        //
        // 1) 숫자가 올라가는 규칙을 찾아야 한다.
        // 2) 구현을 한다 했을 경우 while() 을 사용해야 함
        // 3) 첫 번째 더할 값, 두 번째 더할 값, 계산한 값의 변수가 3개 필요함

        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .......
        final int TARGET = 13;
        final int ALREADY = 2;

        int loop = 0;
        int first = 1, second = 1, res = 0;

        // first  second    res
        //   1       1       2
        //   1       2       3
        //   2       3       5
        //   3       5       8

        // 2는 왜 빼나요 ?
        // 첫 번재 항 + 두 번재 항 = 결과
        while (loop < TARGET - ALREADY) {
            res = first + second;
            first = second;
            second = res;

            loop++;
        }

        System.out.println("피보나치 수열 13번째 : " + res);
    }
}
// 1 1 2 3 5 8 13 21 34 55 89 144 233