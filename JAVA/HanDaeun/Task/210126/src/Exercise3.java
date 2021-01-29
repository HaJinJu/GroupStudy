/*
    < 연습 문제 3 >
1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.
1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.
nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....
위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해보자!
*/


// 차이가 크지 않아 연산 횟수를 바꿨습니다.
class Calculator1 extends Thread {
    @Override
    public void run() {
        Exercise3.ro.calcFormula(1, 50000000);
        System.out.println("sum = " + Exercise3.ro.getSum());
    }
}

class Calculator2 extends Thread {
    @Override
    public void run() {
        Exercise3.ro.calcFormula(50000001, 100000000);
        System.out.println("sum = " + Exercise3.ro.getSum());
    }
}

public class Exercise3 {
    public static CalculateFormula ro = new CalculateFormula();

    public static void main(String[] args) {
        PerformanceUtil.performanceCheckStart();

        // 비교용
        //ro.calcFormula(1, 100000000);
        //System.out.println("sum = " + ro.getSum());

        Calculator1 c1 = new Calculator1();
        Calculator2 c2 = new Calculator2();

        c1.start();
        c2.start();

        PerformanceUtil.performanceCheckEnd();

        PerformanceUtil.printPerformance();
    }
}