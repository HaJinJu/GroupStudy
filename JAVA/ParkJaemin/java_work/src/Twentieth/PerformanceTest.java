package Twentieth;

public class PerformanceTest { // 싱글쓰레드
    public static void main(String[] args) {
        double sum = 0; // 더블 합계 초기화

        PerformanceUtil.performanceCheckStart(); //시작시간

        for(int i = 1; i <= 1000000000; i++) { // 10억번 돌리기
            sum += (i * (Math.pow(10, -15) * i)) * Math.sin(i * Math.PI / 180.0);
        }

        PerformanceUtil.performanceCheckEnd(); // 끝나는 시간

        System.out.println("sum = " + sum); // 더블 타입 sum 값 출력

        PerformanceUtil.printPerformance(); // 걸린시간
    }
}
