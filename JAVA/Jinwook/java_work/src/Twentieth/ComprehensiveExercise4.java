package Twentieth;

public class ComprehensiveExercise4 {
    //  4. 1 ~ 10억번의 루프를 돈다.
    //               위의 숫자는 표기상 n0 ... n1000000000 으로 표기하도록 한다.
    //               아래 코드를 for 문으로 돌리고 thread를 활용하여 성능을 개선해보자!
    //               nX * [Math.pow(10, -15) * nX] * sin( nX * pi / 180 ) +
    //               n(X+1) * [Math.pow(10, -15) * n(X+1)] * sin( n(X+1) * pi / 180 ) +
    //               ......
    //            4-1) 전체 데이터를 몇 명에게 몇 개씩 나눌 것인가 ?
    //            4-2) 실질적인 연산을 수행하는데 있어서
    //                 데이터 종속성(Data Dependency)가 없는가 확인한다.
    //                 (현재 케이스에서는 일부로 없게 만듬)
    //            4-3) 만약 데이터 종속성이 있다면 수식을 변형하여 종속성이 없게 만들고 작업을 한다.
    //            4-4) 스레드를 만들어서 분할 처리를 하도록 프로그래밍 한다.
    //         */
    //
    //        double sum = 0;
    //
    //        for(int i = 1; i <= 1000000000; i++) {
    //            sum += (i * (Math.pow(10, -15) * i)) * Math.sin(i * Math.PI / 180.0);
    //        }
    //
    //        System.out.println("sum = " + sum);
    //    }
    //}

    final static int ZERO = 0;
    final static int END = 1000000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    final static int MAXTHREAD = 8;

    public static void main(String[] args) throws InterruptedException {
        double sum = ZERO;

        Thread[] thr = new Thread[MAXTHREAD];

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i] = new Thread(new AccelThread(START, END, MAXTHREAD, i));
        }

        PerformanceUtil.performanceCheckStart();

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].start();
            // sum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEG2RAD);
        }

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].join();
        }

        PerformanceUtil.performanceCheckEnd();
        PerformanceUtil.printPerformance();
    }
}
