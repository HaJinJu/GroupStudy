package Twentieth;

public class AccelThread extends OperationAccelerator implements Runnable {
    final double COEFFICIENT = Math.pow(10, -15);
    final double DEF2RAD = 180.0;

    private int localStart;
    private int localEnd;
    private int threadId;
    private double localSum;

    private int maxThreadNum;

    public AccelThread(int start, int end, int maxThreadNum, int id) {
        super(start, end, maxThreadNum);

        this.maxThreadNum = maxThreadNum;

        int total = end - start + 1;
        int threadPerData = total / maxThreadNum;

        localStart = id * threadPerData + 1;
        localEnd = localStart + threadPerData - 1;
        threadId = id;

    }

    public void calcSum() {
        for (int i = localStart; i <= localEnd; i++) {
            localSum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEF2RAD);
        }
    }

    public void run() {

        System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
        System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);

        PerformanceUtil. performanceCheckStart();

        calcSum();

        PerformanceUtil.performanceCheckEnd();

        PerformanceUtil.printPerformance();

        System.out.printf("threadId = %d, localSum = %f\n", threadId, localSum);
    }
}
