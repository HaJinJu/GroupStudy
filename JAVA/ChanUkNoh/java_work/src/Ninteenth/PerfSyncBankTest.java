package Ninteenth;

class X extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {

            // 이전 케이스는 메서드에 synchronized 를 해서
            // 동기화할 필요가 없는 코드들도 동기화했다.
            // 하지만 이 경우 필요한 코드에만 동기화했기 때문에
            // 좀더 디테일한 동기화이다.
            // 현재의 경우 로직이 단순하고 입/출력이 없어
            // 큰차이가 없지만 로직이 복잡해지고 입/출력이
            // 많아지면 성능차이가 월등히 좋아진다.
            synchronized (PerfSyncBankTest.psb) {
                PerfSyncBankTest.psb.plusMoney(3000);
            }
        }

        System.out.println("plusMoney(): " +
                PerfSyncBankTest.psb.getPlusMsg());
    }
}

class Y extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {

            // synchronized 로 코드를 감싸 특정 코드만
            // 동기화할 수 있다.

            // synchronized (객체) { 본문 };
            synchronized (PerfSyncBankTest.psb) {
                PerfSyncBankTest.psb.minusMoney(1000);
            }
        }

        System.out.println(PerfSyncBankTest.psb.getMinusMsg());
    }
}

public class PerfSyncBankTest {
    public static PerfSyncBank psb = new PerfSyncBank();

    public static void main(String[] args) {
        System.out.println("원금: " + psb.getMoney());

        X x = new X();
        Y y = new Y();

        x.start();
        y.start();
    }
}
