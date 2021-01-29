# 21 - 01 - 22 QuestionNote

### Code Review
***
Exercise4.java (main)
```java
final static int END = 1000000000;
final static int START = 1;
final static int MAX_THREAD_NUM = 5;
}
```
범위 설정을 위한 상수
```java
public static void main(String[] args) {
    Thread[] thr = new Thread[MAX_THREAD_NUM];

    for (int i = 0; i < MAX_THREAD_NUM; i++) {
        thr[i] = new Thread(new AccelThread(START, END, MAX_THREAD_NUM, i));
    }

    for (int i = 0; i < MAX_THREAD_NUM; i++) {
        thr[i].start();
    }
}
```
많은 양의 작업을 하나의 프로세스에서 처리하는 것은 효율적이지 않다.  
반복문의 범위를 나누어 스레드를 이용해 멀티 태스킹을 하면 더욱 빠른 처리를 할 수 있다.  
위 코드는 여러개의 스레드를 만들기 위해 스레드 배열을 만들어 실행한다.  
스레드를 몇 개 이용할 지 또는 범위를 쉽게 설정할 수 있다.  
***

AccelThread.java
```java
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

        int total = end - start + 1;                // (*)
        int threadPerData = total / maxThreadNum;   // (*)

        localStart = id * threadPerData + 1;        // (*)
        localEnd = localStart + threadPerData - 1;  // (*)
        threadId = id;
    }
}
```
작업에 사용할 상수를 선언하고 여러 변수들을 셋팅한다.  
(*)로 표시한 줄은 각 스레드마다 범위를 유동적으로 정해주는 변수이다.  
각 스레드에 id를 부여해 스레드 마다 정해진 범위를 나누어준다.

***

```java
public void run() {
    System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
    System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);

    PerformanceUtil. performanceCheckStart();

    for(int i = localStart; i <= localEnd; i++) {
        localSum += (i * (COEFFICIENT * i)) * Math.sin(i * Math.PI / DEF2RAD);
    }

    PerformanceUtil.performanceCheckEnd();

    PerformanceUtil.printPerformance();

    System.out.printf("threadId = %d, localSum = %f\n", threadId, localSum);
}
```
실제 스레드가 작동하는 부분  
굉장히 무거운 의문의 반복문이 실행된다.  
이때 반복문의 범위는 생성자에서 초기화된 각자의 범위로 반복문을 돌게된다.  
1개의 CPU가 할 일을 5개의 CPU가 하게 돼 처리속도가 굉장히 빨라졌다!  

```text
결과:

threadId = 1, localStart = 200000001
threadId = 4, localStart = 800000001
threadId = 4, localEnd = 1000000000
threadId = 3, localStart = 600000001
threadId = 3, localEnd = 800000000
threadId = 0, localStart = 1
threadId = 0, localEnd = 200000000
threadId = 2, localStart = 400000001
threadId = 2, localEnd = 600000000
threadId = 1, localEnd = 400000000
걸린 시간: 12.307 s
threadId = 0, localSum = 2146.721327
걸린 시간: 12.604 s
threadId = 3, localSum = -16209.342188
걸린 시간: 12.637 s
threadId = 1, localSum = -9117.696529
걸린 시간: 13.887 s
threadId = 4, localSum = -4389.213790
걸린 시간: 13.906 s
threadId = 2, localSum = 17128.065734

Process finished with exit code 0
```

## Question Note
LocalSum을 합친 TotalSum을 구하자.
  
전략:  
localSum을 모두 더하려면 각 스레드에 있는 각각의 localSum을 한 곳으로 모아야한다.  
그러기 위해 새로 배열을 만들어 run() 메서드에서 각각의 localSum을 한 배열에 모아 출력한다.  
  
Q: 각 스레드에 있는 데이터에 접근하는 방법을 모르겠습니다.  
Q: TotalSum을 구하려면 스레드르 배열로 