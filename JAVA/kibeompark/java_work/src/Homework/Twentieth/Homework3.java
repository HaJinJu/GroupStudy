package Homework.Twentieth;

class ThreadTest implements Runnable {
    private static double totalSum = 0;
    private static int count = 0;

    private int total, alloc, threadId;
    private int localStart, localEnd;
    private double localSum;

    public ThreadTest(int start, int end, int cnt, int id) {
        total = end - start + 1;
        alloc = total / cnt;
        threadId = id;

        localStart = start + alloc * id;
        localEnd = localStart + alloc - 1;

        localSum = 0;
    }

    @Override
    public void run() {
        for (int i = localStart; i <= localEnd; i++) {
            localSum += i * (0.0001 * i);
        }

        totalSum += localSum;

        System.out.printf("threadId = %d, localStart = %6d, localEnd = %7d, " +
                        "localSum = %f, totalSum = %f\n",
                threadId, localStart, localEnd, localSum, totalSum);
    }

    public static double getTotalSum() {
        return totalSum;
    }
}

public class Homework3 {
    final static int THREADNUM = 5;

    public static void main(String[] args) {
        // 3. 1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.
        //    1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.
        //    nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....
        //    위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해 보자 !
        Thread[] t = new Thread[THREADNUM];

        for (int i = 0; i < THREADNUM; i++) {
            t[i] = new Thread(new ThreadTest(1, 1000000, THREADNUM, i));
        }

        // 미완성 -> 해결 ? (결과는 나오나 코딩이 적절한지는 ...)
        // totalSum 출력문이 스레드 실행 결과들 나오는 중간에 출력되어
        // 실행할 때마다 맞았다 틀렸다 답이 바뀜
        // 스레드의 실행이 끝날 때까지 기다리는 방법 ?
        PerformanceUtil.performanceCheckStart();

        for (int i = 0; i < THREADNUM; i++) {
            t[i].start();
        }

        // 검색 결과 join() 은 스레드가 종료되기를 기다리는 메서드
        // 괄호 안에 0을 넣으면 무한정 기다림
        try {
            for (int i = 0; i < THREADNUM; i++) {
                t[i].join(0);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PerformanceUtil.performanceCheckEnd();

        System.out.printf("\ntotalSum = %f\n", ThreadTest.getTotalSum());

        PerformanceUtil.printPerformance();
/*
        double sum = 0;

        for (int i = 1; i <= 1000000; i++) {
            sum += i * 0.0001 * i;
        }

        System.out.printf("sum = %f\n", sum);
 */
    }
}
