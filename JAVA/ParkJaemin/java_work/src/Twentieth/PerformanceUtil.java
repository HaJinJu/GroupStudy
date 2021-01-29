package Twentieth;

public class PerformanceUtil {
    public static long startTime; // 시작시간
    public static long estimatedTime; // 측정시간

    public static void performanceCheckStart() {
        startTime = System.currentTimeMillis();
    }
    // System.currentTimeMillis : long 값으로 리턴, 1/1000초 값을 리턴 

    public static void performanceCheckEnd() {
        estimatedTime = System.currentTimeMillis() - startTime;
    }
    // 측정(걸린시간)시간 = 실행시간 - 시작시간

    // 값을 가져오는 단위가 ms(1 / 1000 초)
    public static void printPerformance() {
        System.out.println(
                "걸린 시간: " + estimatedTime / 1000.0 + " s");
    }
}
