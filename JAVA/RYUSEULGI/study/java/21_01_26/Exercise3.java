// 1 ~ 1000000 까지의 숫자에 아래 연산을 고속으로 적용해보도록 한다.
// 1 ~ 1000000 의 숫자는 표기상 n0 ... n1000000 으로 표기하겠다.
// nX * 0.0001 + n(X + 1) * 0.0002 + n(X + 2) * 0.0003 .....
// 위 계산의 결과를 빠르게 계산할 수 있도록 프로그래밍 해보자!

// 계산하려는 내용이 얼마나 걸렸는지 확인 하는 내용
// 현재시간 
// 진짜현재시간 - 현재시간 = 걸린시간 
public class Exercise3 {
    public static long startTime;
    public static long estimatedTime;

    public static void performanceCheckStart() {
        startTime = System.currentTimeMillis();
    }

    public static void performanceCheckEnd() {
        estimatedTime = System.currentTimeMillis() - startTime;
    }

    // 값을 가져오는 단위가 ms(1 / 1000 초)
    public static void printPerformance() {
        System.out.println("걸린 시간: " + estimatedTime / 1000.0 + " s");
    }
}

// static은 new를 사용하지 않기 위해
// 속도가 빨라진다