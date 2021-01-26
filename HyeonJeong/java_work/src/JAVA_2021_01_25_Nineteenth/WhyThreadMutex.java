package JAVA_2021_01_25_Nineteenth;

class A extends Thread {
    public void run() {
        WhyThreadMutex.fb.pulsMoney(3000);
        System.out.println("plusMoney(3000): " +
                FailedBank.getMoney());
    }
}

class B extends Thread {
    public void run() {
        WhyThreadMutex.fb.minusMoney(1000);
        System.out.println("minusMoney(1000): " +
                FailedBank.getMoney());
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

        // 사실상 이문제를 해결하기 위해 도입해야 하는 것이
        // Lock Mechanism(Mutex, Semaphroe, Spinlock) 이다.
        // 이들은 결론적으로 지금 거론한 화장실 사용중을 표기하는 것이다.
        // 자바는  Spinlock 사용이 쉽지 않음
        // (일반적으로 스핀락 코드는 어셈블리어를 통해 구현됨)
    }
}
