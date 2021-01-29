package Ninteenth;

class C extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            SynchronizedBankTest.sb.plusMoney(3000);
        }
        System.out.println("plusMoney(3000): " +
                SynchronizedBankTest.sb.getMoney());
    }
}

class D extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            SynchronizedBankTest.sb.minusMoney(1000);
        }
        System.out.println("minusMoney(1000): " +
                SynchronizedBankTest.sb.getMoney());
    }
}

public class SynchronizedBankTest {
    public static SynchronizedBank sb = new SynchronizedBank();

    public static void main(String[] args) {
        System.out.println("원금: " + sb.getMoney());

        C c = new C();
        D d = new D();

        c.start();
        d.start();
    }

    // 결과:
    // 원금: 100000
    // m = 100000    plus(3000)
    // m = 103000    plus(3000)
    // m = 106000    plus(3000)
    //    ...        plus(3000)
    //    ...        plus(3000)
    //    ...        plus(3000)
    // m = 25960000  plus(3000)
    // m = 25963000  plus(3000)
    // m = 25966000  plus(3000)
    // m = 25965000  minus(1000)
    // m = 25964000  minus(1000)
    // m = 25963000  minus(1000)
    //    ...        minus(1000)
    //    ...        minus(1000)
    //    ...        minus(1000)
    // m = 20102000  minus(1000)
    // m = 20101000  minus(1000)
    // minusMoney(1000): 20100000

    // 위 결과를 보면 synchronized 키워드를 메서드에 넣어주면
    // 강제로 Thread 간의 순서를 조정해줄 수 있다.
    // 그러므로 서로 화장실 들어가겠다고 싸우는
    // Race Condition을 무마할 수 있다.
}
