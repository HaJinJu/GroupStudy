package Ninteenth;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            WhyThreadMutex.fb.plusMoney(3000);
        }

        System.out.println("plusMoney(3000): " +
                WhyThreadMutex.fb.getMoney());
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            WhyThreadMutex.fb.minusMoney(1000);
        }

        System.out.println("minusMoney(1000): " +
                WhyThreadMutex.fb.getMoney());
    }
}

public class WhyThreadMutex {
    public static FailedBank fb = new FailedBank();

    public static void main(String[] args) {
        System.out.println("원금: " + fb.getMoney());

        A a = new A();
        B b = new B();

        a.start();
        b.start();

        // 결과:
        // 원금: 100000
        // minusMoney(1000): 0
        // plusMoney(3000): 400000

        // 원금 100000원에서 fb의 머니를 300000원 plus하고
        // 100000원 minus 한 결과는 당연히 300000원이 나와야 정상이다.
        // 그러나 결과는 위와 같다. (대표적 동기화 문제)
        // 왜 그럴까?
        // * Critical Section:
        // 동시에 여러 태스크가 접근할 수 있는 변수 영역을
        // 모두 통틀어 Critical Section이라 부른다.

        // * Multi Tasking
        // 실제로 하나 하나 수행하지만 동시에 되는 것처럼 보이는 현상

        // 하지만, 여러개의 CPU를 활용하는 상태에서의
        // Multi Tasking은 스레드를 사용할 때 각별히 주의해야 한다.
        // 실제로 Data Dependency가 없다면
        // CPU는 두 개의 연산을 정말로 동시에 실행하게 된다.
        // 문제는 CPU는 DD를 검사할 뿐
        // 그것의 논리 오류는 검사하지 않는다는 것이다.

        // 실제 코드상의 int m = getMoney(); 가
        // 서로 일치하지 않는 현상이 발생할 수 있다는 뜻
        // 저것이 money 변수로 실제 공유되는
        // Critical Section 이라는 것도 상기하자!

        //           ++                       --
        //        Thread A                 Thread B
        //                       1000
        //                  Shared Variable

        // 1) A가 SV에 접근해서 1000을 획득한다.
        // 2) 연산을 수행하고 1001이 된다.
        // 3) B가 SV에 접근해서 1001을 획득하려고 하는 도중이다.
        // 4) A가 SV에 접근해서 1001을 획득한다.
        // 5) A가 연산을 끝내고 1002가 된다.
        // 6) B가 1001 획득을 완료한다.
        // 7) B가 연산을 끝내고 1000이 된다.
        // 8) A가 1000을 획득한다. ??? 뭐지 ?

        // 이것을 또 다르게는 Race Condition 이라고도 부른다.

        // 사실상 이 문제를 해결하기 위해 도입해야하는 것이
        // Lock Mechanism (Mutex, Semaphore, Spinlock)이다.
        // 자바는 스핀락 사용이 쉽지 않음
        // (일반적으로 스핀락 코드는 어셈블리어를 통해 구현됨)

        // 화장실 예시:
        // 화장실이 하나 있고 사람 A, B 가 있다고 가정해보자.
        // A 가 화장실을 이용하고 있는데 B 가 막무가내로 들어와
        // 자기가 이용하겠다고 하는것 - Critical Section
        // 이를 해결하기 위해선 화장실을 잠구거나 다른 화장실로 갈 수 있으면 된다.
        // 그것이 Lock Mechanism 이다.
    }
}
