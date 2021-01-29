package Twentieth;

public class Quiz3 {
    //1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.
    //               1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.
    //               nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....
    //               위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해보자!
    final static int ZERO = 0;
    final static int END = 1000000;
    final static int START = 1;
        public static void main(String[] args) {
        double sum = ZERO;

        PerformanceUtil.performanceCheckStart();

        for(int i = START; i <= END; i++) {
            sum += i*(0.0001*i);
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.println("sum = " + sum);

        PerformanceUtil.printPerformance();
    }
}
