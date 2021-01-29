public class Quiz5 {
    public static void main(String[] args) {

//        1) 숫자가 올라가는 규칙을 찾아야 한다.
//        2) 구현을 한다 했을 경우 while() 을 사용해야함
//        3) 첫번째 더할값, 두번째 더할값, 계산한 값의 변수가 3개 필요함

        // 피보나치 수열을 프로그래밍으로 구현해보자!
        // 구체적으로 13번째 항의 숫자를 구하도록 만들어보자!
        //
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .......
        //
        // 힌트
        //
        // 1) 숫자가 올라가는 규칙을 찾아야 한다.
        // 2) 구현을 한다 했을 경우 while() 을 사용해야함
        // 3) 첫번째 더할값, 두번째 더할값, 계산한 값의 변수가 3개 필요함

        final int TARGET = 13;
        final int ALREADY = 2;
        int loop = 0;
        int first = 1, second = 1, res = 0;

//      first   second  res
//        1       1      2
//        1       2      3
//        2       3      5
//        3       5      8

//      2는 왜 빼나요?
//      첫번째 항 + 두 번째 항 = 결과

        while(loop < TARGET - ALREADY){
            res = first + second;
            first = second;
            second = res;


            loop++;
        }
        System.out.println("res = " + res);
    }
}
