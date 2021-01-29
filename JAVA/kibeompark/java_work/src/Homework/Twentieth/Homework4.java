package Homework.Twentieth;

class AccelThread implements Runnable {
    static double totalSum = 0;

    private int total, alloc, threadId;
    private int localStart, localEnd;
    private double localSum;

    public AccelThread(int start, int end, int num, int id) {
        total = end - start + 1;
        alloc = total / num;
        threadId = id;

        localStart = start + alloc * id;
        localEnd = localStart + alloc - 1;

        localSum = 0;
    }

    @Override
    public void run() {
        for (int i = localStart; i <= localEnd; i++) {
            localSum += i * (Math.pow(10, -15) * i) * Math.sin(i * Math.PI / 180.0);
        }

        totalSum += localSum;

        System.out.printf("threadId = %d, localStart = %9d, localEnd = %10d, " +
                        "localSum = %13f, totalSum = %13f\n",
                threadId, localStart, localEnd, localSum, totalSum);
    }
}

public class Homework4 {
    static int THREADNUM = 10;

    public static void main(String[] args) {
        // 4. 1 ~ 10억 번의 루프를 돈다.
        //    위의 숫자는 표기상 n0 ... n1000000000 으로 표기하도록 한다.
        //    아래 코드를 for 문으로 돌리고 thread를 활용하여 성능을 개선해 보자 !
        //
        //    nX * [Math.pow(10, -15) * nX] * sin( nX * pi / 180 ) +
        //    n(X + 1) * [Math.pow(10, -15) * n(X + 1)] * sin( n(X + 1) * pi / 180 ) +
        //    .......
        //
        //    4-1) 전체 데이터를 몇 명에게 몇 개씩 나눌 것인가 ?
        //    4-2) 실질적인 연산을 수행하는데 있어서
        //         데이터 종속성(Data Dependency)가 없는가 확인한다.
        //         (현재 케이스에서는 일부러 없게 만듦)
        //    4-3) 만약 데이터 종속성이 있다면 수식을 변형하여 종속성이 없게 만들고 작업을 한다.
        //    4-4) 스레드를 만들어서 분할 처리를 하도록 프로그래밍 한다.
        Thread[] t = new Thread[THREADNUM];

        for (int i = 0; i < THREADNUM; i++) {
            t[i] = new Thread(new AccelThread(1, 1000000000, THREADNUM, i));
        }

        // 미완성 -> 해결 ? (결과는 나오나 코딩이 적절한지는 ...)
        // 결과가 출력되기도 전에 totalSum과 걸린 시간이 출력됨
        // -> totalSum이 스레드 내에서는 계산되는 것 같지만
        //    스레드 실행을 시작하자마자 for 문이 끝나고 아래가 실행되며 0으로 나옴
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

        System.out.printf("\ntotalSum = %f\n", AccelThread.totalSum);

        PerformanceUtil.printPerformance();
    }
}
